/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.sql.*;
import javax.swing.*;
/**
 *
 * @author xBrandon7u7x
 */
public class conectar {
    Connection conect = null;
	public Connection conexion()
		{
			try {
				Class.forName("com.mysql.jdbc.Driver");
				conect = DriverManager.getConnection("jdbc:mysql://localhost/consultorio","root","");
				System.out.println("Conexion establecida al sistema");
			} catch (ClassNotFoundException | SQLException e) {
				System.out.println("Error de conexion");
			}
			return conect;
		}
    
}
