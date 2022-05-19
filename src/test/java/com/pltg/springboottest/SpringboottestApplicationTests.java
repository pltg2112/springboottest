package com.pltg.springboottest;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.pltg.springboottest.entity.Book;
import com.pltg.springboottest.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringboottestApplicationTests {
    @Autowired
    private BookRepository repository;

    @Test
    void contextLoads() {
    }

    @Test
    void save(){
        Book book = new Book();
        book.setName("springboot");
        book.setAuthor("张三");
        Book book1 = repository.save(book);
        System.out.println(book1);
    }
}
