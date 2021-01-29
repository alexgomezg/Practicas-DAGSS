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
public class Libro {
	
	private String titulo;
	private String ISBN;
	private Autor autor;
	
	public Libro(String titulo, String ISBN, Autor autor){
		this.titulo = titulo;
		this.ISBN = ISBN;
		this.autor = autor;
	}
	
	public String getTitulo(){
		
		return this.titulo;
	}
	
	public String getISBN(){
		
		return this.ISBN;
		
	}
	
	public Autor getAutor(){
		
		return this.autor;
		
	}

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", ISBN=" + ISBN + ", autor=" + autor.getNombre() + '}';
    }
	
	

}