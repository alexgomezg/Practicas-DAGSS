/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gof2_ejer1;

import java.io.File;

/**
 *
 * @author Alex
 */
public class GOF2_ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File InputFile = new File("empleados.txt");

        Plantilla plantillaEmpleados = new Plantilla();

        ConverterTXT EmpleadosFile = new ConverterTXT(InputFile, plantillaEmpleados);
        EmpleadosFile.parse();

        CalculadoraNomina calculos = new CalculadoraNomina();
        Empleado empleado;

        for (int i = 0; i < plantillaEmpleados.getSize(); i++) {

            empleado = plantillaEmpleados.getEmpleado(i);

            System.out.println("Nombre: " + plantillaEmpleados.getEmpleado(i).getNombre() + " Nomina: " + calculos.calcularNomina(empleado).calcularNomina());
            System.out.println("\n");

        }

    }

}
