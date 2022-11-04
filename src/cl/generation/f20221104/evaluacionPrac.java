package cl.generation.f20221104;

import java.util.ArrayList;

public class evaluacionPrac {

	public static void main(String[] args) {
		
		Float totalCompra= suma();
		System.out.println("El total de la compra es: " + totalCompra);
			
	}
	
	public static Float suma() { // Descuento los martes de jueves de 20%
		String dia="jueves";
		Float sumaProductos=0f;
		
		ArrayList<Integer> productos = new ArrayList<>();
		productos.add(200);
		productos.add(5000);
		productos.add(1000);
		productos.add(8000);
		productos.add(600);
		System.out.println(productos);
		
		for (int i = 0; i < productos.size(); i++) {
			
			sumaProductos = sumaProductos + productos.get(i);
		}
		
		//System.out.println("El total de la compra es: " + sumaProductos);
		
		if ( dia=="martes" || dia=="jueves" ) {
			sumaProductos = sumaProductos-(sumaProductos*0.20f);
			//System.out.println("Pero ganaste un 20% de descuento, asi que el total real es: " + sumaProductos);
		}else {
			//System.out.println("Hoy no hay descuentos");
		}
		return sumaProductos;
		
	}

}
