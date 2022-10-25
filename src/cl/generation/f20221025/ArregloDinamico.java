package cl.generation.f20221025;

import java.util.ArrayList;
import java.util.Iterator;

public class ArregloDinamico {

	public static void main(String[] args) {
		// ArrayList
		// 1.- Definicion
		// ArrayList<TIPODEDATO> nombre_array = new ArrayList<TIPODATO>();
		ArrayList<String> gupo4 = new ArrayList<String>();// podemos importar esta variables en lines 3 colocando
															// ctrl+shift+o
		// 2.- Agregar valores al arreglo
		gupo4.add("Teresa");// esto es para agregar valores al arreglo
		gupo4.add("Carlos");
		gupo4.add("Michel");
		gupo4.add("Ivan");
		gupo4.add("Igna");
		System.out.println(gupo4);

		// 3.- tamaño del arrayList
		System.out.println(gupo4.size());// nos entregara el tamaño de este tipo de arreglo el size
		// una formna facil de saber si estamos trabajando con un arreglo dinamico es el
		// size, y estatipo el length
		// length-> arreglo estatico; size-> arreglo dinbamico

		// 4.- obtener un elemento dentro del arreglo
		gupo4.get(1);// para inspeccionar el valos en esa posicion del arreglo
		System.out.println(gupo4.get(1));
		// System.out.println(gupo4.get(6)); esto estaria fuera del indice

		// 5.- como elimino un elemento del array
		gupo4.remove(2);// removemos el contenido del elemento 2 y se corren los valores posteriores
						// dentro del arreglo
		System.out.println(gupo4);

		// 6.- reccorrer el arrayList
		gupo4.add("Michel");
		for (int i = 0; i < gupo4.size(); i++) {// la diferencia es que en lugar de length es size
			System.out.println("El grupo 4 son: " + gupo4.get(i));
		}
		System.out.println("****************************");

		// for iterador o for de objetos
		System.out.println("Los integrantes del equipo 4 son:");
		for (String integrente : gupo4) { // se nombra una variable tipo string con un nombre significativo y le
											// señalamos que arreglo recorrera despues de los://Dependiendo del tipo de variable uso String al inicio o Integer para numeros o Long, etc
			System.out.println(integrente);
		}
		
		//ArrayList con numeros recorrido
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		numeros.add(2);
		numeros.add(3);
		numeros.add(4);
		numeros.add(5);
		System.out.println("Los numeros dentro del arreglo son:");
		for (Integer numero : numeros) { // for (tipoDeDato variable:Arreglo)
			System.out.println(numero);
		}
		
		// 7. como recorrer con while y iterator
		System.out.println("*********Iterador**********");
		Iterator it = gupo4.iterator();//iterator es un indice 
		while (it.hasNext()) //el Nex me dice que a la siguiente vuielta tome el siguiente valor
			System.out.println(it.next());

	}

}
