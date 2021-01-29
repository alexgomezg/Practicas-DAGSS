package gof3_ejer2;
import gof3_ejer1.Logger;
import gof3_ejer1.Operation;
import java.util.ArrayList;

public class Resta extends Operation{
	

	
	@Override
	public String execute(ArrayList<String> lista) {
		
		float res;
		
		this.setProgress((float) 0.0);
		res  = Float.parseFloat(lista.get(0));
		this.setProgress((float) 0.5);
		res -= Float.parseFloat(lista.get(1));
		this.setProgress((float) 1.0);
		Logger log = Logger.getInstance();
		log.log("Log: Resta finalizada",Logger.INFO);
		return Float.toString(res);
	}

	@Override
	public String getName() {
		return "Resta";
	}

	@Override
	public ArrayList<String> getParameterNames() {
		
		ArrayList<String> nombre = new ArrayList<String>();
		
		nombre.add("Minuendo");
		nombre.add("Sustraendo");
		
		return nombre;
	}
	

	
	
}
