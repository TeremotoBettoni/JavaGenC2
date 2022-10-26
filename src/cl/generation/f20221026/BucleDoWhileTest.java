package cl.generation.f20221026;

import java.util.Scanner;

public class BucleDoWhileTest {

	public static void main(String[] args) {
		// doWhile
		// a lo menos se ejecuta 1 vez
		Scanner sc = new Scanner(System.in);
		int edad = 0;
		Float kilo = 0f;
		Float altura= 0f;

		do {// aqui ingreso lo que se va a imprimir o ejecutar hasta la que la condicion de terminbo en el while se cumpla

			System.out.println("Ingresa tu edad");
			edad = sc.nextInt();

		} while (edad < 18);// aqui condicionamos para que vuelva a pedir la edad siempre que sea menor a 18

		System.out.println("Edad ingresada " + edad);
		
		do {

			System.out.println("Ingresa tu pero en kilos");
			kilo = sc.nextFloat();

		} while (kilo<40 || kilo>150);
		
		System.out.println("Peso ingresado es: "+kilo);
		
		do {

			System.out.println("Ingresa tu altura");
			altura = sc.nextFloat();

		} while (altura<1.20 || altura>2.66);
		
		System.out.println("Altura ingresado es: "+altura);
		
		sc.close();
	}


}
