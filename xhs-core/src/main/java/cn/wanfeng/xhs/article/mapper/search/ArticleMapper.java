package cn.wanfeng.xhs.article.mapper.search;

import cn.wanfeng.xhs.article.object.ArticleDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @date: 2024-11-25 23:01
 * @author: luozh.wanfeng
 */
@Mapper
public interface ArticleMapper extends BaseMapper<ArticleDO> {
    /**
     * 创建时间倒序查询全部文章
     * @return 文章
     */
    List<ArticleDO> findAllDescCreateDate();

}
