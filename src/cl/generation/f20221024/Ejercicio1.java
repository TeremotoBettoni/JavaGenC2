package cl.generation.f20221024;

public class Ejercicio1 {

	public static void main(String[] args) {
		// cambiar de int a Long (de numero a String)
		Integer numero1 = 250;
		Long numero2 = Long.parseLong(numero1+""); // el parse se ocupa para transformar un numero a un string
		Double numero3= Double.parseDouble(numero2+"");
		
		System.out.println(numero1);
		System.out.println(numero2);
		System.out.println(numero3);
		//parse es para numeros compatibles
		//el casteo es para verificar que sea valido, si el dato es valido  en una variable
		//de Long a int (de String a numero)
		Long b = 1234567890L;
		int c = Integer.parseInt(b+"");
		System.out.println(c);
		
	}

}
