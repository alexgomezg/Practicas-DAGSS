package gof1;
import java.util.LinkedList;
import java.util.List;

public abstract class Jugador {

    protected List<Artillero> artilleros = new LinkedList<Artillero>();
    protected List<Zapador> zapadores = new LinkedList<Zapador>();
    protected FamilyFactory factoria;
    protected String tipo;

    public Jugador(String tipo) {
        this.tipo = tipo;
        //Aqui se añadiriran las nuevas familias de soladados
        if (tipo.equals("Atreides")) {
            factoria = new Atreides();
        }
        if (tipo.equals("Harkonen")) {
            factoria = new Harkonen();
        }

        artilleros.add(factoria.addArtillero());
        artilleros.add(factoria.addArtillero());
        zapadores.add(factoria.addZapador());
        zapadores.add(factoria.addZapador());

    }

    public abstract void jugar();
}
