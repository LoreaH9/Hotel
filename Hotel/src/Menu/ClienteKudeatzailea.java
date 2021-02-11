package Menu;

import java.sql.*;
import java.util.ArrayList;
import Conexion.Conexion;
import Modelo.bean.Cliente;
import Modelo.dao.ClienteModelo;
import Utils.LO;

public class ClienteKudeatzailea{
	ClienteModelo CM = new ClienteModelo ();
	
	public void verClientes(){
		ArrayList <Cliente> CL = CM.verClientes();
		LO.print(CL);
	}
	
	public void modificarCliente() {
		boolean idOK =false;
		String id="", nombre ="", apellido ="", direccion ="", localidad="", aldaketak, cambio;

		do {
			LO.print("Escribe el id del cliente del cual quieres modificar los datos");
			id = LO.read();
			idOK = CM.comprobarId(id);
		}while (!idOK);
		
		do {
			LO.print("Escribe que dato quieres modificar [nombre, apellido, direccion, localidad], dale a ENTER si ya has terminado");
			aldaketak = LO.read().toLowerCase();
			LO.print("Escribe el/la nuev@" + aldaketak);
			cambio=LO.read();
			if (!cambio.equals("") && !aldaketak.equals("")) {
				CM.editarUsuario(id, aldaketak, cambio);
			}
		}while (!aldaketak.equals("") && idOK);
		
	}
	public void aniadirCliente() {
		String id="", nombre ="", apellido ="", direccion ="", localidad="";
		LO.print("Escribe el id del cliente");
		 id = LO.read();
		LO.print("Escribe el nombre del cliente");
		 nombre = LO.read();
		LO.print("Escribe el apellido del cliente");
		 apellido = LO.read();
		LO.print("Escribe la direccion del cliente");
		 direccion = LO.read();
		LO.print("Escribe la localidad del cliente");
		 localidad = LO.read();
		 
		CM.aniadirCliente(nombre, apellido, apellido, localidad, direccion);
	}
	
	public void eliminarCliente() {
		boolean encontrado = false;
		String id;
		do {
			LO.print("Escribe el id del cliente del cual quieres modificar los datos dale ENTER SI QUIERES CANCELAR");
			 id = LO.read();
		} while (!encontrado && !id.equals("") );
		if (encontrado) {
			CM.eliminarCliente(id);
		}
	}

}
