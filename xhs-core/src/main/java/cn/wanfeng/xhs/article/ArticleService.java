package cn.wanfeng.xhs.article;

import cn.wanfeng.xhs.article.object.ArticleDO;
import cn.wanfeng.xhs.article.object.ArticleDTO;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @date: 2024-11-25 23:08
 * @author: luozh.wanfeng
 */
public interface ArticleService {

    void create();

    List<ArticleDO> getAll();

    ArticleDTO detail(Long id);

}
