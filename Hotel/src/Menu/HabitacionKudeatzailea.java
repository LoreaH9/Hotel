package Menu;

import java.sql.*;
import java.util.ArrayList;

import Conexion.Conexion;
import Modelo.bean.Habitacion;

public class HabitacionKudeatzailea extends Conexion{

	public ArrayList<Habitacion> verHabitaciones() {
		ArrayList <Habitacion> LH = new ArrayList <Habitacion>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM habitaciones");
			
			while (rs.next()) {
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LH;
	}
}
