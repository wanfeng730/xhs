package cn.wanfeng.xhs.facade;


import cn.hutool.core.bean.BeanUtil;
import cn.wanfeng.xhs.article.ArticleService;
import cn.wanfeng.xhs.article.object.ArticleDTO;
import cn.wanfeng.xhs.facade.object.ArticleResult;
import jakarta.annotation.Resource;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @date: 2025-01-11 23:33
 * @author: luozh.wanfeng
 * @description: 文章dubbo接口实现
 * @since: 1.0
 */
@DubboService
public class ArticleFacadeImpl implements ArticleFacade {

    @Resource
    private ArticleService articleService;

    /**
     * 根据id获取文章详情
     *
     * @param id 文章id
     * @return 文章详情
     */
    @Override
    public ArticleResult detail(Long id) {
        ArticleDTO articleDTO = articleService.detail(id);
        return BeanUtil.copyProperties(articleDTO, ArticleResult.class);
    }
}
