package cl.generation.f20221102.interfaces;

public class Main {

	public static void main(String[] args) {
		// Interfases y clases abstractas

		// las clases abstractas no se pueden instanciar
		// Animal animal = new Animal();
		// en una clase abstracta es para definir metodos que solo van a se ingresados
		// en donde sean heredados

		Caballo caballo = new Caballo();
		caballo.setAltura(2.5f);

		Humano humano = new Humano();
		humano.metodoEnAnimal();

		Leon leon = new Leon();
		leon.setAltura(0.80f);
		leon.setPeso(200f);

		// imprimir los valores seteados
		System.out.println("Altura " + leon.getAltura());
		System.out.println("Peso " + leon.getPeso());
		System.out.println(leon.toString());

		// imprimir que come carne

		leon.metodoEnAnimal();

		System.out.println("*********************");
		// Persona

		Persona persona = new Persona();

		persona.setAltura(1.65f);
		persona.setPeso(75);
		persona.setRazonamiento(true);

		System.out.println(persona.toString());

		persona.comer();
		persona.respirar();
		persona.metodoEnAnimal();
	}

}
