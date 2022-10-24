package cl.generation.f20221024;

//aqui podremos importar cosas de algunas librerias

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//las variables
		//Variables Primitivas, son de caracter estatico del tipo numerico
		int numero1 = 2; // esta es una variable de tipo numerica que se define con la palabra reservada int, Su valor mínimo es -2,147,483,648 y el máximo 2,147,483,647 (inclusive)
		long numero2 = 2147483648l;//la l es para definir que la variable es de tipo long, pera que la reconozca 
		float decimal = 2.5f; // para que el codigo entienda que el numero es de tipo flotante le debem,os poner la f al final, sino da error
		float decimal2 = (float) 2.5; // castear
		double decimal3 = 9.8d; // la d es para definir que es dato tipo doble de grande que el float
		
		char caracter = '4';// esta se trabaja a juro es con comillas simples y como un solo caracter
		
		boolean respuesta = true; // o false
		
		// short y byte, investigar ese tipo de variables
		System.out.println(numero1+" "+ numero2+" "+ decimal+" "+ decimal2);
		System.out.println(decimal3+" "+ caracter+" "+ respuesta);
		
		// es las variables primitivas no existen de tipo strig es por ello que colocamos
		String palabra = "hola"; // esto no es una variable primitiva, pero es la unica fo9rma que podemos usar palabras y se encierran siempre en comillas dobles
		//palabra.
		
		
		//variables tipo objeto
		Integer numero3 = 2; //igual al tamaño de la tipo int, pero esta nos permite trabajar con metodo
		//numero2.
		Long numero4 = 1234567890L; // le podemos poner l minuscfula cuando es tipo primitivo y mayuscula cuando lo queremos poner de una vez como objeto
		Float numero5 = 54765435F;
		Double numero6 = 6356469847354D;
		
		
		// conversion a otro tipo de datos numerico
		Integer num1 = Integer.parseInt(123+"");// te devuelve el valor primitivo
		Integer num2 = numero3.valueOf(numero3);// valueof retorna un Integer, es decir una variable no primitiva desde un primitivo
		
		
	}

}
