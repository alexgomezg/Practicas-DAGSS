package gof1;

public class Atreides implements FamilyFactory{

	@Override
	public Artillero addArtillero() {
		System.out.println("Añado un artillero Atreides");
		return new ArtilleroAtreides();
		
	}

	@Override
	public Zapador addZapador() {	
		System.out.println("Añado un zapador Atreides");
		return new ZapadorAtreides();
	}

}
