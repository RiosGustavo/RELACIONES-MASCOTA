/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.recejer1;

import PERRO.Perro;
import PERSONA.Persona;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class servicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n").useLocale(Locale.US);

    
    public Persona crearPersona(){
        
        
        Persona humano = new Persona();
        
        System.out.println("Ingrese su nombre");
        humano.setNombre(leer.next());
        System.out.println("Ingrese su apellido");
        humano.setApellido(leer.next());
        System.out.println("edad");
        humano.setEdad(leer.next());
        System.out.println("DNI");
        humano.setDNI(leer.next());
      return humano;  
    } 
    
    
    public Perro crearPerro(){
        
        Perro mascota = new Perro();
        
        System.out.println("Ingrese mascota nombre");
        mascota.setNombre(leer.next());
        System.out.println("Ingrese mascota edad");
        mascota.setEdad(leer.next());
        System.out.println("Ingrese mascota raza");
        mascota.setRaza(leer.next());
        System.out.println("Ingrese mascota tamaño");
        mascota.setTamaño(leer.next());
        return mascota;
    }
  
}
