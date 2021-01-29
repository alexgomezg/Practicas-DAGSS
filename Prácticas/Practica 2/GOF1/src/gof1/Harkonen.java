package gof1;

public class Harkonen implements FamilyFactory{


	@Override
	public Artillero addArtillero() {
		System.out.println("Añado un artillero Harkonen");
		return new ArtilleroHarkonen();
		
	}

	@Override
	public Zapador addZapador() {
		System.out.println("Añado un artillero Harkonen");
		return new ZapadorHarkonen();
	}
	


}
