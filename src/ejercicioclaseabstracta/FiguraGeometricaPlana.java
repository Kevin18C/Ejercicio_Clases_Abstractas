/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioclaseabstracta;

/**
 *
 * @author kevin
 */
public class FiguraGeometricaPlana extends FiguraGeometrica {

    //contructor de la clase
    public FiguraGeometricaPlana(double base, double altura) {
        super.base = base;
        super.altura = altura;
    }

    //constructor vacio
    public FiguraGeometricaPlana(){
    }

    @Override
    public double CalcularArea() {
        return base * altura;
    }

    @Override
    public double CalcularPerimetro() {
        return 2 * (base + altura);
    }

}
