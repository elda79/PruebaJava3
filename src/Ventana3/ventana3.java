/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana3;
//PASO 14
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *Elda Solar
 * @author LAB05
 * Fecha: 10/11/2017
 * Clase:PruebaJava3
 * Responsabilidad:conexion con MySQL,declara los objetos para la conexion,metodo para manejar excepciones y Define metodos para conectar y desconectar
 */
public class ventana3 
{
 //PASO 11 - DECLARANDO OBJETOS PARA LA CONEXION
    private static Connection conex;//Objeto tipo Connection
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/ventana3"; 
    
    
}
