/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;

import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Mavenproject2 {

    public static void main(String[] args) throws OpcionIncorrecta {
        Scanner sc = new Scanner(System.in);
        
       
         
          
          try{
              
            System.out.println("Ingrese valor del numerador: ");
             int n = Integer.parseInt(sc.nextLine());

             System.out.println("Ingrese el numero de la Operacion que desea realizar: 1.+ 2.- 3.* 4./");
             int op= Integer.parseInt(sc.nextLine());


             System.out.println("Ingrese valor del denominador: ");
             
             
              int d = Integer.parseInt(sc.nextLine());
             if(op==1){
                 int resultado=n+d;
                 System.out.println("El resultado es: " + resultado);
             }
             else if(op==2){
                 int resultado=n-d;
                 System.out.println("El resultado es: " + resultado);
             }
             else if(op==3){
                 int resultado=n*d;
                 System.out.println("El resultado es: " + resultado);
             }
             else if(op==4){
                int resultado=n/d;
                System.out.println("El resultado es: " + resultado);
            }else{
                 throw new OpcionIncorrecta(
        "La operación ingresada no es válida."
    );
             }
              
          }
          catch(ArithmeticException e){
              System.out.println("No se puede dividir entre cero.");
          }
          
          catch(NumberFormatException e){
              System.out.println("Solo se aceptan datos numericos .");
          }
          
          catch(OpcionIncorrecta e){
              System.out.println("No se acepat ese tipo de operacion.");
          }
          
          
    }
}
