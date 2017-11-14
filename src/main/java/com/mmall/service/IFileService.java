package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by lihaochun on 2017/11/7.
 */
public interface IFileService {
    public String upload(MultipartFile file, String path);
}
