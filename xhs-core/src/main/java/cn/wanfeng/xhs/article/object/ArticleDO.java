package cn.wanfeng.xhs.article.object;


import cn.wanfeng.sp.anno.ProtoField;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * @date: 2024-11-25 22:58
 * @author: luozh.wanfeng
 */
@Data
@TableName(autoResultMap = true)
public class ArticleDO {

    @TableId("id")
    private Long id;

    @TableField("type")
    private String type;

    @TableField("name")
    private String name;

    @TableField("create_date")
    private Date createDate;

    @TableField("modify_date")
    private Date modifyDate;

    @TableField("is_delete")
    private Boolean isDelete;



    @TableField("title")
    private String title;

    @TableField("description")
    private String description;

    @TableField("author")
    private String author;

    @TableField("like_count")
    private Long likeCount;

    @TableField("label_list")
    private String labelList;

    @TableField("ip_city")
    private String ipCity;

    @TableField("article_status")
    private Integer articleStatus;

}
