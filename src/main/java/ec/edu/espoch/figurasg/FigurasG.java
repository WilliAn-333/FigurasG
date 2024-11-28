/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.figurasg;

import ec.edu.espoch.figurasg.CUADRADO.Cuadrado;
import ec.edu.espoch.figurasg.RECTANGULO.Rectangulo;
import ec.edu.espoch.figurasg.circulo.Circulo;
import ec.edu.espoch.figurasg.triangulo.Triangulo;

/**
 *
 * @author USER
 */
public class FigurasG {

    public static void main(String[] args) {
        Cuadrado objCuadrado=new Cuadrado(5);
        
        double Area=objCuadrado.calcurAreaCuadrado();
        System.out.println("El area del Cuadrado es: "+Area);
        
        double Perimetro=objCuadrado.calcularPerimetroCuadrado();
        System.out.println("El perimetro del cuadrado es: "+Perimetro);
        
        
        Rectangulo objRectangulo=new Rectangulo(8,3);
        
        double Area1=objRectangulo.calcurArea();
        System.out.println("El area de un Rectangulo es: "+Area1);
        
        double Perimetro1=objRectangulo.calcularPerimetro();
        System.out.println("El perimetro de el Rectangulo es: "+Perimetro1);
        

    }
    
}
