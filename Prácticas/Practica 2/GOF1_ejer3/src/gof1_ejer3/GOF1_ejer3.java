/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof1_ejer3;

/**
 *
 * @author Alex
 */
public class GOF1_ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProgramaA a = new ProgramaA();
	ProgramaB b = new ProgramaB();
	ProgramaC c = new ProgramaC();
	ProgramaD d = new ProgramaD();
	ProgramaE e = new ProgramaE();
	ProgramaF f = new ProgramaF();
	
	Trabajo trabajoParalelo = new Paralelo();
	Trabajo trabajoSerie = new Serie();
	Trabajo trabajoSerie2 = new Serie();

	//Añado b en paralelo
	trabajoParalelo.addprograma(b);
        //Añado c en paralelo
	trabajoParalelo.addprograma(c);
	//Añado d y f en serie 
	trabajoSerie2.addprograma(d);
	trabajoSerie2.addprograma(f);
	//Añado la dupla d y f a paralelo con b,c
	trabajoParalelo.addprograma(trabajoSerie2);
	
        //Añado en serie como inicio y fin a y c
	trabajoSerie.addprograma(a);
	trabajoSerie.addprograma(trabajoParalelo);
	trabajoSerie.addprograma(e);
	

	
	trabajoSerie.run();
    }
    
}
