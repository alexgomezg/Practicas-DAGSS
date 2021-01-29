package gof3_ejer2;
import gof3_ejer1.Application;
import gof3_ejer1.Operation;
import java.util.ArrayList;

public class Calculadora extends Application{
 
	public ArrayList<Operation> createOperations() {
		ArrayList<Operation> list = new ArrayList<Operation>();
		list.add(new Suma());
		list.add(new Resta());
		list.add(new OperacionDePago(new Raiz()));
		
		return list;
	}
	
	public static void main (String [ ] args) {

		new Calculadora().run();
	}

}
