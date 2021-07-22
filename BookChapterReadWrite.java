/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shegavala
 */
public class BookChapterReadWrite {
    
    public static BookChapter loadBookChapterFromFile(String filename)throws FileNotFoundException, IOException
    {
        File myFile = new File(filename);
        Scanner read = new Scanner(myFile);
        String title = read.nextLine();
        String author = read.nextLine();
        int pages = read.nextInt();
        
        ArrayList <Page>pageList = new ArrayList<>();
        while(read.hasNext())
        {
        Page thePage = getPage(read,pages);
        pageList.add(thePage);
        }
        BookChapter book = new BookChapter(pages,pageList,title,author);
        return book;    
    }
    private static Page getPage(Scanner scanner, int numLines)
    {
        String[] pageLine = new String [numLines];
        int count = 0;
        Page aPage = new Page (count);
        while(scanner.hasNext()&&count!=numLines)
        {
            pageLine[count] = scanner.next();
            count++;
            
        }
        Page newPage = new Page(pageLine);
        return newPage;
    }
    public static void writeBookChapterToFile (BookChapter book, String filename) throws FileNotFoundException{
        
        File afile = new File(filename);
        PrintWriter theWriter = new PrintWriter (afile);
        theWriter.write("\n");
       
    }
    
}
