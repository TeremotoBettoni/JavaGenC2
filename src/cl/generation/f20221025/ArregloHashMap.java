package cl.generation.f20221025;

import java.util.HashMap;
import java.util.Iterator;

public class ArregloHashMap {

	public static void main(String[] args) {
		// 1.- Definicion HashMap
		// HashMap<String, String> grupo4 = new HashMap<String, String>();// estas dentro del <clave, valor>
		HashMap<String,String> grupo4 = new HashMap<String,String>();// pueden ser tipos de dato Integer o cualquier otro, no necesesariamente String
															
		// 2.- Agregar valores al arreglo
		grupo4.put("Bettoni", "Teresa");
		grupo4.put("Ancapi", "Carlos");
		grupo4.put("Zapata", "Ivan");
		grupo4.put("Carrasco", "Igna");
		grupo4.put("Espinoza", "Michel");
		grupo4.put("Carrasco", "Inita");// esto sobreescribira la clave ya que solo puede haber una
		
		System.out.println(grupo4);// al igual que HashSet se imprimen de manera aleatorio
		System.out.println("**************************************");
		
		//3.- tamaño del HashMap
		System.out.println(grupo4.size());
		System.out.println("**************************************");
		
		//4.- obtener un elemento dentro del HashMap
		System.out.println(grupo4.get("Ancapi"));// la palabla o clave "Ancapi" seria el equivamlente a indice
		System.out.println("**************************************");
		
		//5.- Eliminar un par de datos del HasMap
		grupo4.remove("Zapata");
		System.out.println(grupo4);
		System.out.println("**************************************");
		
		// 6.- como recorrer el HashMap
		for (String apellidos : grupo4.keySet()) {// aqui se imprimen las claves
			System.out.println("claves: "+apellidos+", valores: "+grupo4.get(apellidos));
		}
		System.out.println("**************************************");
		
		for (String nombres : grupo4.values()) {// aqui se imprimen los valores
			System.out.println(nombres);
		}
		System.out.println("**************************************");
		
		Iterator it = grupo4.keySet().iterator();
		while(it.hasNext()){
		    String apellido = (String)it.next(); 
		    String nombre = grupo4.get(apellido);
		    System.out.println("apellido: " + apellido + ", nombre: " + nombre);
		}
		
		
	}

}
