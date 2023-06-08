package org.example;

import com.sun.jna.platform.win32.Variant;
import com.sun.jna.ptr.IntByReference;

/**
 * @author wurui038
 * @description:
 * @date 2023/6/8
 */
public class Main {

    public static void main(String[] args) {
        DmConfig dmConfig = DmConfig.builder().build();
        // 免注册,注册大漠
        DmSoft dmSoft = new DmSoft(dmConfig);
        DmInterface dm = dmSoft.getDm();
        Variant.VARIANT x = new Variant.VARIANT(new IntByReference());
        Variant.VARIANT y = new Variant.VARIANT(new IntByReference());
        dm.FindPic(148,104,275,177,"1.bmp","050505",0.9,0,x,y);
    }
}
