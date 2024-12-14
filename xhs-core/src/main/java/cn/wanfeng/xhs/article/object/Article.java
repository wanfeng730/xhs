package cn.wanfeng.xhs.article.object;


import cn.wanfeng.sp.anno.ProtoField;
import cn.wanfeng.sp.anno.Type;
import cn.wanfeng.sp.api.domain.SpBaseObject;
import cn.wanfeng.sp.session.SpSession;
import cn.wanfeng.xhs.article.enums.ArticleStatus;
import cn.wanfeng.xhs.common.TypeConstants;
import lombok.Getter;

/**
 * @date: 2024-11-25 22:45
 * @author: luozh.wanfeng
 * @description: 文章
 * @since: 1.0
 */
@Type(TypeConstants.ARTICLE)
@Getter
public class Article extends SpBaseObject {

    /**
     * 标题
     */
    @ProtoField(index = 1, name = "title")
    private String title;
    /**
     * 描述
     */
    @ProtoField(index = 2, name = "description")
    private String description;
    /**
     * 作者
     */
    @ProtoField(index = 3, name = "author")
    private String author;
    /**
     * 点赞数
     */
    @ProtoField(index = 4, name = "like_count")
    private Long likeCount;
    /**
     * 标签列表
     */
    @ProtoField(index = 5, name = "label_list")
    private String labelList;
    /**
     * ip城市
     */
    @ProtoField(index = 6, name = "ip_city")
    private String ipCity;
    /**
     * 文章状态
     */
    @ProtoField(index = 7, name = "article_status")
    private ArticleStatus articleStatus;

    public Article(SpSession session, String title, Long likeCount, String labelList, String ipCity, String description, String author) {
        super(session, TypeConstants.ARTICLE);
        this.title = title;
        this.likeCount = likeCount;
        this.labelList = labelList;
        this.ipCity = ipCity;
        this.description = description;
        this.author = author;
        this.articleStatus = ArticleStatus.DRAFT;
    }

    public Article(SpSession session, Long id) {
        super(session, id);
    }
}
