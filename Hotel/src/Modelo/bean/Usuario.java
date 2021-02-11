package Modelo.bean;

public class Usuario {
	private int id;
	private String nombre;
	private String password;
	
	public Usuario (int id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}
	
	public String toString() {
		return "ID: " + id + 
				"\r\n NOMBRE: " + nombre; 
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
