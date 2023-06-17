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
     * ===================基本设置(开始)======================
     */
    @ComMethod
    String Ver();

    @ComMethod
    int Reg(String reg_code, String ver_info);

    @ComMethod
    int SetPath(String path);

    @ComMethod
    String GetPath();

    /**
     * show 整形数: 0表示不打开,1表示打开
     *
     * @param show show
     * @return 0-失败 1-成功
     */
    @ComMethod
    int SetShowErrorMsg(int show);

    /**
     * ==================基本设置(完成)=======================
     */


    /**
     * ===================图色(开始)======================
     */
    @ComMethod
    int FindPic(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir, Variant.VARIANT intX, Variant.VARIANT intY);

    @ComMethod
    String FindPicE(int x1, int y1, int x2, int y2, String pic_name, String delta_color, double sim, int dir);

    @ComMethod
    String FindMultiColorE(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir);

    @ComMethod
    int GetColorNum(int x1, int y1, int x2, int y2, String color, double sim);

    @ComMethod
    String FindMultiColorEx(int x1, int y1, int x2, int y2, String first_color, String offset_color, double sim, int dir);

    @ComMethod
    int GetResultCount(String ret);

    @ComMethod
    int GetResultPos(String ret, int index, Variant.VARIANT intX, Variant.VARIANT intY);
    /**
     * ====================图色(结束)=====================
     *
     */


    /**
     * ==================键鼠(开始)=======================
     */
    @ComMethod
    int MoveTo(int x, int y);

    @ComMethod
    int LeftDoubleClick();

    @ComMethod
    int LeftClick();
    /**
     * ==================键鼠(结束)=======================
     *
     */


    /**
     * ==================文字识别(开始)=======================
     */
    @ComMethod
    int SetDict(int index, String file);

    /**
     * ==================文字识别(结束)=======================
     *
     */

    /**
     * ====================窗口(开始)=====================
     */
    @ComMethod
    int GetMousePointWindow();

    @ComMethod
    String GetWindowTitle(int hwnd);

    @ComMethod
    int SetWindowState(int hwnd, int flag);

    @ComMethod
    int MoveWindow(int hwnd, int x, int y);

    @ComMethod
    int FindWindow(String className, String title);
    /**
     * ==================窗口(结束)=======================
     *
     */


    /**
     * ==================后台设置(开始)=======================
     */
    @ComMethod
    int BindWindowEx(int hwnd, String display, String mouse, String keypad, String publicStr, int mode);

    @ComMethod
    int UnBindWindow();
    /**
     * ==================后台设置(结束)=======================
     *
     */
}