package cl.generation.f20221027;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		// Menu para que el usuario decida que hacer
		// Termionar la ejecucion
		menu();

		// Calculadoran con las 4 operaciones basicas
		// Solicitar y capturar 2 numeros float o double, y primitivo porque solo vamos
		// a operar con ello
		// Imprimir el resultado y guardar en una variable
		// Ofrecer opciones de repeticion (Bucles)
		// Definir metodos
		// Validaciones
		// Limpiar las variables

	}

	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4; // aqui contaremos la cantidad de oportunidades que tiene el usuario de
									// seleccionar una opcion correcta
		System.out.println("*********************");
		System.out.println("   MENU DE OPCIONES  ");
		System.out.println("*********************");
		System.out.println("1.-     SUMA        *");
		System.out.println("2.-     RESTA       *");
		System.out.println("3.-     MULTIPLICAR *");
		System.out.println("4.-     DIVIDIR     *");
		System.out.println("0.-     SALIR       *");
		System.out.println("*********************");

		do {
			System.out.println("*Selecciona una opcion*");
			opciones = sc.nextInt();

			// si la opcion es 0, salir del do While
			if (opciones == 0) {
				System.out.println("Ustes ha salido del programa");
				break;// termino el do while
			}

			if (opciones < 0 || opciones > 4) { // condicion de error,solo cuando ingreso valores fuera del rango de
												// opciones nos muestre la cantidad de opciones restantes
				contadorErrores--;// aqui vamos descontando cada vez que comete errores iniciando desde 4 cumo
									// declaramos en la creacion de la variable
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}

			if (contadorErrores == 0) {// aqui anunciamos que cuando el contadorErrores llegue a 0 se detenga la
										// funsion
				System.out.println("Agoto la cantidad de intentos");
				break;
			}

		} while (opciones < 0 || opciones > 4);

		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {// solo ingresara para opciones 1,2,3 y 4
			// System.out.println("Fuera del while " + opciones);// esto es solo para
			// nosotros, en el desarrollo debemos
			// quitarlo
			// solicitar 2 numeros
			System.out.println("*Ingresar primer valor*");
			float numero1 = sc.nextFloat();
			System.out.println("*Ingresar segundo valor*");
			float numero2 = sc.nextFloat();

			float resultado = 0;

			switch (opciones) {// nos ayuda para definir casos
			case 1:// SUMAR
				resultado = numero1 + numero2;
				System.out.println("El resultado es igual a: " + resultado);
				break;
			case 2:// RESTAR
				resultado = numero1 + numero2;
				System.out.println("El resultado es igual a: " + resultado);
				break;
			case 3:// MULTIPLICACION
				resultado = numero1 * numero2;
				System.out.println("El resultado es igual a: " + resultado);
				break;
			case 4:// DIVISION
				if (numero2 == 0) {
					System.out.println("NO SE PUEDE DIVIDIR");
					System.out.println("Ingresar de nuevo el segundo numero");
					numero2 = sc.nextFloat();
					resultado = numero1 / numero2;
					System.out.println("El resultado es igual a: " + resultado);
				} else {
					resultado = numero1 / numero2;
					System.out.println("El resultado es igual a: " + resultado);
				}
				break;

			default:
				System.out.println("Opción no valida");
				break;
			}
		}

	}
	

}
