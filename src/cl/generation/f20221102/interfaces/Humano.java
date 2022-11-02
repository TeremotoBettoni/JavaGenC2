package cl.generation.f20221102.interfaces;

public class Humano extends Omnivoro implements Generico{
	
	private boolean razonamiento;

	public Humano() {
		super();
	}

	public Humano(boolean razonamiento) {
		super();
		this.razonamiento = razonamiento;
	}

	public boolean isRazonamiento() {
		return razonamiento;
	}

	public void setRazonamiento(boolean razonamiento) {
		this.razonamiento = razonamiento;
	}

	@Override
	public void respirar() {
		System.out.println("Respira aire");
		
	}

	@Override
	public void comer() {
		System.out.println("El humano come de todo");
		
	}
	
	

}
