package com.yuul.section01.DTO;

public class BookDTO {
    String title;
    String author;
    int bookCode;

    public BookDTO() {
    }

    public BookDTO(String title, String author, int bookCode) {
        this.title = title;
        this.author = author;
        this.bookCode = bookCode;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getBookCode() {
        return bookCode;
    }

    public void setBookCode(int bookCode) {
        this.bookCode = bookCode;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookCode=" + bookCode +
                '}';
    }
}


