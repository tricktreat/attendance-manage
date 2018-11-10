package cn.ibilidi.web;

import cn.ibilidi.service.IAdminService;
import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/14.
 */
@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired private IAdminService iadminService;

    @RequestMapping("/login")
    public String  adminLogin(HttpServletRequest request, HttpServletResponse response,
                                        HttpSession session,
                                        Map<String,String> modelAndView,
                                        @RequestParam(value = "username")String username,
                                        @RequestParam(value = "password")String password)
    {
          if(iadminService.checkAdminUsername(username,password)){

             return "home";
          }
        return "";
    }

    @GetMapping("/index")
    public String indexPage(){
          return "login";
    }
}
