package com.yuul.section01.Book;

import com.yuul.section01.DTO.BookDTO;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<BookDTO> books;
    
    public Library(){
        books =new ArrayList<>();
    }

    public void addBook(BookDTO bookNum) {
        books.add(bookNum);
    }

    public BookDTO searchBook(int bookCode) {
        for(BookDTO b :books){
            if(b.getBookCode() == bookCode){
                return b;
            }
        }
        return null;
    }

    public void updateBook(String title, String author, int bookCode) {

    }

    public void removeBook(int bookCode) {
    }
}
