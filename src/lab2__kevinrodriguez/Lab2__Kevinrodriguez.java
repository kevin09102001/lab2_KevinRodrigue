/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2__kevinrodriguez;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kevin
 */
public class Lab2__Kevinrodriguez {
       static Scanner leer=new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList detec = new ArrayList();
        ArrayList regiscrimen= new ArrayList();
        ArrayList hm=new ArrayList();
        ArrayList sec=new ArrayList();
        ArrayList rob=new ArrayList();
        ArrayList resu=new ArrayList();
        ArrayList ep=new ArrayList();
       char resp='s';
       String opc;
        while(resp=='s'){
            System.out.println("1- Agregar detectives\n" +
                                "2- Eliminar detectives.\n" +
                                "3- Modificar Detectives\n" +
                                "4- Listar Detectives\n" +
                                "5- Registrar Casos\n" +
                                "6- Modificar Casos\n" +
                                "7- Listar Casos\n" +
                                "8- Listar casos resueltos (TODOS LOS CASOS)\n" +
                                "9- Listar casos pendientes (TODOS LOS CASOS) ");
            System.out.println("Ingrese la opcion: ");
            opc=leer.next();
            int op=Integer.parseInt(opc);
            switch(op){
                case 1:{
                    String nombre;
                    int edad;
                    String nacio;
                    int alabo;
                    int nivel;
                    System.out.println("Ingrese su nombre: ");
                    nombre=leer.next();
                    System.out.println("Ingrese su edad: ");
                    edad=leer.nextInt();
                    System.out.println("Ingrese su nacionalidad: ");
                    nacio=leer.next();
                    System.out.println("Ingrese sus años laborales: ");
                    alabo=leer.nextInt();
                    System.out.println("Ingrese su nivel del (1-10): ");
                    nivel=leer.nextInt();
                    if (nivel<=0 || nivel>10) {
                        while(nivel<=0 || nivel>10){
                            System.out.println("Ingrese su nivel bien del 1 - 10");
                             nivel=leer.nextInt();
                        }  
                    }
                    detectives n=new detectives(nombre,edad,nacio,alabo,nivel);
                    detec.add(n);
                }
                    break;
                case 2:{
                    if (detec.size()>=1) {
                        System.out.println("Ingrese la pocicion que desea eliminar: ");
                        int poc=leer.nextInt();
                        if (poc>=0 && poc<detec.size()) {
                            detec.remove(poc);
                        }else{
                            System.out.println("Lo siento pocision fuera de ranfo");
                        }
                    }else{
                        System.out.println("No hay detectives para eliminar");
                    }
                }
                    break;
                case 3:{
                    if (detec.size()>=1) {
                        System.out.println("Ingrese la posicion que desee modificar");
                                            int poc=leer.nextInt();
                                            if (poc>=0 && poc<detec.size()) {
                                                char r='s';
                                                while(r=='s'|| r=='S'){
                                            System.out.println("\n"
                                                    + "1- Modificar nombre\n"
                                                    + "2- Modificar edad\n"
                                                    + "3- Modificar nacionalidad\n"
                                                    + "4- Modificar años laborales\n"
                                                    + "5- Modificar nivel 1-10\n");
                                             System.out.println("Ingrese la opcion que desea:");
                                            int op1 = leer.nextInt();
                                            switch(op1){
                                                case 1:{
                                                    System.out.println("Ingrese su nuevo nombre: ");
                                                    String a=leer.next();
                                                    ((detectives)detec.get(0)).setNombre(a); 
                                                }
                                                break;
                                                case 2:{
                                                    System.out.println("Ingrese su nueva edad: ");
                                                    int a=leer.nextInt();
                                                    ((detectives)detec.get(1)).setEdad(a);
                                                }
                                                break;
                                                case 3:{
                                                    System.out.println("Ingrese su nueva Nacionalidad: ");
                                                    String a=leer.next();
                                                    ((detectives)detec.get(2)).setNacionalidad(a);
                                                }
                                                break;
                                                case 4:{
                                                    System.out.println("Ingrese su nuevos años Laborales: ");
                                                    int a=leer.nextInt();
                                                    ((detectives)detec.get(3)).setLaborales(a);
                                                }
                                                break;
                                                case 5:{
                                                    System.out.println("Ingrese su nuevo nivel: ");
                                                    int a=leer.nextInt();
                                                      if (a<=0 || a>10) {
                                                            while(a<=0 || a>10){
                                                                System.out.println("Ingrese su nivel bien del 1 - 10");
                                                                 a=leer.nextInt();
                                                            }  
                                                        }
                                                    ((detectives)detec.get(4)).setEdad(a);
                                                }
                                                break;
                                                default:
                                    System.out.println("Ingreso una opcion incorrecta");
                                    break;
                                            }
                                                    System.out.println("Desea modificar denuevo [S/N]: ");
                                                    r=leer.next().charAt(0);
                                                }
                            }else{
                            System.out.println("Lo siento pocision fuera de ranfo");
                        }
                    }else{
                        System.out.println("No hay detectives para modificar");
                    }
                }
                    break;
                case 4:{
                    String mostrar="";
                      if (detec.size()>=1) {
                    for (Object a : detec) {
                        mostrar+="\nPocicion: "+detec.indexOf(a)+"\n"+a+"\n";
                    }
                    System.out.println(mostrar);
                      }else{
                        System.out.println("No hay detectives");
                    }
                }
                    break;
                    
                case 5:{
                    String crimen ="";
                    String resul = "";
                    System.out.println("Ingrese el lugar: ");
                    String lugar=leer.next();
                    System.out.println("Ingrese la descripcion: ");
                    String desc=leer.next();
                    System.out.println("Ingrese el tipo\n"
                                      +" 1. Homicidio\n" +
                                        "2. Robo\n" +
                                        "3. Secuestro");
                    int op2=leer.nextInt();
                switch (op2) {
                    case 1:
                        crimen="Homicidio";
                        hm.add("Homicidio");
                        System.out.println("Se ha añadido el homicidio");
                        break;
                    case 2:
                        crimen="Robo";
                        rob.add("Robo");
                        System.out.println("Se ha añadido el robo");
                        break;
                    case 3:
                        crimen="secuestro";
                        sec.add("Secuestro");
                        System.out.println("Se ha añadido el secuestro");
                        break;
                    default:
                        System.out.println("Ingrese una opcion incorrecta");
                        break;
                }
                    System.out.println("Ingrese estado\n"
                                      +" 1. En proceso\n" +
                                        "2. Resuelto" );
                    int op3=leer.nextInt();
                    switch (op3) {
                    case 1:
                        resul="En proceso";
                        break;
                    case 2:
                        resul="Resuelto";
                        break;
                    default:
                        System.out.println("Ingrese una opcion incorrecta");
                        break;  
                    }
                    registro n=new registro(lugar,desc,crimen,resul);
                    regiscrimen.add(n);
                }
                    break;
                case 6:{
                    if (regiscrimen.size()>=1) {
                        System.out.println("Ingrese la posicion que desee modificar");
                                            int poc=leer.nextInt();
                                            if (poc>=0 && poc<regiscrimen.size()) {
                                                char r='s';
                                                while(r=='s'|| r=='S'){
                                                     System.out.println("\n"
                                                    + "1- Modificar Lugar\n"
                                                    + "2- Modificar Descripcion\n"
                                                    + "3- Modificar Tipo de homicidio\n"
                                                    + "4- Modificar años Estado del caso\n"
                                                    + "5- Modificar nivel 1-10\n");
                                             System.out.println("Ingrese la opcion que desea:");
                                            int op1 = leer.nextInt();
                                            switch(op1){
                                                case 1:{
                                                    System.out.println("Ingrese el nuevo lugar: ");
                                                    String n=leer.next();
                                                    ((registro)regiscrimen.get(0)).setLugar(n);
                                                }
                                                    break;
                                                case 2:{
                                                    System.out.println("Ingrese la nueva descripcion: ");
                                                    String n=leer.next();
                                                    ((registro)regiscrimen.get(1)).setDescripcion(n);
                                                }
                                                    break;
                                                    case 3:{
                                                        String crimen = "";
                                                    System.out.println("Ingrese el nuevo tipo\n"
                                                                        +" 1. Homicidio\n" +
                                                                          "2. Robo\n" +
                                                                          "3. Secuestro");
                                                      int op2=leer.nextInt();
                                                  switch (op2) {
                                                      case 1:
                                                          crimen="Homicidio";
                                                          System.out.println("Se ha añadido el homicidio");
                                                          break;
                                                      case 2:
                                                          crimen="Robo";
                                                          System.out.println("Se ha añadido el robo");
                                                          break;
                                                      case 3:
                                                          crimen="secuestro";
                                                          System.out.println("Se ha añadido el secuestro");
                                                          break;
                                                      default:
                                                          System.out.println("Ingrese una opcion incorrecta");
                                                          break;
                                                  }
                                                        ((registro)regiscrimen.get(2)).setCrimen(crimen);
                                                      }
                                                    break;
                                                    case 4:{
                                                        String resul="";
                                                        System.out.println("Ingrese el nuevo estado\n"
                                                                        +" 1. En proceso\n"
                                                                        +"2. Resuelto" );
                                                      int op3=leer.nextInt();
                                                      switch (op3) {
                                                      case 1:
                                                          resul="En proceso";
                                                          break;
                                                      case 2:
                                                          resul="Resuelto";
                                                          break;
                                                      default:
                                                          System.out.println("Ingrese una opcion incorrecta");
                                                          break;  
                                                      }
                                                      ((registro)regiscrimen.get(3)).setResultado(resul);
                                                }
                                                    break;
                                                    default:
                                                    System.out.println("Ingrese una opcion incorrecta");
                                                    break;
                                            } 
                                                    System.out.println("Desea modificar otra vez [S/N]");
                                                   r=leer.next().charAt(0);
                                                }
                               }
                    }
                }
                    break;
                case 7:{
                    String mostrar="";
                    if (regiscrimen.size()>=1) {
                    for (Object a : regiscrimen) {
                        mostrar+="\nPocicion: "+regiscrimen.indexOf(a)+"\n"+a+"\n";
                    }
                    System.out.println(mostrar);
                    }else{
                        System.out.println("No hay crimenes");
                    }
                }
                    break;
                case 8:{
                    String mostrar="";
                    if (regiscrimen.size()>=1) {
                        for (Object a : regiscrimen) {
                        if (((registro)regiscrimen.get(3)).getResultado().equals("Resuelto")) {
                             mostrar+="\nPocicion: "+regiscrimen.indexOf(a)+"\n"+a+"\n";
                             System.out.println(mostrar);
                        }
                       }
                    }else{
                        System.out.println("No hay crimenes");
                    }
                    
                }
                    break;
                case 9:
                    break;
            }
        }
    }
    
}
