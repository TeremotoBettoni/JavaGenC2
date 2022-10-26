package cl.generation.f20221026;

import java.util.Scanner;

public class Actividad {

	public static void main(String[] args) {
		// 
		String fullName = getNombreCompleto();
		Float IMC = calculoIMC();
		int edadPersona = edad();
		
		System.out.println("El nombre del paciente es: "+fullName+", de edad: "+edadPersona+", la cual tiene un IMC de: "+IMC);

	}
	public static String getNombreCompleto() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese su nombre");
		String nombreCompleto = sc.next();
		System.out.println("Tu nombre es: "+nombreCompleto);
		sc.close();
		return nombreCompleto;
	}
	
	public static int edad() {
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		do {

			System.out.println("Ingresa tu edad");
			edad = sc.nextInt();

		} while (edad < 18);

		System.out.println("Edad ingresada " + edad);
		
		sc.close();
		return edad;
	}
	
	public static Float calculoIMC() {
		// Capturara datos ingresados por el usuario
		Scanner sc = new Scanner(System.in);// declaracion de variable tipo Scanner nombreDeVariable = new
											// Scanner(System.in)
		// calculo de IMC; imc= kilos/(estatura*estatura);
		// en el caso de los kilos,. son datos tipo float

		System.out.println("Ingrese su pero en kilogramos");

		Float peso = sc.nextFloat();// aqui le pedimos al usuario ingresar los datos, dependiendo del sistema colocando el sc que declare en variable scanne + el .nextFloat()
									// operativo ingresamos los numeros con . o ,
		System.out.println("El peso del paciente es: " + peso);

		System.out.println("Ingrese la altura en metros");
		Float altura = sc.nextFloat();// aqui le pedimos al usuario ingresar los datos de altura
		System.out.println("La altura del paciente es: " + altura);

		Float IMC = peso / (altura * altura);
		
		nivelIMC(IMC);// y aqui llamamos a la funcion o metodo para que nos arroje el nivel en el que estamos

		sc.close(); // aqui cierro la variable
		return IMC;
	}
	public static void nivelIMC(Float IMC) {
		/*
		 * Por debajo de 18.5 Bajo peso 
		 * 18.5 - 24.9 Normal 
		 * 25.0 - 29.9 Sobrepeso 
		 * 30.0 o más Obeso
		 */
		
		if(IMC<18.5) {
			System.out.println("El paciente esta bajo de peso");
		}else if (IMC>=18.5 && IMC<25) {// le colocamos 25 para que tome todo los decimales desde 24.999999 y menores
			System.out.println("El paciente esta en el rango normal");
		}else if (IMC>=25 && IMC<30) {
			System.out.println("El paciente esta con sobrepeso");
		}else {
			System.out.println("El paciente esta con obecidad");
		}
		

	}

}
