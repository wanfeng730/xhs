package cn.wanfeng.xhs.article;


import cn.wanfeng.sp.session.SpSession;
import cn.wanfeng.xhs.article.mapper.search.ArticleMapper;
import cn.wanfeng.xhs.article.object.Article;
import cn.wanfeng.xhs.article.object.ArticleDO;
import com.alibaba.fastjson.JSON;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import javax.swing.border.TitledBorder;
import java.util.Arrays;
import java.util.List;

/**
 * @date: 2024-11-25 23:09
 * @author: luozh.wanfeng
 */
@Service
public class ArticleServiceImpl implements ArticleService{

    @Resource
    private ArticleMapper articleMapper;

    @Resource
    private SpSession spSession;

    @Override
    public void create() {
        List<String> labelList = Arrays.asList("约会穿搭", "黑丝穿搭");
        String labelListJson = JSON.toJSONString(labelList);
        Article article = new Article(spSession, "救命好喜欢这种感觉的穿搭！shui懂！！", 18003L, labelListJson, "杭州", "幂式穿搭真的氛围感的神！！！", "晚风730");
        article.store();
    }

    @Override
    public List<ArticleDO> getAll() {
        return articleMapper.findAllDescCreateDate();
    }
}
