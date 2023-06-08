package org.example;

/**
 * @author wurui038
 * @description:
 * @date 2023/6/8
 */
public class Main {
    private static DmSoft dm;

    public static void main(String[] args) throws InterruptedException {
        // 3.1233的配置都可以走默认
        dm = new DmSoft();
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                dm.unReg();
            }
        });
        System.out.println(dm.ver());
    }
}
