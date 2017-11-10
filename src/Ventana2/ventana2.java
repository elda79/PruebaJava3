/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventana2;
// Paso 8 - IMPORTAR LA CLASE CON LA VENTANA
import Ventana1.ventana1;//import paquete.clase
import javax.swing.JFrame;
/******************************************************************************
 *Elda Solar
 * @author LAB05
 * Fecha: 10/11/2017
 * Clase:PruebaJava3
 * Responsabilidad:ventana 2 se importa la clase con la ventana y se hace llamado a la clase JFrame
 */
public class ventana2 {
    

     public static void main(String[] args) 
{
        // TODO code application logic here
        // Paso 9 - Llamado a la clase JFrame
        ventana1 ventana = new ventana1(); // Creo un objeto tipo Ventana1
        ventana.setVisible(true);
        ventana.setBounds(0, 0, 600, 800);
        //La siguiente inst. le ppone titulo a la ventana
        ventana.setTitle("Tercera Evaluacion Sumativa");
        
         //La siguiente sentencia es para finalizar el proyecto al cerrar
         ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
             
 }
}
