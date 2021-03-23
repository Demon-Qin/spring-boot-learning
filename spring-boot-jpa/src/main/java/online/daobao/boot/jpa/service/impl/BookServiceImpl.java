package online.daobao.boot.jpa.service.impl;

import online.daobao.boot.jpa.entity.Book;
import online.daobao.boot.jpa.repository.BookRepository;
import online.daobao.boot.jpa.service.BookService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 囧态汗
 * @date 2021/3/23
 * @description BookServiceImpl
 */
@Service
@Transactional(rollbackFor = {RuntimeException.class})
public class BookServiceImpl implements BookService {
    @Resource
    private BookRepository bookRepository;

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }
}