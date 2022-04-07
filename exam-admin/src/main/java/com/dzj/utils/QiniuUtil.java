package com.dzj.utils;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

public class QiniuUtil {
    public  static String accessKey = "accessKey";
    public  static String secretKey = "secretKey";
    public  static String bucket = "bucket";
    static Auth auth = Auth.create(accessKey, secretKey);
    static String upToken = auth.uploadToken(bucket);
    //构造一个带指定Zone对象的配置类
    //Zone.zone0:华东
    //Zone.zone1:华北
    //Zone.zone2:华南
    //Zone.zoneNa0:北美
    static Configuration cfg = new Configuration(Zone.zone2());
    //...其他参数参考类注释
    static UploadManager uploadManager = new UploadManager(cfg);


    public static String uploadQiniu(MultipartFile uploadFile) throws IOException {
        //文件命名，将MultpartFile格式转为file
        String filename = UUID.randomUUID().toString().substring(0, 5) + uploadFile.getOriginalFilename();

        try {
            Response response = uploadManager.put(uploadFile.getBytes(), filename, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet =
                    new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
        } catch (QiniuException ex) {
            Response r = ex.response;
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }
        return "上传成功";
    }

}
