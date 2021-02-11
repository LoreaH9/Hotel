package Modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Conexion.Conexion;

public class HabitacionModelo extends Conexion{

	public boolean comprobarHabitacion(int id) {
		boolean badago = false;
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM habitaciones WHERE id = "+id+"");
			if (rs.next()) {
				badago =true;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return badago;
	}
}
