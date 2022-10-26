package cl.generation.f20221026;

import java.util.Scanner;// la importacion de la variable Scanner

public class CapturaDatos {

	public static void main(String[] args) {
		Float IMC = calculoIMC();
		//DecimalFormat formato = new DecimalFormat ("#.00");// esto nos ayuda a limitar la cantidad de decimales del float o double
		//System.out.println("El IMC del paciente es: " + formato.format(IMC));// al momento de imprimir llamamos a la variable formato.format y dentro le decimos el valor a imprimir, en este caso la variable IMC
		System.out.println("El IMC del paciente es: " + IMC);
		
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
