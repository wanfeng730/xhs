package cn.wanfeng.xhs.controller;


import cn.wanfeng.xhs.article.ArticleService;
import cn.wanfeng.xhs.article.object.ArticleDTO;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
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
    public List<ArticleDTO> getAll() {
        return articleService.getAll();
    }

    @GetMapping("/detail")
    public ArticleDTO detail(@RequestParam @NotNull Long id){
        return articleService.detail(id);
    }
}
