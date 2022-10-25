package cl.generation.f20221025;

import java.util.HashSet;
import java.util.Iterator;

public class ArregloHashSet {// cuidado al poner nombres reservados en las clases

	public static void main(String[] args) {
		// set o HashSet
		//otro tipo de arreglo dinamico
		// HashSet<TIPODATO> nombre_array = new HashSet<TIPODATO>();
		HashSet<String> grupo4 = new HashSet<String>();
		
		//2.-agregar elementos// esto no sigue un orden de ingreso, es decir que es aleatorio
		grupo4.add("Teresa");
		grupo4.add("Carlos");
		grupo4.add("Teresa");// al repetir el nombre solo se agrega 1 tipo de dato ya que no permite duplicados (sensible a mayusculas y minisculas)
		grupo4.add("Michel");
		grupo4.add("Ivan");
		grupo4.add("Igna");
		System.out.println(grupo4);
		
		//3.- verificar el contenido del array, nos ayuda a verificar si un elemento existe en el arreglo o no
		boolean verificacionNombre = grupo4.contains("Teresa");// nos retornara true si tiene el valor especifico, sino arrojara false
		System.out.println("Existe el integrante? "+verificacionNombre);
		
		//4.- como eliminar un elemento
		grupo4.remove("Carlos");// con remove eliminamos elñ dato o elemento exacto del arreglo
		System.out.println(grupo4);
		
		//5.- como saber el tamaño del arreglo
		grupo4.size();
		System.out.println("Tamaño del hashSet es: "+grupo4.size());// los datos repetidos no se cuentan
		
		//6.- recorrer el arreglo
		System.out.println("**************************************");
		System.out.println("Los integrantes del array son: ");
		for (String integrantes: grupo4) {// se recorren de igual manera
			System.out.println(integrantes);
		}
		
		// 7. como recorrer copn while y iterator
		System.out.println("*********Iterador**********");
		Iterator it = grupo4.iterator();//iterator es un indice 
		while (it.hasNext()) //el Nex me dice que a la siguiente vuielta tome el siguiente valor
			System.out.println(it.next());
				
	}

}
