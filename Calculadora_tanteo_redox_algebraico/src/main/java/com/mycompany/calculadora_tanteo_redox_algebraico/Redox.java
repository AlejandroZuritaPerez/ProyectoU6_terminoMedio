/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.calculadora_tanteo_redox_algebraico;

/**
 * 
 * @author Sammy Guergachi <danielalegamas@gmail.com>
 */
public class Redox {

    public void balancearCompuesto() {
        // Implementación del método de balanceo redox
        // ...
        System.out.println("Método redox: Balanceo de compuesto químico.");
        
         String[][] matrizValencia = {
                {"HCl", "1-"},
                {"HCI", "1-"},
                {"Ca(OH)2", "2+"},
                {"H2SO4", "2-"},
                {"O2", "0"},
                {"H2O", "0"},
                {"H2O", "0"},
                {"KCl", "1+"},
                {"ZN", "2+"},
                {"HCI", "1-"},
                {"AL2O3", "3+"},
                {"P", "3-"},
                {"Na", "1+"},
                {"Fe", "2+"},
                {"Cu", "1+"}
        };

        // Imprimir la matriz matrizValencia
        for (String[] matrizValencia1 : matrizValencia) {
            for (String matrizValencia11 : matrizValencia1) {
                System.out.print(matrizValencia11 + " ");
            }
            System.out.println();
        }
    }
}

