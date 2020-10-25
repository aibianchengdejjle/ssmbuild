package com.jjl.controller;

import com.jjl.pojo.Books;
import com.jjl.service.BookService;
import com.jjl.service.BookServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    public void setBooksService(BookService booksService) {
        this.booksService = booksService;
    }

    @Autowired
    @Qualifier("BookServiceImpl")
    //调取service层
    private BookService booksService;
    //查询全部的书籍
    @RequestMapping("/allbook")
    public  String list(Model model){
        List<Books> select = booksService.select();
        model.addAttribute("list",select);
        return "allbook";
    }
    //跳转到增加书籍的界面
    @RequestMapping("/toAddBook")
    public  String addBook(){
        return "addbook";
    }
    //添加书籍请求
    @RequestMapping("/Addbook")
    public  String addBook2(Books books) throws UnsupportedEncodingException {
        //调用servic
        String str = new String(books.toString().getBytes("iso-8859-1"),"UTF-8");
        System.out.println(books.toString());
        booksService.addBook(books);
        return "redirect:/book/allbook";
    }
    //接受更新曹祖
    @RequestMapping("/toUpdateBook")
    public String toupdate(){
        return "updatebook";
    }
    @RequestMapping("/updatebook")
    public  String update(Books books){
        System.out.println(books.toString());
        booksService.updateBook(books);
        return "redirect:/book/allbook";
    }
    //Restful风格
    @RequestMapping("/toDelete/{bookId}")
    public String toDelete(@PathVariable("bookId") int id){
        System.out.println("-------------"+id);
        booksService.deleteBookById(id);
        return "redirect:/book/allbook";
    }
    //查询书籍功能
    @RequestMapping("/queryBookName")
    public  String  queryBook(String bookName,Model model){
        System.out.println("--------------------"+bookName);
        Books books = booksService.queryBook(bookName);
        List<Books> list=new ArrayList<>();
        list.add(books);
        model.addAttribute("list",list);
        return "allbook";
    }


}
