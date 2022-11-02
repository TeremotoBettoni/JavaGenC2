package cl.generation.f20221102.poli;

public class Perro extends Mascota{
	
	private String sonido;

	public Perro() {
		super();
	}

	public Perro(String raza, String nombre, String sexo, String sonido) {
		super(raza, nombre, sexo);
		this.sonido = sonido;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	@Override
	public void emitirSonido() {
		System.out.println("El sonido (ladrido) es Guauguau");
	}
	

}
