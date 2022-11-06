/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.recejer1;

import PERRO.Perro;
import PERSONA.Persona;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class RECEJER1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);
       

/// ESTO ES PARA EL EJERICCIO 1
/// creamos las mascotas 
//        Perro mascota1 = new Perro();
//       
//       mascota1.setNombre("Firulay");
//       mascota1.setRaza("San Bernardo");
//       mascota1.setEdad("4");
//       mascota1.setTamaño("Grande");
//       
//       
//       Perro mascota2 = new Perro();
//       
//       mascota2.setNombre("Laika");
//       mascota2.setRaza("Labrador");
//       mascota2.setEdad("7");
//       mascota2.setTamaño("Mediano");
       
       /// LLAMAMOS LA CLASE  DONDE TENEMOS LOS METODOS PARA CREAR LAS PERSONAS
       servicio aux = new servicio();
       
        /// creamos el ArrayList  que contendra las personas
       
       ArrayList<Persona> humano = new ArrayList();
        

        System.out.println("Se procedera a cargar dos personas en el sistema");
        for (int i = 0; i < 2; i++) {
            humano.add(aux.crearPersona());
        }

        /// creamos el ArrayList  que contendra las mascotas
        
        ArrayList<Perro> perros = new ArrayList();
        
        System.out.println("");
        System.out.println("Se procede a cargar dos perros en el sistema");
        for (int i = 0; i < 2; i++) {
            perros.add(aux.crearPerro());
        }
       
       
       
         
/// ESTO ES PARA EL EJERICCIO 1
//         ArrayList<Perro> perro = new ArrayList();
//         
//         perro.add(mascota1);
////         perro.add(mascota2);
//         
         
         System.out.println("TENEMOS ESTAS DOS MASCOTAS PARA ADOPTAR");
         System.out.println("Cual quieres");
         System.out.println("Mascota 1");
         System.out.println(""+perros.get(0));
         System.out.println("Mascota 2");
         System.out.println(""+perros.get(1));
         
         int op = leer.nextInt();
         
         
         
         
         System.out.println("***********************************");
         
         
       
       /// creamos las personas
//       Persona humano1 = new Persona();
//       
//       humano1.setNombre("Mariana");
//       humano1.setApellido("Lopez");
//       humano1.setEdad("36");
//       humano1.setDNI("30299052");
//       
//       
//       Persona humano2 = new Persona();
//       
//       humano2.setNombre("Alberto");
//       humano2.setApellido("Rios");
//       humano2.setEdad("40");
//       humano2.setDNI("75075118");
//       
      
       /// agrego (seteo)  el arraylist a la clase persona
       
        System.out.println("Tenemos estas dos personas a quien le quieres asignar la mascota escogiada ");
        System.out.println("Persona 1");
        System.out.println(""+humano.get(0));
        System.out.println("Persona 2");
        System.out.println(""+humano.get(1));
        int op2 = leer.nextInt();
        
        if(op2 == 1 && op ==1){
            
            System.out.println(" "+humano.get(0)+" "+perros.get(0));
            
        }else if (op2 == 1 && op ==2){
            System.out.println(" "+humano.get(0)+" "+perros.get(1));
        }
        
        if(op2 == 2 && op ==1){
            
            System.out.println(" "+humano.get(1)+" "+perros.get(0));
            
        }else if (op2 == 2 && op ==2){
            System.out.println(" "+humano.get(1)+" "+perros.get(1));
        }
        
       
       
       
//       
//       humano1.setPerro(perro);
//       humano2.setPerro(perro);
       
        //System.out.println(""+humano1);
        //System.out.println(""+humano2);
    }
}
