package cl.generation.f20221103;

import java.util.ArrayList;

public class Usuario {
	private String nombre;
	private String correo;
	private String password;
	private String apellido;
	private String nick;

	private ArrayList<String> telefono;
	// atributo de colaboracion
	private Direccion direccion;

	public Usuario() {
		super();
		this.telefono = new ArrayList<String>();// aqui estoy inicializando el arreglo. Es necesario para que pueda
												// funcionar. puedes declararla aqui o en el constructor de abajo
		this.direccion = new Direccion();
	}

	public Usuario(String nombre, String correo, String password, String apellido, String nick,
			ArrayList<String> telefono, Direccion direccion) {
		super();
		this.nombre = nombre;
		this.correo = correo;
		this.password = password;
		this.apellido = apellido;
		this.nick = nick;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public ArrayList<String> getTelefono() {
		return telefono;
	}

	public void setTelefono(ArrayList<String> telefono) {
		this.telefono = telefono;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", correo=" + correo + ", password=" + password + ", apellido=" + apellido
				+ ", nick=" + nick + ", telefono=" + telefono + ", direccion=" + direccion + "]";
	}

}
