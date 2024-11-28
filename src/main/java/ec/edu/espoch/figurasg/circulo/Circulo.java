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

    // Constructor sin parámetros
    public Circulo() {
    }

    // Constructor con parámetro
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * radio * radio; // Fórmula: π * r^2
    }

    // Método para calcular el perímetro (circunferencia)
    public double calcularPerimetro() {
        return 2 * Math.PI * radio; // Fórmula: 2πr
    }
}
