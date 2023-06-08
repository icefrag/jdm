package org.example;

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
        System.out.println(dm.GetPath());
    }
}
