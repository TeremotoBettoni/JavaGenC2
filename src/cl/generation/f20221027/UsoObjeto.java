package cl.generation.f20221027;

public class UsoObjeto {

	public static void main(String[] args) {
		// Crear una instancia de clase
		Auto auto1 = new Auto();// no tenemos que importar pues esta dentro del mismo package// lo que esta
								// entre parentecis sera el constructos
		auto1.text = "fgbsf"; // este atribito ya que es publico en la cloase Auto lo podemos modificar
		// auto1.color = "Rojo"; esto no nos deja ya que es privado
		// solo podemos asignar valores a los atribitos privados de la sig manera
		auto1.setColor("Rojo");// solo se podra con .set
		auto1.setMarca("Peugeot");

		// consultar el contenido de los atributos
		System.out.println("El valor del atributo color es: " + auto1.getColor());
		System.out.println("El valor del atributo modelo es: " + auto1.getModelo());

		// Para saber el contenido de los atributos
		System.out.println(auto1.toString());
		
		//nueva instancia de Auto
		// en esta la instancia llega con ya valores predeterminados
		//no se puede sobreescribir
		Auto car = new Auto("Nissan","Negro","Qashqai",1.6f,10.0f,240f);
		System.out.println(car.getModelo());
		
		auto1.setRendimiento(8.0f);
		
		System.out.println(car.toString());
		
		//La instancia de una clase es la rewferenmciua a un objeto

	}

}
