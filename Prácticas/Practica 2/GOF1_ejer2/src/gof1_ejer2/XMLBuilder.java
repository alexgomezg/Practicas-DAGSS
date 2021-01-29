/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof1_ejer2;

/**
 *
 * @author Alex
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class XMLBuilder implements BuilderBiblioteca {
	
	private File fichero;
	private PrintWriter out;
	
	public XMLBuilder(File fichero){
		this.fichero = fichero;
		this.out = null;
		
		try {
			this.out = new PrintWriter(this.fichero);
			this.out.println("<libros>\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void addLibro(String titulo, String autor, String isbn){
		String s = "<libro>\n\t<titulo>" + titulo + "</titulo>\n\t<autor>" + autor + "</autor>\n\t<isbn>" + isbn + "</isbn>\n</libro>";		
		out.println(s);
	}

	public File getXMLFile(){
		this.out.println("\n");
		this.out.println("</libros>");
		this.out.close();
		return this.fichero;
		
	}


}
