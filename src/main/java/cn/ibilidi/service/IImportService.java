package cn.ibilidi.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by Administrator on 2018/1/11.
 */

public interface IImportService {

    Integer importExcel(MultipartFile myFile,int flag);
}
