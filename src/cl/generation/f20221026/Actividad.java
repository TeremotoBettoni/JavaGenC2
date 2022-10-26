package cl.generation.f20221026;

import java.util.Scanner;

public class Actividad {

	public static void main(String[] args) {
		//
		String fullName = getNombreCompleto();
		int edadPersona = edad();
		Float IMC = calculoIMC();
		
		System.out.println("El nombre del paciente es: " + fullName+". De edad: " + edadPersona+". Tiene un IMC de: " + IMC);
	}

	
	public static String getNombreCompleto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingresa tu nombre");
		String nombre= sc.next();
		System.out.println("ingresa tu apellido paterno");
		String apePaterno= sc.next();
		System.out.println("ingresa tu apellido materno");
		String apeMaterno= sc.next();
		String nombreCompleto = nombre+" "+apePaterno+" "+apeMaterno;
		//sc.close();
		return nombreCompleto;
	}

	public static int edad() {
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		do {

			System.out.println("Ingresa tu edad");
			edad = sc.nextInt();

		} while (edad < 18);

		//sc.close();
		return edad;
	}

	public static Float calculoIMC() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ingrese su pero en kilogramos");

		Float kilo = sc.nextFloat();
		System.out.println("El kilo del paciente es: " + kilo);

		System.out.println("Ingrese la altura en metros");
		Float altura = sc.nextFloat();
		System.out.println("La altura del paciente es: " + altura);

		Float IMC = kilo / (altura * altura);

		nivelIMC(IMC);

		//sc.close(); 
		return IMC;
	}

	public static void nivelIMC(Float IMC) {

		if (IMC < 18.5) {
			System.out.println("El paciente esta bajo de kilo");
		} else if (IMC >= 18.5 && IMC < 25) {// le colocamos 25 para que tome todo los decimales desde 24.999999 y
												// menores
			System.out.println("El paciente esta en el rango normal");
		} else if (IMC >= 25 && IMC < 30) {
			System.out.println("El paciente esta con sobrekilo");
		} else {
			System.out.println("El paciente esta con obecidad");
		}

	}

}
