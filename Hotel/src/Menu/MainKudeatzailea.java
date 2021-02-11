package Menu;
import java.util.ArrayList;

import Modelo.bean.Cliente;
import Modelo.dao.UsuarioModelo;
import Utils.LO;

public class MainKudeatzailea {
	
	public void menuLogin() {
		LO.print("+--------------MENU--------------+\r\n"
				+ "0. SALIR \r\n"
				+ "1. LOGIN \r\n"
				+ "+--------------------------------+");
	}
	
	public void menuGestor() {
		LO.print("+--------------MENU--------------+\r\n"
				+ "0. SALIR \r\n"
				+ "1. GESTIONAR CLIENTE \r\n"
				+ "2. GESTIONAR HOTELES Y HABITACIONES \r\n"
				+ "3. GESTIONAR RESERVAS\r\n"
				+ "+--------------------------------+");
	}
	public void menuCliente() {
		LO.print("+--------------MENU--------------+\r\n"
				+ "0. SALIR \r\n"
				+ "1. VER LISTA CLIENTES \r\n"
				+ "2. DAR DE ALTA UN CLIENTE \r\n"
				+ "3. DAR DE BAJA UN CLIENTE\r\n"
				+ "4. MODIFICAR UN CLIENTE \r\n"
				+ "+--------------------------------+");
	}
	public void menuHotel() {
		LO.print("+--------------MENU--------------+\r\n"
				+ "0. SALIR \r\n"
				+ "1. VER LISTA HOTELES \r\n"
				+ "2. VER LISTA HABITACIONES \r\n"
				+ "3. DAR DE ALTA UN HOTEL \r\n"
				+ "4. AÑADIR UNA HABITACION \r\n"
				+ "5. DAR DE BAJA  UN HOTEL \r\n"
				+ "6. ELIMINAR UNA HABITACION \r\n"
				+ "7. MODIFICAR UN HOTEL\r\n"
				+ "8. MODIFICAR UNA HABITACION\r\n"
				+ "+--------------------------------+");
	}
	public void menuReserva() {
		LO.print("+--------------MENU--------------+\r\n"
				+ "0. SALIR \r\n"
				+ "1. VER LISTA RESERVAS \r\n"
				+ "2. HACER UNA RESERVA \r\n"
				+ "3. CANCELAR UNA RESERVA \r\n"
				+ "4. MODIFICAR UNA RESERVA \r\n"
				+ "+--------------------------------+");
	}
	
	public void cero() {
		LO.print("Agur");
	}
	
	public void def() {
		LO.print("El numero introduciono no está entre las opciones, inserte otro numero");
	}
	
	public boolean login() {
		boolean sartu = false;
		int saiakerak=3;
		UsuarioModelo UM = new UsuarioModelo();
		do {
			LO.print("Escribe tu id: ");
			int id = Integer.parseInt(LO.read());
			LO.print("Escribe tu contraseña: ");
			String password = LO.read();
		
		sartu = UM.login(id, password);
	
		if (sartu) {
			LO.print("El usuario y la contraseña son correctos");
		} else {
			LO.print("El usuario o la contraseña son incorrectos.");
			saiakerak--;
			LO.print("Te quedan " + saiakerak + " intentos. \n");
			}
		} while (!sartu && saiakerak>0);
		return sartu;
	}
	
	
	
}
