/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.util.ArrayList;

/**
 *
 * @author shegavala
 */
public class BookChapter {
    
    private int linesPerPage;
    private ArrayList<Page> pages;
    private String title;
    private String author;
    
    public BookChapter(int l){
    
    this.linesPerPage =l;
    }
    
    public BookChapter(int l, ArrayList<Page> p){
        this.linesPerPage = l;
        this.pages = p;
    }
    public BookChapter(int l, ArrayList<Page> p, String t,String a){
    
        this.linesPerPage = l;
        this.pages = p;
        this.title = t;
        this.author = a;
}

   
    @Override
    public String toString(){
        return ("Title: "+ title + "\n" + "Author: " + author + "\n"+ "Pages:" + pages + "\n"+ linesPerPage);
    }

    public ArrayList<Page> getPages() {
        return pages;
    }
    
}
