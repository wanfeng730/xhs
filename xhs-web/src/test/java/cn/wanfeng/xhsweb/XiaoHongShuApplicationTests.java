package cn.wanfeng.xhsweb;

import cn.wanfeng.proto.util.LogUtils;
import cn.wanfeng.sp.config.SimpleProtoConfig;
import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = XiaoHongShuApplication.class)
public class XiaoHongShuApplicationTests {

    @Resource
    private SimpleProtoConfig simpleProtoConfig;

    @Test
    public void testEnable(){
        LogUtils.info("SimpleProtoConfig.dataTable:{}", SimpleProtoConfig.dataTable);
        LogUtils.info("SimpleProtoConfig.settingsTable:{}", SimpleProtoConfig.settingsTable);
    }


}
