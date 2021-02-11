package Modelo.dao;
import java.util.*;
import java.sql.*;
import Conexion.Conexion;
import Modelo.bean.Hotel;

public class HotelModelo extends Conexion{

	public ArrayList<Hotel> verHoteles() {
		ArrayList<Hotel> AH = new ArrayList <Hotel>();
		Hotel hotel;
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hoteles");
			
			while (rs.next()) {
				hotel = new Hotel (rs.getInt("id"),rs.getString("cif"), rs.getString("nombre"), rs.getString("gerente"), rs.getInt("estrellas"), rs.getString("compania"));
				AH.add(hotel);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return AH; 
	}
	
	public void modificarDatos(int id, String nombre, String gerente, String compania, int estrellas) {
		try {
			Statement st = conexion.createStatement();
			String sql = "UPDATE hoteles SET";
			if (!nombre.equals("")) {
				sql= sql +(" nombre='"+nombre+"', ");
			}
			if (!gerente.equals("")) {
				sql= sql +(" gerente='"+gerente+"', ");
			}
			if (0<estrellas && estrellas<6) {
				sql= sql +(" estrellas="+estrellas+", ");
			}
			if (!compania.equals("")) {
				sql= sql +(" compania = '"+compania+"' ,");
			}
			sql = sql.substring(0,sql.length()-1);
			sql = sql+" WHERE id = "+id+"";
			st.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void aniadirHotel(int id, String nombre, String gerente, int estrellas, String compania, String cif) {
		try {
			Statement st = conexion.createStatement();
			st.execute("INSER INTO hotel(`id`, `cif`, `nombre`, `gerente`, `estrellas`, `compania`) "
					+ "VALUES ("+id+",'"+cif+"','"+nombre+"','"+gerente+"',"+estrellas+",'"+compania+"') ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public boolean comprobarID(int id) {
		boolean sartu=false;
		Statement st;
		try {
			st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM hoteles WHERE id = "+id+"");
			
			if (rs.next()) {
				sartu=true;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	return sartu;
	}
}
