package cl.generation.f20221025;

import java.util.Arrays;

public class Funciones1 {

	public static void main(String[] args) {// vamos a usar el metodo main para gatillas las finciones
		// Funciones o  metodo	
		
		//llamar a un metodo
		nombreMetodo();// esta es la manera de llamr al metodo o funcion
		metodo2("Teresa");// le ponemos el string teresa pues le estamos aportando esa propiedad al momento de llamar a la fincion o metodo
		metodo2("Luis");
		metodo3(2022);
		metodo4(28,9.9f);// en el 9.9 no nos reconoce ya que no sabe si es double o float, por lo que se le coloca la f al final
		String[] vocales = {"a","e","i","o","u"};
		metodo5(vocales);// cuando traspaso un arreglo lo debemos declarar antes como esta en lines 14
		
		//llamamos a los metodos con retorno
		retorno1();
		System.out.println(retorno1());
		Integer valorRetornado = retorno1(); // asignamos una variable con lo que obtenemos dentro de la funcion o metodo cuendo queramos usarlo
		System.out.println(valorRetornado/7);
		
	}
	// definicion o estructura de un metodo
	// static nos permite ingresar a este metodo sin necesidad de crear una instancia de la clase (no requiere new)
	// void -> el metodo no retorna ningun valor
	public static void nombreMetodo() {
		System.out.println("Estoy dentro de el metodo inicial");// esto no se imprima a menos que se le llame
	}
	
	public static void metodo2(String nombre) {
		System.out.println("Hola soy "+nombre);
	}
	
	public static void metodo3(Integer numero) {
		System.out.println("Soy el numero "+numero);
	}
	
	public static void metodo4(Integer numero1, Float numero2) {
		System.out.println("Soy el numero1 "+numero1);
		System.out.println("Soy el numero2 "+numero2);
	}
	
	public static void metodo5(String [] arreglito) {
		System.out.println("Soy el arreglo "+ Arrays.toString(arreglito));// se imprime con arrays.tostring
	}
	
	// funciones con retorno
	// cambiamos el void por el tipo de dato que queremos retornar
	
	public static Integer retorno1() {
		Integer totalAlumnos = 35;
		return totalAlumnos;// es igual a return 35;
		
	}
	
		
	

}
