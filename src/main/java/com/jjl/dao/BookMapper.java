package com.jjl.dao;

import com.jjl.pojo.Books;
import com.jjl.pojo.User1;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加一本书
    int addBook(Books books);
    //删除
    int deleteBookById(@Param("bookID") int id);
    //更新
    int updateBook(Books books);
    //查询
    Books queryBookById(@Param("bookID") int id);
    //所有
    List<Books> select();
    //通过书名来查询
    Books queryBook(String bookName);
    //查询用户登陆
    int  queryUser(User1 user1);
}
