package online.daobao.boot.jpa.repository;

import online.daobao.boot.jpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {

}
