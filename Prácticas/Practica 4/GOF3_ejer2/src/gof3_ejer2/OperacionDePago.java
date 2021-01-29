package gof3_ejer2;
import gof3_ejer1.Operation;
import java.util.ArrayList;

public class OperacionDePago extends Operation{
	
	private Operation o;
	
	public OperacionDePago(Operation o) {
		this.o = o;	
	}
	@Override
	public String execute(ArrayList<String> lista) {
		if(LicenceManager.checkIsFullVersion()) {
			return o.execute(lista);
		}else {
			return "Es una operación de pago, debes comprar la operación premiun";
		}
	}
	@Override
	public String getName() {
		return o.getName();
	}
	@Override
	public ArrayList<String> getParameterNames() {	
		return o.getParameterNames();
	}	
}
