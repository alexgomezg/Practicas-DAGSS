/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 *
 * @author Alex
 */
public class FileWriter implements Writer{
    private PrintStream output;

    public FileWriter(String fileName) throws FileNotFoundException {
        this.output = new PrintStream(new FileOutputStream(fileName,true));
    }
    
    public void writeLine(String line){
       this.output.println(line);
    }
 
}
