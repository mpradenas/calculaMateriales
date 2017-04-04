/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraelementos;

import java.util.Scanner;
import java.lang.*;
/**
 *
 * @author Alumnos
 */
public class CalculadoraElementos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=0;
        boolean continuar=false;
        char re;
        do
        {
            Scanner scan = new Scanner(System.in);
          
            float largo=0;
            float ancho=0;
            float espesor=0;
            int sacos=0;
            float volumen=0;
            float n=0;
            float cantGrava=0;
            float cantArena=0;
            float cantAgua=0;
            float numeroSacos=0;
            int numSacosEnInt=0;
            int respGrava=0;
            int respArena=0;
            int respAgua=0;
            String opString="";
            System.out.println("Seleccione el tipo de cálculo");
            System.out.println("1-cimientos");
            System.out.println("2-radieres");
            System.out.println("3-cadenas y muros");
            System.out.println("4-losas y pilares");
            System.out.println("5-pavimentos");
            System.out.println("6-salir");
          
            clasecalculomateriales calc=new clasecalculomateriales();
            if(scan.hasNextInt())
            {
                opcion=scan.nextInt();
                if(opcion>6 || opcion<1)
                {
                    System.out.println("No puedes ingresar valores que no sean dentro del rango");
                    continue;
                }
            }
            else
            {
                System.out.println("No puedes ingresar valores que no sean numéricos");
                continue;
            }
            
            
            
            switch (opcion)
            {
               case 1:
                    sacos=5;
                    cantGrava=150;
                    cantArena=96;
                    cantAgua=30;
                    opString="cimientos";
                      System.out.println("Ingrese el largo");
                    if(scan.hasNextFloat()){

                        largo=scan.nextFloat();
                    }
                    else
                    {
                       System.out.println("Recuerda ingresar valores válidos, por favor \n");
                       continue;
                    }
                   System.out.println("Ingrese el ancho");
                   if(scan.hasNextFloat()){
                     ancho=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }
                   System.out.println("Ingrese el espesor");
                   if(scan.hasNextFloat())
                   {
                      espesor=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }        
                   volumen=calc.calculavolumen(largo, ancho, espesor);
                   numeroSacos=calc.calculaSacos(volumen, sacos);
                   //redondeo hasta la siguiente cifra el número de sacos 
                   numSacosEnInt=(int)Math.ceil(numeroSacos);
                   //calcula cantidad de áridos
                   respGrava=(int)calc.calculaarido(numSacosEnInt, cantGrava);
                   respArena=(int)calc.calculaarido(numSacosEnInt, cantArena);
                   respAgua=(int)calc.calculaarido(numSacosEnInt, cantAgua);
                   System.out.println(mensajeToPrint(opString,respGrava,respArena,respAgua));
                   break;
               case 2:
                    sacos=6;
                    cantGrava=120;
                    cantArena=84;
                    cantAgua=24;
                    opString="radieres";
                    System.out.println("Ingrese el largo");
                    if(scan.hasNextFloat()){

                        largo=scan.nextFloat();
                    }
                    else
                    {
                       System.out.println("Recuerda ingresar valores válidos, por favor \n");
                       continue;
                    }
                   System.out.println("Ingrese el ancho");
                   if(scan.hasNextFloat()){
                     ancho=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }
                   System.out.println("Ingrese el espesor");
                   if(scan.hasNextFloat())
                   {
                      espesor=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }        
                   volumen=calc.calculavolumen(largo, ancho, espesor);
                   numeroSacos=calc.calculaSacos(volumen, sacos);
                   //redondeo hasta la siguiente cifra el número de sacos 
                   numSacosEnInt=(int)Math.ceil(numeroSacos);
                   //calcula cantidad de áridos
                   respGrava=(int)calc.calculaarido(numSacosEnInt, cantGrava);
                   respArena=(int)calc.calculaarido(numSacosEnInt, cantArena);
                   respAgua=(int)calc.calculaarido(numSacosEnInt, cantAgua);
                   System.out.println(mensajeToPrint(opString,respGrava,respArena,respAgua));
                    break;
               case 3:
                    
                    sacos=7;
                    cantGrava=96;
                    cantArena=72;
                    cantAgua=24;
                    opString="cadenas y muros";
                      System.out.println("Ingrese el largo");
                    if(scan.hasNextFloat()){

                        largo=scan.nextFloat();
                    }
                    else
                    {
                       System.out.println("Recuerda ingresar valores válidos, por favor \n");
                       continue;
                    }
                   System.out.println("Ingrese el ancho");
                   if(scan.hasNextFloat()){
                     ancho=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }
                   System.out.println("Ingrese el espesor");
                   if(scan.hasNextFloat())
                   {
                      espesor=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }        
                   volumen=calc.calculavolumen(largo, ancho, espesor);
                   numeroSacos=calc.calculaSacos(volumen, sacos);
                   //redondeo hasta la siguiente cifra el número de sacos 
                   numSacosEnInt=(int)Math.ceil(numeroSacos);
                   //calcula cantidad de áridos
                   respGrava=(int)calc.calculaarido(numSacosEnInt, cantGrava);
                   respArena=(int)calc.calculaarido(numSacosEnInt, cantArena);
                   respAgua=(int)calc.calculaarido(numSacosEnInt, cantAgua);
                   System.out.println(mensajeToPrint(opString,respGrava,respArena,respAgua));
                    break;
               case 4:
                    
                    sacos=8;
                    cantGrava=84;
                    cantArena=66;
                    cantAgua=24;
                    opString="losas y pilares";
                    System.out.println("Ingrese el largo");
                    if(scan.hasNextFloat()){

                        largo=scan.nextFloat();
                    }
                    else
                    {
                       System.out.println("Recuerda ingresar valores válidos, por favor \n");
                       continue;
                    }
                   System.out.println("Ingrese el ancho");
                   if(scan.hasNextFloat()){
                     ancho=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }
                   System.out.println("Ingrese el espesor");
                   if(scan.hasNextFloat())
                   {
                      espesor=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }        
                   volumen=calc.calculavolumen(largo, ancho, espesor);
                   numeroSacos=calc.calculaSacos(volumen, sacos);
                   //redondeo hasta la siguiente cifra el número de sacos 
                   numSacosEnInt=(int)Math.ceil(numeroSacos);
                   //calcula cantidad de áridos
                   respGrava=(int)calc.calculaarido(numSacosEnInt, cantGrava);
                   respArena=(int)calc.calculaarido(numSacosEnInt, cantArena);
                   respAgua=(int)calc.calculaarido(numSacosEnInt, cantAgua);
                   System.out.println(mensajeToPrint(opString,respGrava,respArena,respAgua));
                   break;
               case 5:
                    
                    sacos=9;
                    cantGrava=84;
                    cantArena=48;
                    cantAgua=18;
                    opString="pavimentos";
                      System.out.println("Ingrese el largo");
                    if(scan.hasNextFloat()){

                        largo=scan.nextFloat();
                    }
                    else
                    {
                       System.out.println("Recuerda ingresar valores válidos, por favor \n");
                       continue;
                    }
                   System.out.println("Ingrese el ancho");
                   if(scan.hasNextFloat()){
                     ancho=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }
                   System.out.println("Ingrese el espesor");
                   if(scan.hasNextFloat())
                   {
                      espesor=scan.nextFloat();
                   }
                   else
                   {
                      System.out.println("Recuerda ingresar valores válidos, por favor \n");
                      continue;
                   }        
                   volumen=calc.calculavolumen(largo, ancho, espesor);
                   numeroSacos=calc.calculaSacos(volumen, sacos);
                   //redondeo hasta la siguiente cifra el número de sacos 
                   numSacosEnInt=(int)Math.ceil(numeroSacos);
                   //calcula cantidad de áridos
                   respGrava=(int)calc.calculaarido(numSacosEnInt, cantGrava);
                   respArena=(int)calc.calculaarido(numSacosEnInt, cantArena);
                   respAgua=(int)calc.calculaarido(numSacosEnInt, cantAgua);
                   System.out.println(mensajeToPrint(opString,respGrava,respArena,respAgua));
                   break;
                 
           }
           
            System.out.println("Desea salir? S/N");
            re=scan.next().charAt(0);
            if(re=='s' || re=='S')
            {
              opcion=6;  
            }

                     
        } while(opcion!=6);
        System.out.println("Adios!!!");
    }
    
    public static String mensajeToPrint(String opcion, float respGrava,float respArena,float respAgua)
    {
      String Mensaje="";
      Mensaje="El cálculo para la opción de "+opcion+" requiera las siguientes compras: \n";
      Mensaje=Mensaje+"Cantidad de grava es de "+respGrava+" Lts, que equivale a valor redondeado "+Math.ceil(respGrava/1000)+" mts3 valor original: "+(respGrava/1000)+" \n";
      Mensaje=Mensaje+"Cantidad de arena es de "+respArena+" Lts, que equivale a valor redondeado "+Math.ceil(respArena/1000)+" mts3 valor original: "+(respArena/1000)+" \n";
      Mensaje=Mensaje+"Cantidad de agua es de "+respAgua+" Lts, que equivale a valor redondeado "+Math.ceil(respAgua/1000)+" mts3 valor original: "+(respAgua/1000)+" \n";
      return Mensaje;
    }  
    
}
