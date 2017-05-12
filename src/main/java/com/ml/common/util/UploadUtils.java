package com.ml.common.util;

import com.ml.common.constant.Constant;
import com.ml.common.enums.DirectoryEnum;
import com.ml.common.exception.BusinessException;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

public abstract class UploadUtils {

    public static String uploadFile(MultipartFile file, DirectoryEnum directoryEnum) throws BusinessException {
        if (file.isEmpty())
            throw new BusinessException("文件为空");
        File dirHome = Constant.getDirHome(null);
        String yyyyMMdd = DateUtils.getDate("yyyyMMdd");
        String perfix = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
        StringBuffer child = new StringBuffer(directoryEnum.name()).append(File.separator).append(yyyyMMdd)
                                                                   .append(File.separator)
                                                                   .append(System.currentTimeMillis()).append(perfix);
        File descFile = new File(dirHome, child.toString());
        if (!descFile.getParentFile().exists())
            descFile.getParentFile().mkdirs();
        try {
            file.transferTo(descFile);
        } catch (IOException e) {
            throw new BusinessException("上传失败");
        }
        StringBuffer path = new StringBuffer(directoryEnum.name()).append(File.separator).append(yyyyMMdd)
                                                                  .append(File.separator).append(descFile.getName());
        return path.toString();
    }

}
