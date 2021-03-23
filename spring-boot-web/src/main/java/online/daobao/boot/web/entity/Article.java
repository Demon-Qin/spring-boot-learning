package online.daobao.boot.web.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Article
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Integer id;
    private String author;
    private String title;
    private String content;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    private List<ArticleReader> readers;
}
