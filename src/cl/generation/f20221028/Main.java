package cl.generation.f20221028;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Instanciar estudiante
		// Estudiante estudiante = new Estudiante("Teresa","Bettoni", "26936338-k");
		// System.out.println(estudiante.toString());
		// estudiante.setEdad(3);
		// estudiante.setCorreo("mtbettoni@gmail.com");
		// estudiante.setCurso("1A");

		// crear un arreglo dinamico que ingrese los nombre de todos estudiantes de una
		
		ingresoEstud();	
		
	}

	public static void ingresoEstud() {
		Scanner scanner = new Scanner(System.in);
		//Arreglo de estudiantes
		ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
		Integer continuar = 2;
		
		do {
			// Crear la instancia al objeto estudiante
			Estudiante estudiante = new Estudiante();
			System.out.println("******Ingreso de estudiantes********");
			System.out.println("_______________________________");
			System.out.println("Ingrese nombre del estudiante: ");
			estudiante.setNombre(scanner.nextLine());//nex line nos ayuda a que sea mas de una palabra, es decir lee toda la linea
			System.out.println("_______________________________");
			System.out.println("Ingrese apellido de estudiante: ");
			estudiante.setApellido(scanner.nextLine());
			System.out.println("_______________________________");
			System.out.println("Ingrese edad del estudiente: ");
			estudiante.setEdad(scanner.nextInt());
			System.out.println("_______________________________");
			System.out.println("Ingrese rut del estudiente: ");
			estudiante.setRut(scanner.next());
			System.out.println("_______________________________");
			System.out.println("Ingrese curso de estudiante: ");
			estudiante.setCurso(scanner.next());
			System.out.println("_______________________________");
			System.out.println("Ingrese correo de estudiante: ");
			estudiante.setCorreo(scanner.next());
			estudiantes.add(estudiante);
			
			System.out.println("Quiere agregar otro estudiante");
			System.out.println("1. SI   2. NO");
			continuar = scanner.nextInt();
			scanner.nextLine();
			
		} while (continuar==1);
		
		

	}
	
	public static void recorrerArreglo(ArrayList<Estudiante> estudiantes) {
		System.out.println("*****************************");
		
		for (Estudiante estudiante : estudiantes) {
			System.out.println("Nombre "+estudiante.getNombre());
			System.out.println("Apellido "+estudiante.getApellido());
		}
		
	}
	


}
