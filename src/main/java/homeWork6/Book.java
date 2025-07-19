package homeWork6;

import java.sql.SQLOutput;

public class Book {
     private String author;
     private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    @Override
    public String toString(){
      return title + " by " + author;
    }
}
