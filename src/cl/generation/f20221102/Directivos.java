package cl.generation.f20221102;

public class Directivos extends PersonaCurso{
	
	private String cargo;
	private String nombreInstitucion;
	public Directivos() {
		super();
	}
	public Directivos(String cargo, String nombreInstitucion) {
		super();
		this.cargo = cargo;
		this.nombreInstitucion = nombreInstitucion;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getNombreInstitucion() {
		return nombreInstitucion;
	}
	public void setNombreInstitucion(String nombreInstitucion) {
		this.nombreInstitucion = nombreInstitucion;
	}
	@Override
	public String toString() {
		return "Directivos [cargo=" + cargo + ", nombreInstitucion=" + nombreInstitucion + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
	
	
}
