/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclaseabstracta;

/**
 *
 * @author kevin
 */
public class Ejercicioclaseabstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //instancia de la clase FiguraGeometricaPlana
        FiguraGeometricaPlana objeto = new FiguraGeometricaPlana();

        //Mandar a imprimir a pantalla
        System.out.println("El area es:" + objeto.CalcularArea());
        System.out.println("El el perimetro es:" + objeto.CalcularPerimetro());
    }

}
