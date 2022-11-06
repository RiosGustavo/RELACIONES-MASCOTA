/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERSONA;

import PERRO.Perro;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String edad;
    private String DNI;
    private ArrayList<Perro> perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String edad, String DNI, ArrayList<Perro> perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNI = DNI;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public ArrayList<Perro> getPerro() {
        return perro;
    }

    public void setPerro(ArrayList<Perro> perro) {
        this.perro = perro;
    }
    
    ///// YO ACABA EN EL TO STRING QUITE EL ARRAY PERRO MIRAR
    //// SI COLOCOANDOLO HAY UNA FORMA EN ArrayListo solo llenarlo con un eleemnto ESPEFICIO  del ArrryList
    //// PUES CUANDO LO LLAMO ME TRAE TODOS LOS ELEMENTOS DEL ARRAY

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNI=" + DNI +  '}';
    }
    
}
