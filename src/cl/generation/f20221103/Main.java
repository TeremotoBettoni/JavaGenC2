package cl.generation.f20221103;

public class Main {

	public static void main(String[] args) {
		// Objetos de colaboracion

		Usuario usuario = new Usuario();

		/*
		 * ArrayList<String> telefonos = new ArrayList<String>();
		 * telefonos.add("3546354"); telefonos.add("3546354"); telefonos.add("3546354");
		 * usuario.setTelefono(telefonos);
		 */

		// System.out.println(usuario.getTelefono());
		// en este caso usamos el get para traer el tipo de dato, y luego el add para
		// agregar los valores al array
		usuario.getTelefono().add("653436543");
		usuario.getTelefono().add("437245588");
		usuario.getTelefono().add("874278257");

		System.out.println(usuario.getTelefono());

		/*
		 * Direccion direccion = new Direccion(); direccion.setCalle("Villaseca");
		 * direccion.setNumero("70"); direccion.setCiudad("Santiago");
		 * direccion.setRegion("Metropolitana"); usuario.setDireccion(direccion);//
		 * ahora pasamor5 a usuario el objeto direccion
		 */

		// Una forma mas limpia seria inicializar el objeto en constructor basio de
		// Usuario y copmpletar los datos como a continuacion
		
		usuario.getDireccion().setCalle("Villaseca");

		System.out.println(usuario.getDireccion());

		// usuario.setDireccion(null);

		// usuario.setDireccion("villaseca 70, ñuñoa, santiago");

		// Usuario usuario2 = new Usuario();
		// usuario2.setDireccion("villaseca 70, ñuñoa, santiago");

	}

}
