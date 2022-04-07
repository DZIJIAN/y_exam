package com.dzj.utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author by dzj
 * @implNote 2021/10/28 10:25
 */
public class SaveUtil {

    //设置上传目录
    public static String deposeFilesDir = "G://examFile";

    //上传文件到本地目录
    public static String save(MultipartFile uploadFile) throws IOException {
        //判断上传的文件是否为空
        if (!uploadFile.isEmpty()) {
            String fileName = UUID.randomUUID().toString().substring(0, 5) + uploadFile.getOriginalFilename();
            //创建文件
            File newFile = new File(deposeFilesDir+"/"+fileName);
            if (!newFile.getParentFile().exists()) {
                newFile.getParentFile().mkdirs();
            }
            //写入文件
            uploadFile.transferTo(newFile);
        }
        return "image/bmp";

    }
}
