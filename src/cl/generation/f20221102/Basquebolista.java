package cl.generation.f20221102;

public class Basquebolista extends EquipoBasquetball{
	
	private Float altura;
	private Float peso;
	
	public Basquebolista() {
		super();
	}

	public Basquebolista(Float altura, Float peso) {
		super();
		this.altura = altura;
		this.peso = peso;
	}

	public Float getAltura() {
		return altura;
	}

	public void setAltura(Float altura) {
		this.altura = altura;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Basquebolista [altura=" + altura + ", peso=" + peso + ", getNombre()=" + getNombre()
				+ ", getApellido()=" + getApellido() + ", getEdad()=" + getEdad() + "]";
	}

	@Override // sobre escribiendo el metodo
	public void metodoImprimir() {
		System.out.println("Estoy en el metodo de la clase hija Basquetbolista");
		
	}
	
}
