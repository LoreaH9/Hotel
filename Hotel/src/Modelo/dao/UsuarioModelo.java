package Modelo.dao;

import java.sql.*;
import java.util.ArrayList;

import Conexion.Conexion;
import Modelo.bean.Usuario;
import Utils.LO;

public class UsuarioModelo extends Conexion{

	public ArrayList<Usuario> verUsuarios() {
		ArrayList<Usuario> LU = new ArrayList <Usuario>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT nombre FROM usuarios ORDER BY id");
			while (rs.next()) {
				Usuario usuario = new Usuario(rs.getInt("id"), rs.getString("nombre"));
				LU.add(usuario);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return LU;
	}
	
	public boolean login (int id, String password) {
		boolean sartu = false;
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM usuario WHERE id="+id+" AND password = '"+password+"'");
			
			if (rs.next()) {
				sartu=true;

				return sartu;			

			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return sartu;
	}

}
