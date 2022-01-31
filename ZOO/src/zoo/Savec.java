package zoo;

public class Savec extends Zvire {
	
	final boolean teplokrevnost = true;
	public double teplotaZvirete;

	public Savec(int datumNarozeni, String jmenoZvirete, boolean vyskytVCesku, double teplotaZvirete) {
		super(datumNarozeni, jmenoZvirete, vyskytVCesku);
		this.teplotaZvirete = teplotaZvirete;		
	}
	
	public void vydejZvuk(String citoslovce) {
		System.out.println("Savec dìlá: " + citoslovce);
	}

}
