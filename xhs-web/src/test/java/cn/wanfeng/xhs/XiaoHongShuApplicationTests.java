package cn.wanfeng.xhs;

import cn.wanfeng.sp.config.custom.SimpleProtoConfig;
import cn.wanfeng.sp.util.LogUtil;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaoHongShuApplication.class)
public class XiaoHongShuApplicationTests {

    @Resource
    private SimpleProtoConfig simpleProtoConfig;

    @Test
    public void baseTest(){
        LogUtil.info("SimpleProtoConfig.dataTable:{}", SimpleProtoConfig.dataTable);
        LogUtil.info("SimpleProtoConfig.settingsTable:{}", SimpleProtoConfig.settingsTable);
    }


}
