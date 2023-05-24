/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.calculadora_tanteo_redox_algebraico;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Algebraico {
    public void balancearCompuesto() {
        // Implementación del método de balanceo algebraico
        // ...
        System.out.println("Método algebraico: Balanceo de compuesto químico.");
        
        String compuesto = "H2O"; // Compuesto a resolver
        
        // Llamar al método para resolver el compuesto
        resolverCompuesto(compuesto);
    }

    public static void resolverCompuesto(String compuesto) {
        String[] elementos = compuesto.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)"); // Dividir el compuesto en elementos y subíndices
        String resultado = "";
        
        for (String elemento : elementos) {
            if (Character.isDigit(elemento.charAt(0))) {
                int subindice = Integer.parseInt(elemento);
                resultado += "(" + subindice + ")";
            } else {
                resultado += elemento;
            }
        }
        
        System.out.println("Resultado: " + resultado);
    }
}

