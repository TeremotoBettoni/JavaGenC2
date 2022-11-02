package cl.generation.f20221102;

public class Kineciologo extends EquipoBasquetball{

	private String titulo;
	private String especialidad;
	
	public Kineciologo() {
		super();
	}

	public Kineciologo(String titulo, String especialidad) {
		super();
		this.titulo = titulo;
		this.especialidad = especialidad;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	@Override
	public String toString() {
		return "Kineciologo [titulo=" + titulo + ", especialidad=" + especialidad + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	@Override // sobre escribiendo el metodo
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Kineciologo");
		
	}
	
	
	
	
}
