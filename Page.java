/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author shegavala
 */
class Page {
    
    private String[] lines;

    public String[] getLines() {
        return lines;
    }

    public void setLines(String[] lines) {
        this.lines = lines;
    }
    public Page(int numLines){
    
        this.lines = new String [numLines];
    }
    public Page (String [] l){
    
    this.lines = l;
    }
}
