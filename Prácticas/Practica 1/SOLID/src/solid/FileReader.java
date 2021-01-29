/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alex
 */
public class FileReader implements Reader{
    private File file;
    private int currentLine;

    public FileReader(String fileName){
        this.file = new File(fileName);
        this.currentLine=1;
    }
    
    public String readLine(){
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        int cont=0;
        while ((scanner.hasNextLine())&&(cont<currentLine)) {
            if(cont==currentLine-1){
                 this.currentLine++;
                 return scanner.nextLine();
            }
            scanner.nextLine();
            cont++;
        }
        return null;
    }

}
