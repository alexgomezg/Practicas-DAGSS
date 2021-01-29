package gof3_ejer2;
import gof3_ejer1.Logger;
import gof3_ejer1.Operation;
import java.util.ArrayList;

public class Raiz extends Operation{
	
	
	
	@Override
	public String execute(ArrayList<String> lista) {
		
		double res;
		
		this.setProgress((float) 0.0);
		res  = Math.sqrt(Double.parseDouble(lista.get(0)));
		this.setProgress((float) 1.0);
		Logger log = Logger.getInstance();
		log.log("Log: Raiz finalizada",Logger.INFO);
		
		return Double.toString(res);
	}

	@Override
	public String getName() {
		return "Raiz";
	}

	@Override
	public ArrayList<String> getParameterNames() {
		
		ArrayList<String> nombre = new ArrayList<String>();
		
		nombre.add("Radicando");
		
		return nombre;
	}
}
