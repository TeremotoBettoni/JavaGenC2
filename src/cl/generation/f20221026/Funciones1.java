package cl.generation.f20221026;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {// vamos a usar el metodo main para gatillas las finciones
		// Funciones o metodo

		// llamar a un metodo
		nombreMetodo();// esta es la manera de llamr al metodo o funcion
		metodo2("Teresa");// le ponemos el string teresa pues le estamos aportando esa propiedad al
							// momento de llamar a la fincion o metodo
		metodo2("Luis");
		metodo3(2022);
		metodo4(28, 9.9f);// en el 9.9 no nos reconoce ya que no sabe si es double o float, por lo que se
							// le coloca la f al final
		String[] vocales = { "a", "e", "i", "o", "u" };
		metodo5(vocales);// cuando traspaso un arreglo lo debemos declarar antes como esta en lines 14

		// llamamos a los metodos con retorno
		retorno1(); // no hace nada con el valor retornado
		System.out.println(retorno1());
		// una opcion mas optima es capturar el valor que retorna la funcion dentro de
		// una variable y luego usarla
		Integer valorRetornado = retorno1(); // asignamos una variable con lo que obtenemos dentro de la funcion o
												// metodo cuendo queramos usarlo
		System.out.println(valorRetornado / 7);

		//*************
		String fullName = getNombreCompleto("Teresa", "Bettoni", "Ramos");// para poder visualizar lo que hay que
																			// ingresar al llamar a la funcion
																			// escribimos el nombre de la funcion y
																			// CTRL+ESPACIO
		System.out.println("El nombre completo es: " + fullName);
		
		// llamamos a el metyodo que llama a otro metodo
		llamadaAOtroMetodo();
		

	}

	// definicion o estructura de un metodo
	// static nos permite ingresar a este metodo sin necesidad de crear una
	// instancia de la clase (no requiere new)
	// void -> el metodo no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("Estoy dentro de el metodo inicial");// esto no se imprima a menos que se le llame
	}

	public static void metodo2(String nombre) {
		System.out.println("Hola soy " + nombre);
	}

	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero " + numero);
	}

	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Soy el numero1 " + numero1);
		System.out.println("Soy el numero2 " + numero2);
	}

	public static void metodo5(String[] arreglito) {
		System.out.println("Soy el arreglo " + Arrays.toString(arreglito));// se imprime con arrays.tostring
	}

	// funciones con retorno
	// cambiamos el void por el tipo de dato que queremos retornar

	public static Integer retorno1() {
		Integer totalAlumnos = 35;
		return totalAlumnos;// es igual a return 35;

	}

	/** esto es un java doc que ayuda a comentar y lo llamamos posicionandonos arriba de la funcion y escribiendo /** enter
	 * Metodo que une todos los datos
	 * 
	 * @param nombre
	 * @param apePaterno
	 * @param apeMaterno
	 * @return nombreCompleto
	 */
	public static String getNombreCompleto(String nombre, String apePaterno, String apeMaterno) {
		String nombreCompleto = nombre + " " + apePaterno + " " + apeMaterno;
		return nombreCompleto;// retornamos el contenido de la variable
	}
	
	//metodo que llama a otro metodo
	public static void llamadaAOtroMetodo() {
		System.out.println("Llamada a otro metodo desde un metodo");
		metodo4(1234,54.3f);
		
	}

}
