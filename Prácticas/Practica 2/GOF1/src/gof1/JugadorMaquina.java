package gof1;

public class JugadorMaquina extends Jugador {
	
	public JugadorMaquina(String tipo) {
		super(tipo);
	}

	@Override
	public void jugar() {
		for (Artillero artillero : artilleros){
			artillero.disparar();
		}
		for (Zapador zapador: zapadores){
			zapador.ponerBomba();
		}

	}

}
