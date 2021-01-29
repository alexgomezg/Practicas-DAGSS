/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Alex
 */
package gof3_ejer1;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public abstract class Application implements Observer{

	private int numOperacion;
	private ArrayList<String> valores;
	private Operation o;
	private Scanner reader;
	
	public void run() {	
		while(true) {
			menu();
			getOperation();
			runSelectOpc();
		}
	}
	protected void menu() {
		System.out.println("Menu");	
		System.out.println("Escoge la operacion deseada");	
		
		int i = 0;
		for(Operation o: createOperations()) {
			System.out.println(i + " - " + o.getName());
			i++;
		}
		
		reader = new Scanner(System.in);
		 numOperacion = -1;
		do {				
			  try {
				  numOperacion = reader.nextInt();
				  reader.nextLine();
			  } catch (InputMismatchException ime){
			    System.out.println(" Solo puedes insertar números. ");
			  }
		} while (numOperacion<0);
		System.out.println("Opcion seleccionada : " + numOperacion);
	}
	
	protected void getOperation() {
		o = createOperations().get(numOperacion);
		List<String> parametros = o.getParameterNames();
	    reader = new Scanner(System.in);
		valores = new ArrayList<>();
		String valor = "";
		for(String p : parametros) {
			do {
				System.out.println("Introduce el valor del parametro: " + p);	

				valor = reader.nextLine();
			}while(valor == "");
			valores.add(valor);
		}
	}
	
	protected  void runSelectOpc() {
	
		String resultado = o.execute(valores);	
		System.out.println("El resultado de la operacion " + o.getName() + " es " + resultado);
	}


	public abstract ArrayList<Operation> createOperations();//Factory Method
	
	public synchronized void update(Observable observado, Object data){		
		System.out.println(((Operation)observado).getProgress());			
	}
	
	
}
