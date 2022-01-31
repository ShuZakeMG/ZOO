package zoo;

public class Zvire {
	
	private int datumNarozeni;
	private int casKrmeni;
	private int pocetKrmeniZaDen;
	private String jmenoZvirete;
	private boolean vyskytVCesku;
	
	public Zvire(int datumNarozeni, String jmenoZvirete, boolean vyskytVCesku) {
		super();
		this.datumNarozeni = datumNarozeni;
		this.jmenoZvirete = jmenoZvirete;
		this.vyskytVCesku = vyskytVCesku;
	}
	
	public void vypisInformace() {
		System.out.println("Datum narozen�: " + datumNarozeni + " Jm�no zv��ete: " + jmenoZvirete + " v�skyt v �esku: " + vyskytVCesku);
	}
	
	public int getDatumNarozeni() {
		return datumNarozeni;
	}

	public int getcasKrmeni() {
		return casKrmeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public String getJmenoZvirete() {
		return jmenoZvirete;
	}

	public boolean isVyskytVCesku() {
		return vyskytVCesku;
	}
	
	public void setcasKrmeni(int casKrmeni) {
		casKrmeni = casKrmeni;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}
	
	
	

}
