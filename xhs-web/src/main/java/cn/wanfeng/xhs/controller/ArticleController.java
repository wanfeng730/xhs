package cn.wanfeng.xhs.controller;


import cn.wanfeng.xhs.article.ArticleService;
import cn.wanfeng.xhs.article.command.ArticleDetailCommand;
import cn.wanfeng.xhs.article.object.ArticleDTO;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * @date: 2024-11-25 23:10
 * @author: luozh.wanfeng
 * @description: 文章服务接口
 * @since: 1.0
 */
@Tag(name = "文章模块")
@RestController
@RequestMapping("/article")
public class ArticleController {

    @Resource
    private ArticleService articleService;

    @Operation(summary = "创建文章")
    @GetMapping("/create")
    public void create(){
        articleService.create();
    }

    @Operation(summary = "文章列表（所有）")
    @GetMapping("/get_all")
    public List<ArticleDTO> getAll() {
        return articleService.getAll();
    }

    @Operation(summary = "文章详情")
    @GetMapping("/detail")
    public ArticleDTO detail(@Parameter(name = "文章id") @RequestParam @NotNull Long id){
        return articleService.detail(id);
    }

    @Operation(summary = "文章详情command")
    @PostMapping("/detail_command")
    public ArticleDTO detailCommand(@Parameter(name = "详情参数") @RequestBody @Valid ArticleDetailCommand command) {
        return articleService.detailCommand(command);
    }

}
