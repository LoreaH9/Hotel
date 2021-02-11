package Menu;

import java.util.*;
import Modelo.bean.Hotel;
import Modelo.dao.HotelModelo;
import Utils.LO;

public class HotelKudeatzailea {
	HotelModelo HM = new HotelModelo ();
	
	public void verHoteles() {
		ArrayList <Hotel> AH = HM.verHoteles();
		AH.toString();
	}
	
	public void modificarHotel(){
		LO.print("Escribe el id del hotel que quieres modificar");
		int id = Integer.parseInt(LO.read());
		boolean sartu = HM.comprobarID(id);
		
		if (sartu) {
		LO.print("Escribe el nombre: ");
		String nombre = LO.read();
		LO.print("Escribe el gerente:");
		String gerente = LO.read();
		LO.print("Introduce el numero de estrellas (1-5)");
		int estrellas = Integer.parseInt(LO.read());
		LO.print("Escribe la compañia");
		String compania = LO.read();
		HM.modificarDatos (id, nombre, gerente, compania, estrellas);
		}
		else {
			LO.print("El id introducido no esta en la base de datos");
		}
	}
	
	public void eliminarHotel() {
		LO.print("Escribe el id del hotel que quieres modificar");
		int id = Integer.parseInt(LO.read());
	}
	
	public void aniadirHotel() {
		LO.print("Escribe el id del hotel que quieres modificar");
		int id = Integer.parseInt(LO.read());
		boolean sartu = HM.comprobarID(id);
		
		if (sartu) {
			LO.print("Escribe el cif:");
			String cif = LO.read();
			LO.print("Escribe el nombre: ");
			String nombre = LO.read();
			LO.print("Escribe el gerente:");
			String gerente = LO.read();
			LO.print("Introduce el numero de estrellas (1-5)");
			int estrellas = Integer.parseInt(LO.read());
			LO.print("Escribe la compañia");
			String compania = LO.read();
		}
		else {
			LO.print("El id introducido no esta en la base de datos");
		}
	}
	
	public void buscarHotel() {
		
	}
}
