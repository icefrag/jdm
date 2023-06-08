package org.example;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.Pointer;
import com.sun.jna.platform.win32.COM.util.ObjectFactory;
import com.sun.jna.platform.win32.Ole32;
import lombok.extern.slf4j.Slf4j;

import java.io.File;

/**
 * @author wurui038
 * @description: 大漠核心类
 * @date 2023/6/8
 */

@Slf4j
public class DmSoft {
    private final DmConfig dmConfig;
    private DmInterface dmObject;

    public DmSoft(DmConfig dmConfig) {
        this.dmConfig = dmConfig;
        // 注册
        register();
        initDm();
    }

    private void register() {
        //获取dm.dll的绝对路径。
        String absolutePath = dmConfig.getExtractResourceFolder() + File.separator + dmConfig.getDmDllFileName();
        log.info("大漠插件路径:{}", absolutePath);
        DmReg.INSTANCE.SetDllPathA(absolutePath, 0);
    }

    private void initDm(){
        Ole32.INSTANCE.CoInitializeEx(Pointer.NULL, Ole32.COINIT_MULTITHREADED + Ole32.COINIT_SPEED_OVER_MEMORY);
        ObjectFactory objectFactory = new ObjectFactory();
        dmObject = objectFactory.createObject(DmInterface.class);
        log.info(dmObject.Ver());
    }

    public DmInterface getDm(){
        return dmObject;
    }

    private interface DmReg extends Library {
        DmReg INSTANCE = Native.load("DmReg.dll", DmReg.class);
        /**
         * SetDllPathA  字符串(Ascii码表示插件所在的路径),整数(0表示STA，1表示MTA)
         */
        void SetDllPathA(String format, int args);
        /**
         * SetDllPathW  字符串(Unicode码表示插件所在的路径),整数(0表示STA，1表示MTA)
         */
        void SetDllPathW(String format, int args);
    }


}
