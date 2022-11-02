package cl.generation.f20221102;

public class Profesor extends PersonaCurso{
	private int aniosExperiencia;
	private String asignatura;
	
	public Profesor() {
		super();
	}

	public Profesor(int aniosExperiencia, String asignatura) {
		super();
		this.aniosExperiencia = aniosExperiencia;
		this.asignatura = asignatura;
	}

	public int getAniosExperiencia() {
		return aniosExperiencia;
	}

	public String getAsignatura() {
		return asignatura;
	}

	public void setAniosExperiencia(int aniosExperiencia) {
		this.aniosExperiencia = aniosExperiencia;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}

	@Override
	public String toString() {
		return "Profesor [aniosExperiencia=" + aniosExperiencia + ", asignatura=" + asignatura + ", getNombre()="
				+ getNombre() + ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}
	
}
