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
import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	
	private List<Libro> libros = new LinkedList<>();
	
	public Biblioteca(){
		
	}
	
	public List<Libro> getLibros(){
		
		return this.libros;
	}
	//Add de interfaz
	public void addLibro(String titulo, String autor, String isbn){
		
		this.addLibro(new Libro(titulo,isbn,new Autor(autor)));
		
	}
	//Add propia
	public void addLibro(Libro l){
		
		this.libros.add(l);
	}
	
        @Override
	public String toString(){
            String toret="\n";
		for (Libro libro : getLibros()) {
	            toret+=libro.toString();
		}
                return toret;	
	}

}
