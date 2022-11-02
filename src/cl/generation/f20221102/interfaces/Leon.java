package cl.generation.f20221102.interfaces;

public class Leon extends Carnivoro implements Generico{
	
	@Override// aqui lo estoy sobre escribiendo pero ya carnivoro me puede arrojar de una el mensaje de que es carnivoro
	public void metodoEnAnimal(){
		System.out.println("El Leon come carne");
	}
	
	@Override
	public void respirar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void comer() {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public String toString() {
		return "Leon [Peso=" + getPeso() + ", Altura=" + getAltura() + "]";
	}	
	

}
