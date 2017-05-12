package com.ml.common.constant;

import com.ml.common.enums.DirectoryEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;

import java.io.File;

//@Configuration
public class Constant {

    public static String HOME;
    public static String VIRTUAL_DIR;
    public static String ACCESS_DOMAIN;

    public static File getDirHome(DirectoryEnum directoryEnum) {
        if (StringUtils.isBlank(HOME))
            HOME = System.getProperty("user.home") + File.separator + "mcp";
        File homeDir = new File(HOME);
        if (!homeDir.exists() || !homeDir.isDirectory())
            homeDir.mkdirs();
        if (directoryEnum == null)
            return homeDir;
        File dir = new File(homeDir, directoryEnum.name());
        if (!dir.exists() || !dir.isDirectory())
            dir.mkdirs();
        return dir;
    }

    @Value("${WEB_HOME}")
    public void setHomeStr(String homeStr) {
        Constant.HOME = homeStr;
    }

    @Value("${VIRTUAL_DIR_NAME}")
    public void setVirtualDirName(String virtualDirName) {
        Constant.VIRTUAL_DIR = virtualDirName;
    }

    @Value("${ACCESS_DOMAIN}")
    public void setAccessDomain(String accessDomain) {
        Constant.ACCESS_DOMAIN = accessDomain;
    }
    
}
