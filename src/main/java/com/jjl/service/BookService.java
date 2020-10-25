package com.jjl.service;

import com.jjl.pojo.Books;
import com.jjl.pojo.User1;

import java.util.List;

public interface BookService {
    //增加一本书
    int addBook(Books books);
    //删除
    int deleteBookById(int id);
    //更新
    int updateBook(Books books);
    //查询
    Books queryBookById(int id);
    //所有
    List<Books> select();

    Books queryBook(String bookName);
    //查询
    int queryUser(User1 user1);
}
