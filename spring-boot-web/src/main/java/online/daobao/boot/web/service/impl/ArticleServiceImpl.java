package online.daobao.boot.web.service.impl;

import online.daobao.boot.web.dao.ArticleDao;
import online.daobao.boot.web.entity.Article;
import online.daobao.boot.web.service.ArticleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description Student1ServiceImpl
 */
@Service

public class ArticleServiceImpl implements ArticleService {
    @Resource
    private ArticleDao articleDao;


    //    @Override
//    public boolean postArticle(Article article) {
//        Article saveArticle = articleDao.save(article);
////        int a = 3 / 0; //  模拟可能出现的异常
//        return saveArticle !=null;
//
//    }
    @Override
    public boolean postArticle(Article article) {
        Article saveArticle = articleDao.save(article);

//        String a= "aaa";
//        int i = Integer.parseInt(a);

        return saveArticle !=null;
    }

    @Override
    public boolean deleteArticle(int id) {
        int row = articleDao.deleteById(id);
        return row !=0;
    }

    @Override
    public boolean updateArticle(Article article) {
        int row = articleDao.update(article);
        return row !=0;
    }

    @Override
    public Article getById(int id) {
        return articleDao.findById(id);
    }

    @Override
    public List<Article> getAll() {
        return articleDao.findAll();
    }

}