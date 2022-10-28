package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Arreglo de tipo Estudiantel, que es la clase que creamos
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		
		Integer continuar = 2;

		do {
			// Crear la instancia al objeto estudiante
			Estudiante estudiante = new Estudiante();

			System.out.println("******Ingreso de estudiantes********");

			System.out.println("_______________________________");
			System.out.println("Ingrese nombre del estudiante: ");
			estudiante.setNombre(scanner.nextLine());// nex line nos ayuda a que sea mas de una palabra, es decir lee
														// toda la linea

			System.out.println("_______________________________");
			System.out.println("Ingrese apellido de estudiante: ");
			estudiante.setApellido(scanner.nextLine());

			estudiantes.add(estudiante);
			
			//ahora reescribimos la variable de control segun lo que quiera edl usuario
			System.out.println("Quiere agregar otro estudiante");
			System.out.println("1. SI   2. NO");// les damos las opciones al usuario
			continuar = scanner.nextInt();// dependiendo de lo que ingrese el estudiante de cumplira o no la condicion del while
			scanner.nextLine();

		} while (continuar == 1);
		
		
		System.out.println("*****************************");

		for (Estudiante estudiante : estudiantes) {//con este for lo que hacemos es recorrer e imprima todos los estudiantes ingresados
			System.out.println("Nombre " + estudiante.getNombre());// get para consultar el valor de un atributo
			System.out.println("Apellido " + estudiante.getApellido());
			System.out.println("*****************************");
		}

		// Obtenber un estudiante especifico
		System.out.println("_______________________________");
		System.out.println(estudiantes.get(0));// aqui es para consultar el obnjeto completo en la posicion 0 del array
		
		//Accedemos a un atributo del objeto
		System.out.println("_______________________________");
		System.out.println(estudiantes.get(0).getNombre());//esto es para consultar el objeto en la posicion 0 pero que solo me diga el atributo nombre
		

	}

}
