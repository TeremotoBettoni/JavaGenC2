package cl.generation.f20221102;

public class Alumnos extends PersonaCurso{
	
	private String curso;

	public Alumnos() {
		super();
	}

	public Alumnos(String curso) {
		super();
		this.curso = curso;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "alumnos [curso=" + curso + ", getNombre()=" + getNombre() + ", getApellido()=" + getApellido()
				+ ", getEdad()=" + getEdad() + "]";
	}
	

}
