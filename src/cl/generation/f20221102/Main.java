package cl.generation.f20221102;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// Instancia de los objetos
		Entrenador entrenador = new Entrenador();
		entrenador.setNombre("Jhon");
		entrenador.setApellido("Doe");
		entrenador.setEdad(55);
		entrenador.setAnios_experiencia(10);
		entrenador.setEquipo("Valdivia");
		
		System.out.println(entrenador.toString());
		
		Kineciologo kine= new Kineciologo();
		kine.setNombre("Jane");
		kine.setApellido("Doe");
		kine.setEdad(52);;
		kine.setTitulo("Kinesiologia");
		kine.setEspecialidad("En musculo");
		ArrayList<Basquebolista> listaJugadores = new ArrayList<Basquebolista>();
	
		
		Basquebolista basque= new Basquebolista();
		basque.setNombre("Machel");
		basque.setApellido("Pipen");
		basque.setAltura(2.15f);
		
		listaJugadores.add(basque); // agregando un objeto a la lista
		
		Basquebolista basque2= new Basquebolista();
		basque2.setNombre("Stevee");
		basque2.setApellido("Curry");
		basque2.setAltura(2.5f);
		
		listaJugadores.add(basque2);
		
		// Recorrer lista
		for (Basquebolista jugador : listaJugadores) {
			System.out.println(jugador.toString());
		}
		
	}

}
