package cn.wanfeng.xhs.facade.object;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @date: 2025-01-11 23:25
 * @author: luozh.wanfeng
 * @since: 1.0
 */
@Data
public class ArticleResult implements Serializable {

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

    public ArticleResult() {
    }

    public ArticleResult(Long id, String type, String name, Date createDate, Date modifyDate, Boolean isDelete, String title, String description, String author, Long likeCount, String labelList, String ipCity, Integer articleStatus) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.createDate = createDate;
        this.modifyDate = modifyDate;
        this.isDelete = isDelete;
        this.title = title;
        this.description = description;
        this.author = author;
        this.likeCount = likeCount;
        this.labelList = labelList;
        this.ipCity = ipCity;
        this.articleStatus = articleStatus;
    }
}
