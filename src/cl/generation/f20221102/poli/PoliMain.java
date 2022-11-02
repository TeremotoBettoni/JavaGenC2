package cl.generation.f20221102.poli;

public class PoliMain {

	public static void main(String[] args) {
		// Polimorfismo

		Mascota mascota = new Mascota();
		mascota.emitirSonido();

		Gato gato = new Gato();
		gato.emitirSonido();

		Perro perro = new Perro();
		perro.emitirSonido();

		/************* Polimorfismo *****************/

		/*
		 * Una super clase se comporta como una clase hija, pero no0 es la clase hija
		 * Para que exista el polimporfismo debe haber una herencia
		 */

		System.out.println();
		Mascota regalon = new Perro();
		regalon.emitirSonido();
		System.out.println(regalon.toString()); 

		Mascota michi = new Gato();
		michi.emitirSonido();
		
		michi.horasSiestav(16.5f);

	}

}
