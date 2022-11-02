package cl.generation.f20221102.poli;

public class Gato extends Mascota{
	
	private String sonido;

	public Gato() {
		super();
	}

	public Gato(String sonido) {
		super();
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + ", getRaza()=" + getRaza() + ", getNombre()=" + getNombre() + ", getSexo()="
				+ getSexo() + "]";
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("El sonido (maullido) es Miauuuu");
	}
	
	

}
