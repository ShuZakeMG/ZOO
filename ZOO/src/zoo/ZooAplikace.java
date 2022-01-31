package zoo;

public class ZooAplikace {

	public static void main(String[] args) {
		
		Zvire zvire = new Zvire(1, "Augustus", true);
		zvire.vypisInformace();
		
		Savec savec = new Savec(2, "Augustus Tøetí", true, 38.2);
		savec.vypisInformace();
		
		Plaz plaz = new Plaz(3, "Mrk", true);
		plaz.vypisInformace();
		
		Pes pes = new Pes(4, "Milan", true, 37.6);
		pes.vypisInformace();
		
		Medved medved = new Medved(5, "Smrk", true, 40.0);
		medved.vypisInformace();
		
		Had had = new Had(6, "Krupicová Kaše", true);
		had.vypisInformace();
		
		Zelva zelva = new Zelva(7, "Flash", true);
		zelva.vypisInformace();
		
		Krokodyl krokodyl = new Krokodyl(8, "Stun Seed", true);
		krokodyl.vypisInformace();
	}

}
