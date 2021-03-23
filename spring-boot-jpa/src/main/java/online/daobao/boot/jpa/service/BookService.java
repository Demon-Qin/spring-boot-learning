package online.daobao.boot.jpa.service;

import online.daobao.boot.jpa.entity.Book;

import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description BookService
 */
public interface BookService {
    /**
     * 新增book
     *
     * @param book 入参
     * @return 新增的book对象
     */
    Book save(Book book);

    /**
     * 查询所有book
     * @return
     */
    List<Book> getAll();
}
