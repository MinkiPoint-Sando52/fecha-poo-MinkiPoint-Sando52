package com.mycompany.fecha.poo;
import java.util.HashMap;

public class Fecha {
    // TODO: Aquí va el código de la clase fechas
         //Privatizacion de la variables
    private int dia; //O(1)
    private int mes; //O(1)
    private int ano; //O(1)

    //Constructor ---- O(1) Tiempo constante
    public Fecha(int dia, int mes, int ano) {
        this.dia = dia;//O(1)
        this.mes = mes;//O(1)
        this.ano = ano;//O(1)
    }//Cierre constructor

    //Método para dar la fecha de manera corta ---- O(1) 
    
    public String fechaCorta() {

        return dia + "/" + mes + "/" + ano;
    }//Cierre método

    //Método para validar la fecha O(1) 
    
    public boolean validarFecha() {
        if (mes < 1 || mes > 12 || dia < 1 || dia > 31 || ano < 0) {
            return false;
        } 
        
        //O(1) 
        
        if (mes == 2) {
            if (dia == 29) {
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    return true;
                } else {
                    return false;
                }//Febrero Bisiesto 
                
                //O(1) 
                
            } else {
                return true;
            }//Cirre if febrero
        } else if (mes % 2 == 0 && dia == 31) {
            return false;
        } else if (mes % 2 != 0 && dia <= 31) {
            return true;
        } else {
            return true;
        } 
        
        //O(1)

    }//Cierre método validarFecha

    //Método para pasar el mes a palabra ---- O(1)
    public String mesLetra() {
        HashMap<Integer, String> meses = new HashMap<>();
        meses.put(1, "Enero");
        meses.put(2, "Febrero");
        meses.put(3, "Marzo");
        meses.put(4, "Abril");
        meses.put(5, "Mayo");
        meses.put(6, "Junio");
        meses.put(7, "Junio");
        meses.put(8, "Agosto");
        meses.put(9, "Septiembre");
        meses.put(10, "Octubre");
        meses.put(11, "Noviembre");
        meses.put(12, "Diciembre");
        return meses.get(mes);
    }//Cierre diccionario número, palabra

    //Metodo para la fecha larga ---- O(1)
    public String fechaLarga() {
        return dia + " de " + mesLetra() + " de " + ano;//O(1)
    }//Cierre método

}