package cn.wanfeng.xhs;

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
@ComponentScan(basePackages = {"cn.wanfeng.sp.**"})
public class XiaoHongShuApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoHongShuApplication.class, args);
    }

}
