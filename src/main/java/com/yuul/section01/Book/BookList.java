package com.yuul.section01.Book;

import com.yuul.section01.DTO.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class BookList {

    private Library Library;

    public BookList(){
        Library =new Library();
    }

    public void addBook(String title, String author, int bookCode){
        BookDTO bookdto =new BookDTO(title, author, bookCode);

        Library.addBook(bookdto);
        System.out.println("도서 정보를 추가하였습니다...");
    }

    public void searchBook(int bookCode){
        BookDTO bookdto = Library.searchBook(bookCode);
        System.out.println("조회 :" +Library.searchBook(bookCode));

    }

    public void updateBook(String title, String author, int bookCode){
        Library.updateBook(title, author, bookCode);
        System.out.println("도서 정보를 수정했습니다...");
    }

    public void removeBook(int bookCode){
        Library.removeBook(bookCode);
        System.out.println("해당 도서를 삭제하였습니다...");
    }

}
