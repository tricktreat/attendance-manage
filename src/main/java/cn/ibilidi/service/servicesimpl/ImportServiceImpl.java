package cn.ibilidi.service.servicesimpl;

import cn.ibilidi.AllException.AllException;
import cn.ibilidi.entity.*;
import cn.ibilidi.enums.ResultEnum;
import cn.ibilidi.mapper.ExcelMapper;
import cn.ibilidi.mapper.TBXkMapper;
import com.alibaba.fastjson.JSON;
import cn.ibilidi.service.IImportService;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/1/11.
 */
@Service
public class ImportServiceImpl implements IImportService {

  private final static String XLS = "xls";
  public static final String XLSX = "xlsx";

    private final static Logger logger = LoggerFactory.getLogger(ImportServiceImpl.class);

    @Autowired private TBXkMapper tbXkMapper;

    @Autowired private SqlSessionTemplate sqlSessionTemplate;

    @Autowired private ExcelMapper excelMapper;

    @Override
    public Integer importExcel(MultipartFile myFile,int flag) {
        //1.  使用HSSFWorkbook 打开或者创建 “Excel对象”
        //2.  用HSSFWorkbook返回对象或者创建sheet对象
        //3.  用sheet返回行对象，用行对象得到Cell对象
        //4.  对Cell对象进行读写

        Workbook workbook = null;
        String fileName = myFile.getOriginalFilename();//  获取文件名
        logger.info("【fileName】{}",fileName);
        if (fileName.endsWith(XLS))
        {
            try {
                workbook = new HSSFWorkbook(myFile.getInputStream());//  2003版本

            } catch (IOException e) {
                e.printStackTrace();
            }
        }else if(fileName.endsWith(XLSX)){
            try {
                workbook = new XSSFWorkbook(myFile.getInputStream());//  2007版本
            } catch (IOException e) {
                e.printStackTrace();
            }
        }else{
            throw new AllException(ResultEnum.FILE_IS_NOT_EXCEL); // 文件不是Excel文件
        }
        Sheet sheet = workbook.getSheet("sheet1");
        int rows = sheet.getLastRowNum();
        logger.info("【rows】{}",rows);
        if(rows == 0){
            throw  new AllException(ResultEnum.DATA_IS_NULL);// 数据为空 请填写数据
        }

        if(flag==0){
            List<TBXk> tbXkList = new ArrayList<>();
            List<TBKc> tbkcList=new ArrayList<>();
            List<TBXs> tbXsList=new ArrayList<>();
            List<TBJs> tbJsList=new ArrayList<>();
            List<TBUser> tbUserList=new ArrayList<>();

            for(int i = 1;i<= rows;i++){
                Row row = sheet.getRow(i);
                TBXk tbXk = new TBXk();
                TBKc tbKc=new TBKc();
                TBXs tbXs=new TBXs();
                TBJs tbJs=new TBJs();

                if(row !=null){
                    //  课程号
                    String kch = getCellValue(row.getCell(0));
                    //  课程名称
                    String kcmc = getCellValue(row.getCell(1));
                    //  学号
                    String  xh = getCellValue(row.getCell(2));
                    // 学生姓名
                    String xsxm = getCellValue(row.getCell(3));
                    // 教师工号
                    String gh = getCellValue(row.getCell(4));
                    // 教师姓名
                    String jsxm = getCellValue(row.getCell(5));
                    // 上课时间
                    String sksj = getCellValue(row.getCell(6));
                    // 上课地点
                    String skdd = getCellValue(row.getCell(7));
                    // 年级
                    String nj = getCellValue(row.getCell(8));
                    // 专业
                    String zy = getCellValue(row.getCell(9));
                    // 班级
                    String bj = getCellValue(row.getCell(10));

                    if(StringUtils.isEmpty(kcmc)) {
                        continue;
                    }

                    //选课信息
                    tbXk.setKch(kch);
                    tbXk.setKcmc(kcmc);
                    tbXk.setId(xh);
                    tbXk.setName(xsxm);

                    //学生信息
                    tbXs.setBj(bj);
                    tbXs.setId(xh);
                    tbXs.setName(xsxm);
                    tbXs.setNj(nj);
                    tbXs.setZy(zy);

                    //老师信息
                    tbJs.setJsh(gh);
                    tbJs.setJsxm(jsxm);

                    //课程信息
                    tbKc.setJsh(gh);
                    tbKc.setJsxm(jsxm);
                    tbKc.setKch(kch);
                    tbKc.setKcmc(kcmc);
                    tbKc.setSkdd(skdd);
                    tbKc.setSksj(sksj);


                    if(!tbJsList.contains(tbJs)){
                        tbJsList.add(tbJs);
                    }
                    if (!tbXsList.contains(tbXs)){
                        tbXsList.add(tbXs);
                    }
                    if(!tbXkList.contains(tbXk)){
                        tbXkList.add(tbXk);
                    }
                    if(!tbkcList.contains(tbKc)){
                        tbkcList.add(tbKc);
                    }
                }
            }
            for (TBXs tbxs:tbXsList) {
                tbUserList.add(new TBUser(tbxs.getId(),tbxs.getName()));
            }
            for (TBJs tbJs:tbJsList) {
                tbUserList.add(new TBUser(tbJs.getJsh(),tbJs.getJsxm()));
            }
            excelMapper.batchXkInsert(tbXkList);
            excelMapper.batchJsInsert(tbJsList);
            excelMapper.batchKcInsert(tbkcList);
            excelMapper.batchXsInsert(tbXsList);
            excelMapper.batchUserInsert(tbUserList);
        }

        if (flag==1){
            List<TBGlkc> tbGlkcList=new ArrayList<>();

            for (int i=1;i<=rows;i++){

                Row row = sheet.getRow(i);

                if (row!=null){
                    //  课程号
                    String kch = getCellValue(row.getCell(0));
                    //  学号
                    String xh = getCellValue(row.getCell(1));
                    TBGlkc tbGlkc=new TBGlkc();
                    tbGlkc.setKch(kch);
                    tbGlkc.setXh(xh);
                    if(!tbGlkcList.contains(tbGlkc)){
                        tbGlkcList.add(tbGlkc);
                    }
                }
            }
            excelMapper.batchGlkcInsert(tbGlkcList);
        }

        return rows;
    }

    public String getCellValue(Cell cell) {
        String value = "";
        if (cell != null) {
            switch(cell.getCellType()){
                case HSSFCell.CELL_TYPE_NUMERIC:// 数字
                     value = cell.getNumericCellValue()+ " ";
                    if(HSSFDateUtil.isCellDateFormatted(cell)){
                        Date date = cell.getDateCellValue();
                        if(date != null){
                            value = new SimpleDateFormat("yyyy-MM-dd").format(date); //  日期格式化
                        }else{
                           value = "";
                        }
                    }else {
                        //  解析cell时候 数字类型默认是double类型的 但是想要获取整数类型 需要格式化
                        value = new DecimalFormat("0").format(cell.getNumericCellValue());
                    }
                    break;
                case HSSFCell.CELL_TYPE_STRING: //  字符串
                    value = cell.getStringCellValue();
                    break;
                case HSSFCell.CELL_TYPE_BOOLEAN:   //  Boolean类型
                    value = cell.getBooleanCellValue()+"";
                    break;
                case HSSFCell.CELL_TYPE_BLANK:   // 空值
                    value = "";
                    break;
                case HSSFCell.CELL_TYPE_ERROR: // 错误类型
                    value ="非法字符";
                    break;
                default:
                    value = "未知类型";
                    break;
            }

        }
        return value.trim();
    }

}