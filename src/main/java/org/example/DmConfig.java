package org.example;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.File;

/**
 * @author wurui
 * @description:大漠全局配置
 * @copyright copyright © 贝壳找房（北京）科技有限公司
 * @date 2023/4/26
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DmConfig {

    /**
     * 附件资源导出目录(参考按键精灵)
     * 默认使用程序所在目录下面的fuzhu文件夹
     */
    @Builder.Default
    private String extractResourceFolder = System.getProperty("user.dir") + File.separator + "fuzhu";

    /**
     * 大漠版本
     */
    @Builder.Default
    private String version = "3.1233";

    /**
     * 注册码
     */
    private String registrationCode;

    /**
     * 大漠dll文件名, eg: dm.dll
     */
    @Builder.Default
    private String dmDllFileName = "dm.dll";

    /**
     * 大漠程序id,eg: dm.dmsoft
     */
    @Builder.Default
    private String programId = "dm.dmsoft";

}
