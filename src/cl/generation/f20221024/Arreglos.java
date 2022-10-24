package cl.generation.f20221024;

import java.util.Arrays;

public class Arreglos {

	public static void main(String[] args) {
		// Arreglos o array en Java (Estaticos, es decir no cambia de tamaño)
		int [] arreglo= new int[3];// tipodedato[] nombredelarray=new tipodedato[cantidad de datos a almacenar];
		//arreglo.length; tamaño del arreglo
		//Agregar datos al arreglo
		arreglo[0]=4;
		arreglo[1]=8;
		arreglo[2]=12;
		//arreglo[3]=12; //error fuera de indice
		System.out.println(arreglo);//Esto no nos imprime el arreglo sino mas bien el lugar en que esta guardado
		System.out.println(Arrays.toString(arreglo));//Asi si nos muestra el contenido del arreglo al correr, pero solo sirve gracias a linea 3
		System.out.println(arreglo[0]+"");// aqui estamos convirtiendo el dato en la posicion 0 en string
		System.out.println(arreglo[0]);//aqui imprimimpos el valor en la posicion 0 accediendo al elemento
		
		//como definir el arreglo con {}
		
		int [] sinNumeros = {};// aqui decimos que el arreglo esta vacio
		System.out.println(sinNumeros.length);
		//sinNumeros[0]=78; esto no esta permitido para un arreglo vacio
		System.out.println(Arrays.toString(sinNumeros));
		
		
		String [] vocales = {"a","e","i","o","u"};// aqui usamos { pues estamos asignando valores por defaul
		System.out.println("cantidad de elementos "+vocales.length);
		//Ahora provamos sustituyendo los valores dentro de el arreglo vocales
		vocales [1]= "o";
		vocales [3]= "e";
		vocales [2]= "y";
		System.out.println(Arrays.toString(vocales));
		
		//Ejercicio. Crear un array de numeros flotantes de tamaño 6
		
		float [] ejercicio = new float [6]; // aqui deftinimos el tamaño del arreglo
		
		//Agregar 6 elementos al array 
		ejercicio[0] = 33;// por defaul trae el entero trae el 33.0
		ejercicio[1] = -0.6f;// aqui aunque sea un valor negativo sigue siendo un flotante solo que se lke agrega la f
		ejercicio[2] = 5;
		ejercicio[3] = 6;
		ejercicio[4] = 7;
		ejercicio[5] = 8;
		System.out.println(Arrays.toString(ejercicio));
		
		//si fueran enteres
		int [] numeroInt= new int[2];
		numeroInt [0] = (int)0.2; // casteamos ente numero como entero colocando el (int)
		numeroInt [1] = 14;
		System.out.println(Arrays.toString(numeroInt));// al imprimir solo se vera la parte entera de los valores declarados dentro del array pues es un entero int
		
		//crear un arreglo de enteros tamaño 100 y agregar valores dimacamente desde el 1 al 100
		
		int [] ejercicio2 = new int [100];//definimos el arreglo y su tamaño
		for (int i=0; i< ejercicio2.length; i++) { //creamos un buvle para que ingrese los valores del arreglo de manera dinamica
			ejercicio2[i] = i+1; 
		}
		System.out.println(Arrays.toString(ejercicio2));
		
		//crear un arreglo de tamaño 100 que agregue dinamicamenete los numeros del 100 al 1 decreciendo
		
		int [] ejercicio3 = new int [100];
		for (int i= 0; i<ejercicio3.length; i++) {
			ejercicio3[i]= ejercicio3.length-i;// esto es igual que decir ejercicio3[i]= 100-i
		}
		System.out.println(Arrays.toString(ejercicio3));
		
		//otra manera es
		
		int[] arreint3 = new int[100];
		for (int i = arreint3.length ; i>0 ; i--) {
			arreint3[arreint3.length-i]=i;
		}
		System.out.println(Arrays.toString(arreint3));
		

	}
}
