package cn.wanfeng.xhs.article.enums;

import cn.wanfeng.sp.anno.ProtoEnumConstructor;
import cn.wanfeng.sp.anno.ProtoEnumValue;
import cn.wanfeng.xhs.article.ArticleService;
import cn.wanfeng.xhs.article.object.Article;
import com.amazonaws.handlers.StackedRequestHandler;
import lombok.Getter;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

/**
 * @date: 2024-11-28 21:37
 * @author: luozh.wanfeng
 * @description: 文章状态
 * @since: 1.0
 */
@Getter
public enum ArticleStatus {

    DRAFT(1, "草稿"),
    EXAMINING(2, "审核中"),
    PUBLISH(3, "已发布"),
    DELETE(4, "已删除"),

    NONE(-1, "无效值");

    private Integer value;

    private String desc;

    ArticleStatus(Integer value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @ProtoEnumValue
    public Integer toValue(){
        return value;
    }

    public String toDesc(){
        return desc;
    }

    @ProtoEnumConstructor
    public static ArticleStatus toEnum(Integer value){
        for (ArticleStatus status : values()) {
            if(Objects.equals(status.value, value)){
                return status;
            }
        }
        return NONE;
    }
}
