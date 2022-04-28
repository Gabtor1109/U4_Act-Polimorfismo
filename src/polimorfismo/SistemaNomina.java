/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfismo;

import POL.*;

/**
 *
 * @author Juana García
 */
public class SistemaNomina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         //Instanciar objetos
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Gabriel", " Torres", "111", 1500);
        EmpleadoBaseMasComision empleadoBaseMasComision = new EmpleadoBaseMasComision("Gabriel", " Torres", "125766", 200, 0.2, 1500);
        EmpleadoPorComision empleadoPorComision =  new EmpleadoPorComision("Gabriel", " Torres", "12345", 200, 0.2);
        EmpleadoPorHoras empleadoPorHoras =  new EmpleadoPorHoras("Gabriel", " Torres", "12540", 200, 12);
        
        System.out.println("Se procesa Empleados por separado");
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoAsalariado,"Ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoBaseMasComision,"Ingresos",empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComision,"Ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras,"Ingresos", empleadoPorHoras.ingresos());
        
        
        Empleado []empleado = new Empleado[4];
        empleado[0] = empleadoAsalariado;
        empleado[1] = empleadoBaseMasComision;
        empleado[2] = empleadoPorComision;
        empleado[3] = empleadoPorHoras;
        
        
        System.out.println(empleado);
        
        
       }
    }
    

