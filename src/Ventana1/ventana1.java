/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana1;
//Paso 1 - IMPORTAMOS LAS LIBRERIAS
import javax.swing.*;//Importamos todo de swing
import java.awt.*;
/******************************************************************************
 *Elda Solar
 * @author LAB05
 * Fecha: 10/11/2017
 * Clase:PruebaJava3
 * Responsabilidad:ventana 1 con importacion,herencia,declaracion,definicion,inicializar y crear, agregar los elementos y las propiedades de objetos 
 */
//Paso 2 - Heredar la clase desde JFrame
public class ventana1 extends JFrame
{
 //Paso 3 - DECLARAR LOS ELEMENTOS A UTILIZAR
 JPanel panel;
 JLabel label;
 JTextField text;
 JButton boton1;
 JButton boton2;
 
  //Paso 4 - DEFINIR EL CONSTRUCTOR
  public ventana1()
 {
   // Paso 5 - CREAR E INICIALIZAR LOS OBJETOS O ELEMENTOS
     panel = new JPanel();//Creo un objeto tipo JPanel
     label = new JLabel();
     text = new JTextField(20);// 20 es la cantidad de caracteres
     boton1 = new JButton();
     boton2 = new JButton();
     
      //Paso 6 - AGREGAR LOS ELEMENTOS
     this.add(panel);//El this es para agregar el JPanel Al JFrame
     panel.add(label);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(text);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(boton1);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     panel.add(boton2);//AQUI ESTAMOS AGREGANDO UN OBJETO AL PANEL
     
     
     //Paso 7 - PROPIEDADES DE LOS  OBJETOS O ELEMENTOS
     label.setText("Base de Datos");
     boton1.setText("Conectar");
     boton2.setText("Desconectar");
     panel.setBackground(Color.cyan);//Color de fondo del JPanel
     
  
    //Paso 16 - Agregamos escuchador al boton
     boton1.addActionListener (new ActionListener());
     {
     public void actionPerformed(ActionEvent evt);
     {
       con = new ConexionBD(); 
       Connection reg = con.Conectar();
     
 }};
    boton2.addActionListener (new ActionListener());
     {
     public void actionPerformed(ActionEvent evt);
     { 
       con.Desconectar();
     }
}};
 
