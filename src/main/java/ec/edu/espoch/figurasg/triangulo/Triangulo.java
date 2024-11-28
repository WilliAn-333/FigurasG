/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.figurasg.triangulo;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

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

    public void imprimir() {
        System.out.println("Base: " + base);
        System.out.println("Altura: " + altura);
        System.out.println("Hipotenusa: " + hipotenusa);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(base, altura);

        triangulo.imprimir();

        scanner.close();
    }
}
