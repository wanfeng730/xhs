package cn.wanfeng.xhs;

import cn.wanfeng.xhs.util.ResourceFileUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableRetry
@EnableAsync
@MapperScan(basePackages = {"cn.wanfeng.sp.**.mapper"})
@ComponentScan(basePackages = {"cn.wanfeng.**"})
public class XiaoHongShuApplication {

    private static final String BOOT_START_DISPLAY_FILE_PATH = "bootStartDisplay.txt";

    public static void main(String[] args) {
        SpringApplication.run(XiaoHongShuApplication.class, args);
        ResourceFileUtils.printTxtFileContent(BOOT_START_DISPLAY_FILE_PATH);
    }

}
