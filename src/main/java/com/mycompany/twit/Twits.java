/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.twit;

/**
 *
 * @author edwinhernandezlopez
 */
public class Twits {
    private static String[] twits = new String[100];
    private static int contador = 0;
    private static int contadorTwits = 0;

    
    public static void agregarTwit(String twit) {
        if (contador < twits.length) {
            twits[contadorTwits] = twit;
            contadorTwits++;

        }
    }

    public String[] obtenerTwits() {
        return twits;
    }

    public int obtenerContadorTwits() {
        return contadorTwits;

    }
}
