/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.relojgrados;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class gradosReloj {
    
    @SuppressWarnings("fallthrough")
    public static void main(String[] args) {
        
        Scanner lectura = new Scanner (System.in);
        float hora, minuto, res1, res2,segundo1,res3, total = 0;
        byte opciones;
        
        System.out.println("por favor digite la hora: ");
        hora = lectura.nextFloat();
        System.out.println("por favor digite los minutos: ");
        minuto = lectura.nextFloat();
        System.out.println("Por favor digite los segundos ");
        segundo1 = lectura.nextFloat();
        
        
        res1 = ((360/12)*hora);
        res2 = ((360/60)*minuto);
        res3 = ((360/3600)*segundo1);
        
        
        do{
            
            System.out.println("Ingrese opción: ");
            System.out.println(" Elija una opcion del 1 al 3 de la siguiente forma: ");            
            opciones = lectura.nextByte();
            //if (opciones == 1 || opciones  == 2 || opciones == 3  ){
              //  System.out.println("Debe ingresar una opcion correcta");
            //}
        }while((opciones ==1 && opciones  == 2 && opciones ==3  ));
        
        
        
        switch(opciones){
            case 1:{
                //horario a segundero
                if (res1 > res3){
                    total = (res3+360)-res1;
                } else {
                    total = res3-res1;
                }          
                break;
            }

            case 2:{
               //horario a minutero
                if (res1 > res2){
                    total = (res2+360)-res1;
                } else {
                    total = res2-res1;
                }  
                break;                
                
            }

            case 3:{
               //minuto a segundero
                if (res2 > res3){
                    total = (res3+360)-res2;
                } else {
                    total = res3-res2;    
                break;    
                }                
                
            }

            default :{
                 System.out.println("Muchas gracias por participar");
            }   
                
                
        }
        
    System.out.println("el total de grados entre el horario y el minutero es: " + total);
        
        
        
    }
            
    
}
