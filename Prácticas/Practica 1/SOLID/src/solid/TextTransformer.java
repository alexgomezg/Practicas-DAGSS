/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solid;

import java.io.FileNotFoundException;

/**
 *
 * @author Alex
 */
public class TextTransformer{
    
    private Reader reader;
    private Writer writer;
    private Transform transform;
    private String header;
    private String footer;

    public TextTransformer(Reader reader, Writer writer, Transform transform,String header,String footer) {
        this.reader = reader;
        this.writer = writer;
        this.transform = transform;
        this.header=header;
        this.footer=footer;
    }
    
    public void transform() throws FileNotFoundException{
        writer.writeLine(header);
        String currentLine=reader.readLine();
        while(currentLine!=null){
            writer.writeLine(transform.transform(currentLine));
            currentLine=reader.readLine();
        }
        writer.writeLine(footer);
    }
}
