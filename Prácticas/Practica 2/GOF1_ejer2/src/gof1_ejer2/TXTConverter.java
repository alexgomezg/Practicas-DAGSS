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
import java.util.Scanner;


public class TXTConverter {
	
	private File fichero;
	private BuilderBiblioteca builder;
	private Scanner in;
	
	public TXTConverter(File fichero, BuilderBiblioteca builder){
		this.fichero = fichero;
		this.builder = builder;
		open();
	}
	
	public void open(){
		
		try {
			this.in = new Scanner(this.fichero);

		} catch (FileNotFoundException e) {
			System.err.println("the file " + this.fichero.getAbsolutePath() + " does not exists: " + e.getMessage());
			System.exit(1);
		}			
	}
	
	public void parse(){
		
		String String;
		String[] arrayString;
		
		while(this.in.hasNextLine()){
			String  entrada = in.nextLine();
                        System.out.println(entrada);
			arrayString = entrada.split("\\t");
			builder.addLibro(arrayString[0], arrayString[1], arrayString[2]);
		}
		
		this.in.close();
		
	}
}
