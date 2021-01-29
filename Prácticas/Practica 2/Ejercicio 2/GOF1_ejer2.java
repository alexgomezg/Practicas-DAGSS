/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof1_ejer2;

import java.io.File;

/**
 *
 * @author Alex
 */
public class GOF1_ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File input = new File("libros.txt");
	File output = new File("libros.xml");
        
	//Leo fichero y se crea biblioteca
	LibroBuilder builder = new LibroBuilder();
	TXTConverter txtToLibros = new TXTConverter(input, builder);
	txtToLibros.parse();
        System.out.println(builder.toString());
        
	//Leo fichero y se crea el fichero .xml
	XMLBuilder builderXML = new XMLBuilder(output);
	TXTConverter LibrosToXML = new TXTConverter(input, builderXML);
        LibrosToXML.parse();
	File xml= builderXML.getXMLFile();
	System.out.print(builder.toString());
    }
    
}
