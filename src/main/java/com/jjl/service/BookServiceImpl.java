package com.jjl.service;

import com.jjl.dao.BookMapper;
import com.jjl.pojo.Books;
import com.jjl.pojo.User1;

import java.util.List;

public class BookServiceImpl implements BookService {
    //调用dao层的操作，设置一个set接口，方便Spring管理
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    public int addBook(Books books) {
        return bookMapper.addBook(books);
    }

    public int deleteBookById(int id) {
        return bookMapper.deleteBookById(id);
    }

    public int updateBook(Books books) {
        return bookMapper.updateBook(books);
    }

    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    public List<Books> select() {
        return bookMapper.select();
    }
    public  Books  queryBook(String bookName){
        return  bookMapper.queryBook(bookName);
    }

    @Override
    public int queryUser(User1 user1) {
        return bookMapper.queryUser(user1);
    }

}
