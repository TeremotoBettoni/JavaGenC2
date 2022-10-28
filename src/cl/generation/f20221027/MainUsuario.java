package cl.generation.f20221027;

import java.util.Scanner;

public class MainUsuario {

	public static void main(String[] args) {
		// creamos la instancia de la clase
		Usuario persona = new Usuario();
		
		System.out.println("*Ingreso de datos de usuario*");
		Scanner sc = new Scanner(System.in);
		System.out.println("***********************");
		System.out.println("Ingresa nombre");
		persona.setNombre(sc.next());
		System.out.println("***********************");
		System.out.println("Ingresa apellido");
		persona.setApellido(sc.next());
		System.out.println("***********************");
		System.out.println("Ingresa edad");
		persona.setEdad(sc.nextInt());
		System.out.println("***********************");
		System.out.println("Ingresa correo");
		persona.setCorreo(sc.next());
		System.out.println("***********************");
		System.out.println("Ingresa telefono");
		persona.setTelefono(sc.nextInt());
		System.out.println("*****************************************************************");
		
		System.out.println(persona);
	}

}
