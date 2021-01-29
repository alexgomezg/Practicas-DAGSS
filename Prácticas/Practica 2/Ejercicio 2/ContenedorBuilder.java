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
public class ContenedorBuilder implements BuilderBiblioteca{

	
	private Biblioteca biblioteca;
	
	public ContenedorBuilder(){
		
		this.biblioteca = new Biblioteca();
		
	}

	@Override
	public void addLibro(String titulo, String autor, String isbn) {
		
		this.biblioteca.addLibro(titulo,autor,isbn);	
		
	}
	
	public Biblioteca getBiblioteca(){
		
		return this.biblioteca;
	}
	
	public String toString(){
		
		return getBiblioteca().toString();
	}

}
