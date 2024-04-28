package com.mycompany.fecha.poo;
import java.util.Scanner;

public class Principal {
    // TODO: Aquí va el código de la clase Principal
    
    //Metodo main ---- O(1) Tiempo constante
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido");
        System.out.println("Ingrese el dia, mes y año que desee. (siguiendo ese orden)");
        int dia = sc.nextInt();//O(1)
        int mes = sc.nextInt();//O(1)
        int ano = sc.nextInt();//O(1)

        Fecha fechaUsuario = new Fecha(dia, mes, ano);//O(1)

        System.out.println(fechaUsuario.fechaCorta());
        if (fechaUsuario.validarFecha() == true) {
            System.out.println("La fecha es valida");
            System.out.println(fechaUsuario.fechaLarga());
        } else {
            System.out.println("La fecha no es valida");
        } 
        
        //O(1)

    }//Cierre main
}//Cierre class
