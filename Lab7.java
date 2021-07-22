/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.IOException;
import java.io.FileNotFoundException;
/**
 *
 * @author shegavala
 */
public class Lab7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException,FileNotFoundException {
        // TODO code application logic here
        BookChapter gameofthrownes=BookChapterReadWrite.loadBookChapterFromFile("game_of_thrones_chapter_1.txt");
        BookChapter slaughterhouse=BookChapterReadWrite.loadBookChapterFromFile("slaughterhouse_five_chapter_1.txt");
    }
    
}
