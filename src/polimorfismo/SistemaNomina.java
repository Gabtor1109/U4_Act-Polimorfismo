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
        
        System.out.println("////////////////////////////----- Se procesa Empleados por separado -----/////////////////////////////");
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoAsalariado,"Ingresos",empleadoAsalariado.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoBaseMasComision,"Ingresos",empleadoBaseMasComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorComision,"Ingresos",empleadoPorComision.ingresos());
        System.out.printf("%s\n%s: $%,.2f\n\n",empleadoPorHoras,"Ingresos", empleadoPorHoras.ingresos());
        
        
        Empleado []empleado = new Empleado[4];
        empleado[0] = empleadoAsalariado;        empleado[1] = empleadoBaseMasComision;
        empleado[2] = empleadoPorComision;
        empleado[3] = empleadoPorHoras;
        
        System.out.println("////////////////////////////----- Se procesa Empleados juntos -----////////////////////////////");
        for (int i = 0; i < empleado.length; i++) {
            System.out.printf("%s\n%s: $%,.2f\n\n",empleado[i],"Ingresos",empleado[i].ingresos());
        }
        
        System.out.println("///////////////////////----- Se procesa Empleados juntos (Metodo de la maestra) -----//////////////////////");
        for(Empleado empleadoActual:empleado){
            //Se invoca al metodo ToString(Me ayuda a obtener los valores d mi objeto)
            System.out.println(empleadoActual);
            if(empleadoActual instanceof EmpleadoBaseMasComision){
            EmpleadoBaseMasComision empleados = (EmpleadoBaseMasComision) empleadoActual;
            empleados.establecerSalarioBase(1.10*empleados.obtenerSalarioBase());
            System.out.printf("El nuevo salario Base con 10%% de incremento es: $%,.2f\n",empleados.obtenerSalarioBase());
            }
            System.out.printf("Ingresos $%,.2f\n\n",empleadoActual.ingresos());
        }
        //Se crea un for para obtener el nombre del tipo de cada objeto en el arreglo empleados
        System.out.println("Se obtiene el nombre del tipo de cada objeto en el arreglo");
        for (int j = 0; j < empleado.length; j++) {
            System.out.printf("El empleado %d es un %s\n",j,empleado[j].getClass().getName());            
        }
        
        
        
       }
    }
    

