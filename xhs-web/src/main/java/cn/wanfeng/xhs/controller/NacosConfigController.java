package cn.wanfeng.xhs.controller;


import cn.wanfeng.sp.config.custom.SimpleProtoConfig;
import cn.wanfeng.sp.util.LogUtil;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * NacosConfigController: desc.
 *
 * @date: 2025-01-19 18:58
 * @author: luozh.wanfeng
 */
@Tag(name = "Nacos配置模块")
@RestController
@RequestMapping("/nacos_config")
public class NacosConfigController {

    @Value("${simpleproto.swaggerAuthor:}")
    private String swaggerAuthor;

    @Operation(summary = "测试Nacos配置获取")
    @GetMapping("/get_config_test")
    public void getConfigTest(){
        LogUtil.info("swaggerAuthor={}", swaggerAuthor);
        LogUtil.info("SimpleProtoConfig.swaggerAuthor={}", SimpleProtoConfig.swaggerAuthor);
    }

}
