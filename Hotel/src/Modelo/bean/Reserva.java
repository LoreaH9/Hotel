package Modelo.bean;

import java.time.LocalDate;

public class Reserva {
	private int id;
	private int id_habitacion;
	private String dni;
	private LocalDate desde;
	private LocalDate hasta;
	
	public Reserva(int id, int id_habitacion, String dni, LocalDate desde, LocalDate hasta) {
		this.id=id;
		this.id_habitacion= id_habitacion;
		this.dni=dni;
		this.desde=desde;
		this.hasta=hasta;
	}
	
	@Override
	public String toString() {
		return "Reserva [id=" + id + ", id_habitacion=" + id_habitacion + ", dni=" + dni + ", desde=" + desde
				+ ", hasta=" + hasta + "]";
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId_habitacion() {
		return id_habitacion;
	}
	
	public void setId_habitacion(int id_habitacion) {
		this.id_habitacion = id_habitacion;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	public LocalDate getDesde() {
		return desde;
	}
	
	public void setDesde(LocalDate desde) {
		this.desde = desde;
	}
	
	public LocalDate getHasta() {
		return hasta;
	}
	
	public void setHasta(LocalDate hasta) {
		this.hasta = hasta;
	}
	
	
}
