package cn.wanfeng.xhs;

import cn.wanfeng.sp.config.custom.SimpleProtoConfig;
import cn.wanfeng.sp.util.LogUtils;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaoHongShuApplication.class)
public class XiaoHongShuApplicationTests {

    @Resource
    private SimpleProtoConfig simpleProtoConfig;

    @Test
    public void baseTest(){
        LogUtils.info("SimpleProtoConfig.dataTable:{}", SimpleProtoConfig.dataTable);
        LogUtils.info("SimpleProtoConfig.settingsTable:{}", SimpleProtoConfig.settingsTable);
    }


}
