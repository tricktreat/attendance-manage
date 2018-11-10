package cn.ibilidi.service.servicesimpl;

import cn.ibilidi.AllException.AllException;
import cn.ibilidi.entity.TbAdmin;
import cn.ibilidi.entity.TbAdminCriteria;
import cn.ibilidi.enums.ResultEnum;
import cn.ibilidi.mapper.TbAdminMapper;
import cn.ibilidi.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

/**
 * Created by Administrator on 2018/1/14.
 */
@Service
@Transactional
public class AdminLoginServiceImpl implements IAdminService {

    @Value("${lianjia.salt}")
    private static String salt;

    @Autowired private TbAdminMapper tbAdminMapper;

    @Override
    public void AdminLogin(String adminUserName, String adminPass) {
        checkAdminUsername(adminUserName,adminPass);
    }

    @Override
    public boolean checkAdminUsername(String adminUsername, String adminPassword) {
        TbAdmin tbAdmin = getTbadminUserInfo(adminUsername);
        System.out.println(generateEncryPass(adminPassword)+">>>>>>>>>>>>>>>>>>>>>>>>>");
        if(!(tbAdmin.getAdmin_password().equals(generateEncryPass(adminPassword))))
        {
            throw new AllException(ResultEnum.PASSWORD_IS_ERROR);
        }
        return true;
    }


    /**
     * 明文加密
     * @param clearPass
     * @return
     */
    public static String generateEncryPass(String clearPass){
        return DigestUtils.md5DigestAsHex((salt+DigestUtils.md5DigestAsHex(clearPass.getBytes())).getBytes());
    }

    public TbAdmin getTbadminUserInfo(String adminUsername){
        TbAdminCriteria tbAdminCriteria = new TbAdminCriteria();
        tbAdminCriteria.or().andAdmin_nameEqualTo(adminUsername);
        TbAdmin tbAdmin = tbAdminMapper.selectByExample(tbAdminCriteria).get(0);
        if(tbAdmin == null){
            throw new AllException(ResultEnum.USERNAME_IS_ERROR);
        }
        return tbAdmin;
   }
}