/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclaseabstracta;

/**
 *
 * @author kevin
 */
public abstract class FiguraGeometrica {

    protected double base = 10;
    protected double altura = 20;
    protected String nombre;

    public abstract double CalcularArea();

    public abstract double CalcularPerimetro();

}
