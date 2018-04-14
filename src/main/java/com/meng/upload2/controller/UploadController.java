package com.meng.upload2.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.io.FilenameUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@RestController
public class UploadController {

    @RequestMapping("/upload")
    public String upload(MultipartFile file, HttpServletRequest request) throws IOException {
        String fileName = new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date()) +
                UUID.randomUUID().toString().replace("-", "") +
                "." + FilenameUtils.getExtension(file.getOriginalFilename());
        String url="http://mengxiangtao.top/img/"+fileName;
        Client client=new Client();
        WebResource resource = client.resource(url);
        resource.put(String.class,file.getBytes());

        return "ok";
    }

}
