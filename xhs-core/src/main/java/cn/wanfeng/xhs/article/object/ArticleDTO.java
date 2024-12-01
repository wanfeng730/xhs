package cn.wanfeng.xhs.article.object;


import lombok.Data;

import java.util.Date;

/**
 * @date: 2024-11-28 22:27
 * @author: luozh.wanfeng
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
