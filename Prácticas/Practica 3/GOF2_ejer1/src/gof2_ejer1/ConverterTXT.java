/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof2_ejer1;

/**
 *
 * @author Alex
 * */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConverterTXT {
		
	private File file;
	private Plantilla listaEmpleados;
	private Scanner input;
		
	public ConverterTXT(File file, Plantilla listaEmpleados){
		this.file = file;
		this.listaEmpleados = listaEmpleados;
	}
		
	public void open(){
			
		try {
			this.input = new Scanner(this.file);

		} catch (FileNotFoundException e) {
			System.err.println("the file " + this.file.getAbsolutePath() + " does not exists: " + e.getMessage());
			System.exit(1);
		}
				
	}
		
	public void parse(){
		
		open();
		
		String aux;
		String[] campos;
					
		while(this.input.hasNextLine()){
			aux = input.nextLine();
			campos = aux.split("\\t");
			listaEmpleados.addEmpleado(campos[0], campos[1], Integer.parseInt(campos[2]), campos[3]);
		}
			
		this.input.close();
			
	}
				
}
