/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasg.circulo;

/**
 *
 * @author DELL
 */
public class Circulo {
    public double radio;
    public Circulo(){
    
    }
public Circulo(double radio){
    this.radio=radio;
}    
    public void imprimir(){
        System.out.println("El radio es: "+ radio);
    }
    public double calcularArea(){
    return radio*radio;
    
    }
    public double calcularPerimetro(){
    return radio*1;
    
    }
}
