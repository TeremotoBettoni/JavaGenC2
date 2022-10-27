package cl.generation.f20221027;

import java.util.Scanner;
import java.lang.Math;

public class ActividadGrupal {

	public static void main(String[] args) {
		// Un programa que realice el calculo de las areas y perimetro de triangulos, rectangulos y cicunferencias usando Math
		//menu con la seleccion de figura
		//sabes la fiugura geometrica
		menu();
		
	
	}
	public static void menu() {
		Scanner sc = new Scanner(System.in);
		int opciones = 0;
		int contadorErrores = 4;
		System.out.println("*********************");
		System.out.println("   MENU DE OPCIONES  ");
		System.out.println("*********************");
		System.out.println("1.-  Triangulo      *");
		System.out.println("2.-  Rectangulo     *");
		System.out.println("3.-  Circunferencia *");
		System.out.println("0.-  SALIR          *");
		System.out.println("*********************");
		
		do {
			System.out.println("*Selecciona una opcion*");
			opciones = sc.nextInt();

			// si la opcion es 0, salir del do While
			if (opciones == 0) {
				System.out.println("Usted ha salido del programa");
				break;// termino el do while
			}

			if (opciones < 0 || opciones > 3) {
				contadorErrores--;
				System.out.println("Te quedan " + contadorErrores + " intentos");
			}

			if (contadorErrores == 0) {
				System.out.println("Agoto la cantidad de intentos");
				break;
			}

		} while (opciones < 0 || opciones > 3);
		
		if (opciones == 0 || contadorErrores == 0) {
			System.out.println("Adios!!");
		} else {

			float area = 0;
			float perimetro =0;

			switch (opciones) {// nos ayuda para definir casos
			case 1:// TRIANGUO //Esto es para triangulo rectangulo
				float altura = 0;
				float altura2 = 0;
				float areaTriangulo = 0;
				
				System.out.println("*Ingresar valor de base de triangulo en centimetros*");
				float basetriangulo = sc.nextFloat();
				System.out.println("*Ingresar valor de lado2 de triangulo en centimetros*");
				float lado2 = sc.nextFloat();

				float lado1Alcuadrado = basetriangulo * basetriangulo;
				float lado2Alcuadrado = lado2 * lado2;

				if (lado1Alcuadrado > lado2Alcuadrado) {

					altura2 = lado1Alcuadrado - lado2Alcuadrado;
				} else if (lado2Alcuadrado > lado1Alcuadrado) {

					altura2 = lado2Alcuadrado - lado1Alcuadrado;
				}

				altura = (float) Math.sqrt(altura2);
				perimetro = lado1Alcuadrado + lado2;
				areaTriangulo = (basetriangulo * altura) / 2;
				System.out.println("El area de el triangulo es: " + areaTriangulo + " cm2");
				System.out.println("El perimetro de el triangulo es: " + perimetro + " cm2");
				
				break;
			case 2:// RECTANGULO
				System.out.println("*Ingresar valor de base de rectangulo*");
				float base2 = sc.nextFloat();
				System.out.println("*Ingresar valor del lado de rectangulo*");
				float lado = sc.nextFloat();
				area = base2+lado;
				perimetro = (base2*2)+(lado*2);
				System.out.println("El area del rectangulo es: "+area+"cm2");
				System.out.println("El perimetro ddel rectangulo es: "+perimetro+"cm2");
				
				break;
			case 3:// CIRCUNFERENCIA
				System.out.println("*Ingresar valor del radio en centimetros*");
				float radio = sc.nextFloat();
				area =  (float)(Math.PI*(Math.pow(radio,2)));
				perimetro = (float) (2*Math.PI*radio);
				
				System.out.println("El area de la circunferencia es: "+area+"cm2");
				System.out.println("El perimetro de la circunferencia es: "+perimetro+"cm2");
				break;

			default:
				System.out.println("Opción no valida");
				break;
			}
		}
		
	}

}
