package org.example;

import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.Variant;
/**
 * @author sun
 **/
@ComObject(progId = "dm.dmsoft")
public interface DmInterface {

    /**
     * =========================================
     *                  基本设置(开始)
     * =========================================
     */
    @ComMethod
    String Ver();

    @ComMethod
    long Reg(String reg_code, String ver_info);

    @ComMethod
    long SetPath(String path);

    @ComMethod
    String GetPath();

    /**
     * show 整形数: 0表示不打开,1表示打开
     * @param show show
     * @return 0-失败 1-成功
     */
    @ComMethod
    long SetShowErrorMsg (int show);

    /**
     * =========================================
     *                 基本设置(完成)
     * =========================================
     */

    @ComMethod
    long FindPic(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Variant.VARIANT intX, Variant.VARIANT intY);

    @ComMethod
    long MoveTo(int x, int y);

    @ComMethod
    long LeftDoubleClick();
}