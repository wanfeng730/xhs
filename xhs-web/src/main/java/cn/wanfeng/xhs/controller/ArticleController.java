package cn.wanfeng.xhs.controller;


import cn.wanfeng.xhs.article.ArticleService;
import cn.wanfeng.xhs.article.object.Article;
import cn.wanfeng.xhs.article.object.ArticleDO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @date: 2024-11-25 23:10
 * @author: luozh.wanfeng
 * @description: 文章服务接口
 * @since: 1.0
 */
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @GetMapping("/create")
    public void create(){
        articleService.create();
    }

    @PostMapping("/get_all")
    public List<ArticleDO> getAll(){
        return articleService.getAll();
    }
}
