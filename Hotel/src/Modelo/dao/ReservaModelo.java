package Modelo.dao;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;

import Conexion.Conexion;
import Modelo.bean.Habitacion;

public class ReservaModelo extends Conexion{
	
	public boolean disponibles(int id, LocalDate desde, LocalDate hasta){
		ArrayList <Habitacion> AL = null;
		LocalDate ocupadoDesde = null;
		LocalDate ocupadoHasta = null;
		boolean disponible = true;
		Statement st;
		try {
			st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM reserva WHERE id_habitacion="+id+"");
			if (rs.next()) {
				ocupadoDesde= rs.getDate("desde").toLocalDate();
				ocupadoHasta = rs.getDate("hasta").toLocalDate();
			}
			disponible = desde.isBefore(ocupadoDesde) && 
					hasta.isAfter(ocupadoDesde) ||
					desde.isAfter(ocupadoDesde) &&
					hasta.isAfter(ocupadoDesde) ||
					desde.isAfter(ocupadoHasta) &&
					hasta.isBefore(ocupadoHasta) ||
					desde.isBefore(ocupadoHasta)&&
					hasta.isAfter(ocupadoHasta);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return disponible;
	}
}
