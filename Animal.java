/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication21;


// La sobrecarga de metodos nos indica que podemos declarar un metodos con los mismos nombres
// pero modificando los parametros

public class Animal {
    // Atributos
    int edad;
    String nombre;
    
   public void hacerSonido() {
       // Sin parametros
       System.out.println("El animal hace un sonido");
   }
   
   // Con parametros:
   
   public void hacerSonido(String nombre) {
       System.out.println("El animal" + nombre + "hace un sonido");
   }
}
