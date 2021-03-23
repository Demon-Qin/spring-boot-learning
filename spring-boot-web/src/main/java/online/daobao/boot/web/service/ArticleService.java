package online.daobao.boot.web.service;

import online.daobao.boot.web.entity.Article;

import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Student1Service
 */
public interface ArticleService {
    /**
     * 发布文章
     *
     * @param article 文章实体
     * @return boolean
     */

    boolean postArticle(Article article);

    /**
     * 根据文章id删除文章
     * @param id  文章id
     * @return 删除是否成功
     */
    boolean deleteArticle(int id);

    /**
     * 更新文章
     * @param article  文章对象
     * @return 更新是否成功
     */

    boolean updateArticle(Article article);

    /**
     * 根据id查询文章
     *
     * @return List<Article>
     */
    Article getById(int id);

    /**
     * 查询所有文章
     *
     * @return List<Article>
     */
    List<Article> getAll();
}

