package cn.ibilidi.web;

import cn.ibilidi.service.IImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

@RestController
@ComponentScan("cn.ibilidi")
public class FileController {



    @Autowired private IImportService iimportService;

    //  Excel导入数据到数据库
    @PostMapping("/importXkExcel")
    public String importXkExcel(@RequestParam("myfile")MultipartFile myFile){
        Integer nums = iimportService.importExcel(myFile,0);
        return "成功导入数据";
    }

    @PostMapping("/importKcglExcel")
    public String importKcglExcel(@RequestParam("myfile")MultipartFile myFile){
        Integer nums = iimportService.importExcel(myFile,1);
        return "成功导入数据";
    }

}
