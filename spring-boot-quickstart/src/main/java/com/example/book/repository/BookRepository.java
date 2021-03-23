package com.example.book.repository;

import com.example.book.entity.Book;
import com.sun.org.apache.xpath.internal.operations.Bool;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
