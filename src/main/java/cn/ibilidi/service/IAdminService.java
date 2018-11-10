package cn.ibilidi.service;

public interface IAdminService {


    void AdminLogin(String adminUserName,String adminPass);

    boolean checkAdminUsername(String adminUsername,String adminPassword);



}
