package cn.wanfeng.xhs;

import cn.wanfeng.xhs.util.ResourceFileUtils;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.retry.annotation.EnableRetry;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@ConfigurationPropertiesScan
@EnableRetry
@EnableAsync
@EnableDubbo
@MapperScan(basePackages = {"cn.wanfeng.**.mapper"})
@ComponentScan(basePackages = {"cn.wanfeng.**"})
@ServletComponentScan(basePackages = "cn.wanfeng.xhs.filter")
public class XiaoHongShuApplication extends SpringBootServletInitializer {

    private static final String BOOT_START_DISPLAY_FILE_PATH = "bootStartDisplay.txt";

    public static void main(String[] args) {
        SpringApplication.run(XiaoHongShuApplication.class, args);
        ResourceFileUtils.printTxtFileContent(BOOT_START_DISPLAY_FILE_PATH);
    }

}
