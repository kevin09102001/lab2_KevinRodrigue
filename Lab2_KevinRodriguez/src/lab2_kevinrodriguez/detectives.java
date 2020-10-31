/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_kevinrodriguez;

/**
 *
 * @author Kevin
 */
public class detectives {
      private String nombre;
   private  int edad;
   private String nacio;
   private int alabo;
   private int nivel;
   
   public detectives(String nombre) {
        this.nombre=nombre;
    }

   public detectives(String nombre,int edad) {
        this.nombre=nombre;
        this.edad=edad;
    }

    public detectives(String nombre,int edad,String nacio) {
        this.nombre=nombre;
        this.edad=edad;
        this.nacio=nacio;
    }

    public detectives(String nombre,int edad,String nacio,int alabo) {
        this.nombre=nombre;
        this.edad=edad;
        this.nacio=nacio;
        this.alabo=alabo;
    }

    public detectives(String nombre,int edad,String nacio,int alabo,int nivel) {
        this.nombre=nombre;
        this.edad=edad;
        this.nacio=nacio;
        this.alabo=alabo;
        this.nivel=nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad=edad;
    }

   public String getNacionalidad() {
        return nacio;
    }

    public void setNacionalidad(String nacio) {
        this.nacio= nacio;
    }
    public int getLaborales() {
        return alabo;
    }

    public void setLaborales(int alabo) {
        this.alabo=alabo;
    }
    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel=nivel;
    }
    @Override
    public String toString () {
        return "Nombre del detective: "+nombre+"\nNivel del detective: "+nivel+"\nEdad del detective: "+edad+"\nNacionalidad: "+nacio+"\naños Laborados: "+alabo;
    }
}
