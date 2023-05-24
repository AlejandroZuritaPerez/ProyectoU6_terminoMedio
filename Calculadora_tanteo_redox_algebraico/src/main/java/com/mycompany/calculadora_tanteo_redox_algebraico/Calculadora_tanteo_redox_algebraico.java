/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadora_tanteo_redox_algebraico;


/**
 *
 * @author Daniel Alexandeer Gamas Rodriguez <danielalegamas@gail.com>
 */
public class Calculadora_tanteo_redox_algebraico {

       public static void main(String[] args) {
        // Crear objeto de la clase Algebraico
        Algebraico algebraico = new Algebraico();
        // Llamar al método para balanceo algebraico
        algebraico.balancearCompuesto();

        // Crear objeto de la clase Tanteo
        Tanteo tanteo = new Tanteo();
        // Llamar al método para balanceo por tanteo
        tanteo.balancearCompuesto();

        // Crear objeto de la clase Redox
        Redox redox = new Redox();
        // Llamar al método para balanceo redox
        redox.balancearCompuesto();
    }
}