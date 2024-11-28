package cn.wanfeng.xhs.article.object;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * @date: 2024-11-28 22:27
 * @author: luozh.wanfeng
 * @description:
 * @since:
 */
@Data
public class ArticleDTO {

    private Long id;

    private String type;

    private String name;

    private Date createDate;

    private Date modifyDate;

    private Boolean isDelete;


    private String title;

    private String description;

    private String author;

    private Long likeCount;

    private String labelList;

    private String ipCity;

    private Integer articleStatus;

}
