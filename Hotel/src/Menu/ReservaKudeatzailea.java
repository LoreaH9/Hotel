package Menu;

import java.time.LocalDate;
import Modelo.dao.HabitacionModelo;
import Modelo.dao.ReservaModelo;
import Utils.LO;

public class ReservaKudeatzailea {
	HabitacionModelo HK =new HabitacionModelo ();
	ReservaModelo RM = new ReservaModelo();
	
	public boolean seSolapan() {
		boolean disponible = false;
		LO.print("Escribe el id de la habitacion que quieras reservar");
		int id =Integer.parseInt(LO.read());
		boolean badago = HK.comprobarHabitacion(id);
		
		if (badago) {
			LO.print("Escribe desde que dia quieres reservar (AAAA-MM-DD)");
			LocalDate desde = LocalDate.parse(LO.read());
			LO.print("Escribe hasta que dia quieres reservar (AAAA-MM-DD)");
			LocalDate hasta = LocalDate.parse(LO.read());
			boolean fechaCorrecta = desde.isBefore(hasta);
			if (fechaCorrecta) {
				RM.disponibles(id, desde, hasta);
			}
		}else {
			LO.print("El id introducido no coincide con el de ninguna habitacion");
		}
		
		return disponible;
	}
}
