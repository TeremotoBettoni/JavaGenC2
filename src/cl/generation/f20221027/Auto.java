package cl.generation.f20221027;

public class Auto {
	// Atributos
	private String marca;// "Peugeot"// rpivaet es para limitar si puede entrar o no a ese valor
	private String color;// "Blanco"
	private String modelo;// "ñuñoqui"
	private Float cilindrada;// 1.6 o 2.4
	private Float rendimiento;// 10.5 km/l
	private Float velocidad;// 10.5 km/h
	public String text;

	// Constructor
	// nos permite instanciar al objeto
	// nos permite inicializar los atributos
	// boton derecho+source+generate constructor y puedesd elegir si lo creas con
	// todos los atributos o con ninguno y desde donde lo escribira

	public Auto() {// el constructos basio es para cuando creemos una instancia pero aun no sabemos
					// los valores del Auto en esete caso
		super();
	}

	public Auto(String marca, String color, String modelo, Float cilindrada, Float rendimiento, Float velocidad) {
		super();
		this.marca = marca;
		this.color = color;
		this.modelo = modelo;
		this.cilindrada = cilindrada;
		this.rendimiento = rendimiento;
		this.velocidad = velocidad;
	}

	// getters y setters o accesador y mutador
	// boton derecho+source+generate getters y setter

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(Float cilindrada) {
		this.cilindrada = cilindrada;
	}

	public Float getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Float rendimiento) {
		this.rendimiento = rendimiento;
	}

	public Float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(Float velocidad) {
		this.velocidad = velocidad;
	}

	// metodo del objeto (acciones)
	public void avanzar() {
		System.out.println("Estoy dentro de el metodo del objeto");
	}

	// metodo que estamos eredando
	// boton derecho+source+generate toString
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", modelo=" + modelo + ", cilindrada=" + cilindrada
				+ ", rendimiento=" + rendimiento + ", velocidad=" + velocidad + "]";
	}

}
