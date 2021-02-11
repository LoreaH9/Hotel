package Modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Conexion.Conexion;
import Modelo.bean.Cliente;

public class ClienteModelo extends Conexion{
	
	public ArrayList<Cliente> verClientes() {
		ArrayList <Cliente> UL = new ArrayList <Cliente>();
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM clientes");
			
			while (rs.next()) {
				Cliente cliente = new Cliente (rs.getString("dni"), rs.getString("nombre"), rs.getString("apellidos"), rs.getString("direccion"), rs.getString("localidad"));
				UL.add(cliente);
			}
			return UL;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return UL;
	}
	
	public Cliente editarUsuario(String id, String aldaketak, String cambio) {
		Cliente cliente = null;
		try {
			Statement st = conexion.createStatement();
			switch (aldaketak) {
			case "nombre":
				 st.execute("UPDATE cliente WHERE id = '"+id+"' SET nombre ='"+cambio+"'"); break;

			case "apellido":
				 st.execute("UPDATE cliente WHERE id = '"+id+"' SET apellido ='"+cambio+"'"); break;

			case "direccion":
				 st.execute("UPDATE cliente WHERE id = '"+id+"' SET direccion ='"+cambio+"'"); break;

			case "localidad":
				 st.execute("UPDATE cliente WHERE id = '"+id+"' SET localidad ='"+cambio+"'"); break;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cliente;
	}
	
	public void eliminarCliente(String id) {
		try {
			Statement st = conexion.createStatement();
			st.execute("DELETE FROM cliente WHERE id = '"+id+"' ");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void aniadirCliente(String nombre, String apellido, String id, String localidad, String direccion) {
		try {
			Statement st = conexion.createStatement();
			st.execute("INSERT INTO `clientes`(`dni`, `nombre`, `apellidos`, `direccion`, `localidad`) VALUES "
					+ "('"+id+"','"+nombre+"','"+apellido+"','"+direccion+"','"+localidad+"')");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public boolean comprobarId(String id) {
		boolean sartu = false;
		try {
			Statement st = conexion.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM cliente WHERE id="+id+" ");
			
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
