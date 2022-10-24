package cl.generation.f20221024;

import java.util.Arrays;

public class EjerPracticaArreglos {

	public static void main(String[] args) {
		//Escribir un arreglo de tamaño de 10 ,con números positivos y negativos , capturar en máximo y mínimo
	
		int [] ejercicio = {-3,-5, 4,12, 3,35, -35,77,-1, 0};
		int maximo = 0;
		int minimo = 1;
		for (int i =0; i<ejercicio.length; i++) {
			if (maximo < ejercicio[i])//Esto ayudara asignar el numero mayor a la variable maximo 
            { 
                maximo = ejercicio[i];
            }
			if (minimo > ejercicio[i])//Esto ayudara asignar el numero menor a la variable minimo 
            { 
				minimo = ejercicio[i];
            }
		}
		System.out.println(Arrays.toString(ejercicio));
		System.out.println("El valor mayor es "+""+maximo);
		System.out.println("El valor menor es "+""+minimo);
		
		//2. El mismo arreglo crear otros 2 arreglos, uno con solo los pares y otro arreglo solo con los impares
		//primero creo las variables de pares e impares que tendra el mismo tamaño del arreglo ejercicio 
		int [] pares = new int [ejercicio.length];
		int [] impares = new int [ejercicio.length];
		
		for (int i =0; i<ejercicio.length; i++) {// ahora creamos el bucle que recorrewra el arreglo ejercicio
			
			if (ejercicio[i] % 2 == 0)//Aqui estoy opteniendo los pares, porque todos los numeros divididos entre 2 son diferentes de 0
            { 
                pares[i]= ejercicio[i];
				
            }else {// sodo lo que no se incliya o que no pertenesca a los pares, por defaul va a impares con else
            	
            	impares[i] = ejercicio[i];
            }
		}
		System.out.println("Los numeros pares son: "+""+Arrays.toString(pares));
		System.out.println("Los numeros impares son: "+""+Arrays.toString(impares));
		
		//3. Para el mismo arreglo, sacar el promedio de los números.
		// primero creamos las variables para la suma de los valores y el promedio
		int promedio=0;
		int suma = 0;
		for (int i =0; i<ejercicio.length; i++) {// creamos el bucle para recorrer el arreglo
			suma = suma + ejercicio[i];//sobreescribimos el valor de suma 
		}
		promedio = suma/ejercicio.length;// promediamos tomando en cuenta el total de la suma de todos los valores en el array entre el tamaño del arreglo
		System.out.println("El promedsio de los vbalores del Array es: "+""+promedio);
		
	}

}
