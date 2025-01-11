package cn.wanfeng.xhs.facade;

import cn.wanfeng.xhs.facade.object.ArticleResult;

/**
 * @date: 2025-01-11 23:28
 * @author: luozh.wanfeng
 * @description:
 * @since:
 */
public interface ArticleFacade {

    /**
     * 根据id获取文章详情
     * @param id 文章id
     * @return 文章详情
     */
    ArticleResult detail(Long id);

}
