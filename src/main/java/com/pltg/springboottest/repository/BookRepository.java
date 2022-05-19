package com.pltg.springboottest.repository;

import com.pltg.springboottest.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {//泛型中第一个是实体类的名称，第二个是逐渐类型
}
