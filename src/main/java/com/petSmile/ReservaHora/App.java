package com.petSmile.ReservaHora;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {

	public static Connection getConexion() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost/clinica";
			String usuario = "iplacex";
			String contrasenia = "iplacex";
			
			con = DriverManager.getConnection(url, usuario, contrasenia);
			
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el Driver");
			
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error con la base de datos");
			
			e.printStackTrace();
		}
		return con;
		
		
	}
	
}
