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
public class registro {
    private String lugar;
    private String desc;
    private String crimen;
    private String resul;
    
    public registro(String h ){
        lugar=h;
        
    }
     public registro(String h ,String d){
         lugar=h;
        desc=d;
        
    }
     public registro(String h ,String d,String c){
         lugar=h;
        desc=d;
        crimen=c;
        
    }
     public registro(String h ,String d,String c,String r){
         lugar=h;
        desc=d;
        crimen=c;
        resul=r;
        
    }
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
    public String getDescripcionLugar() {
        return desc;
    }

    public void setDescripcion(String desc) {
        this.desc = desc;
    }
     public String getCrimen() {
        return crimen;
    }

    public void setCrimen(String crimen) {
        this.crimen = crimen;
    }
     public String getResultado() {
        return resul;
    }

    public void setResultado(String resul) {
        this.resul = resul;
    }
    public String toString () {
        return "El lugar es: "+lugar+"\nLa descripcion es: "+desc+"\nEl crimen es: "+crimen+"\nEl estado es: "+resul;
    }
}
