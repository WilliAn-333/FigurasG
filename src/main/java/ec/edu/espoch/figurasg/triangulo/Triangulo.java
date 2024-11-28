/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasg.triangulo;

/**
 *
 * @author DELL
 */
public class Triangulo {

    private double base;
    private double altura;
    private double hipotenusa;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
        this.hipotenusa = calcularHipotenusa();
    }

    private double calcularHipotenusa() {
        return Math.sqrt((base * base) + (altura * altura));
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return base + altura + hipotenusa;
    }
}

