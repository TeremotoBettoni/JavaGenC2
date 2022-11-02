package cl.generation.f20221102;

public class Entrenador extends EquipoBasquetball{

	private int anios_experiencia;
	private String equipo;
	public Entrenador() {
		super();
	}
	
	public Entrenador(int anios_experiencia, String equipo) {
		super();
		this.anios_experiencia = anios_experiencia;
		this.equipo = equipo;
	}
	
	
	public Entrenador(String nombre, String apellido, int edad, int anios_experiencia, String equipo) {
		super(nombre, apellido, edad);// aqui estamos pasando al constructor padre los atribitos que quiero que se llenen de entrenador 
		this.anios_experiencia = anios_experiencia;
		this.equipo = equipo;
	}

	public int getAnios_experiencia() {
		return anios_experiencia;
	}
	public void setAnios_experiencia(int anios_experiencia) {
		this.anios_experiencia = anios_experiencia;
	}
	public String getEquipo() {
		return equipo;
	}
	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Entrenador [anios_experiencia=" + anios_experiencia + ", equipo=" + equipo + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	@Override // sobre escribiendo el metodo
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Entrenador");
		
	}
	

}
