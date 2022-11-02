package cl.generation.f20221102;

import java.util.ArrayList;

public class ejercicio {

	public static void main(String[] args) {
		// 
		
		ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>();
		Alumnos alumno=new Alumnos();
		alumno.setNombre("Carlos");
		alumno.setApellido("Ancapi");
		alumno.setEdad(28);
		alumno.setCurso("Corte2");
		listaAlumnos.add(alumno);
		
		Alumnos alumno2=new Alumnos();
		alumno2.setNombre("Michel");
		alumno2.setApellido("Espinoza");
		alumno2.setEdad(25);
		alumno2.setCurso("Corte2");
		listaAlumnos.add(alumno2);
		
		Alumnos alumno3=new Alumnos();
		alumno3.setNombre("Ivan");
		alumno3.setApellido("Zapata");
		alumno3.setEdad(26);
		alumno3.setCurso("Corte2");
		listaAlumnos.add(alumno3);
		
		// Recorrer lista
		for (Alumnos clase : listaAlumnos) {
			System.out.println(clase.toString());
		}
		
		
		Profesor profesor=new Profesor();
		ArrayList<Profesor> listaProfesores = new ArrayList<Profesor>();
		profesor.setNombre("Claudia");
		profesor.setApellido("Pizarro");
		profesor.setEdad(38);
		profesor.setAniosExperiencia(12);
		profesor.setAsignatura("Lenguaje y Comunicación");
		listaProfesores.add(profesor);
		
		Profesor profe2 = new Profesor ();
		profe2.setNombre("Jorge");
		profe2.setApellido("Castro");
		profe2.setEdad(58);
		profe2.setAniosExperiencia(25);
		profe2.setAsignatura("Matematicas");
		listaProfesores.add(profe2);
		
		Profesor profe3 = new Profesor ();
		profe3.setNombre("Lorena");
		profe3.setApellido("Morales");
		profe3.setEdad(48);
		profe3.setAniosExperiencia(18);
		profe3.setAsignatura("Biologia");
		listaProfesores.add(profe3);
		
		for (Profesor profes : listaProfesores) {
			System.out.println(profes.toString());
		}
	
		ArrayList<Directivos> listaDirectivos = new ArrayList<Directivos>();
		Directivos directivo=new Directivos();
		directivo.setNombre("Pablo");
		directivo.setApellido("Lopez");
		directivo.setEdad(45);
		directivo.setNombreInstitucion("Generation");
		directivo.setCargo("Director");
		listaDirectivos.add(directivo);
		
		Directivos directivo2=new Directivos();
		directivo2.setNombre("Juan");
		directivo2.setApellido("Gutierrez");
		directivo2.setEdad(45);
		directivo2.setNombreInstitucion("Generation");
		directivo2.setCargo("Director");
		listaDirectivos.add(directivo2);
		
		Directivos directivo3=new Directivos();
		directivo3.setNombre("Ernesto");
		directivo3.setApellido("Perez");
		directivo3.setEdad(45);
		directivo3.setNombreInstitucion("Generation");
		directivo3.setCargo("Director");
		listaDirectivos.add(directivo3);
		
		for (Directivos direc : listaDirectivos) {
			System.out.println(direc.toString());
		}


	}

}
