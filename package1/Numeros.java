/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package package1;

import java.util.Random;

/**
 *
 * @author afernandezfontenla
 */
public class Numeros {

    private static int length;

    public void crearArrays() {
        for (int i = 0; i < Numeros.length; i++) {
            Numeros[i] = (int) (Math.random() * 50 + 1);
        }
    }

    public void amosar() {
        for (int i = 0; i <= Numeros.length - 1; i++) {
            System.out.println(Numeros[i]);
        }

    }

    public void amosarReves() {
        for (int b = Numeros.length - 1; b >= 0; b--) {
            System.out.println(Numeros[b]);
        }
    }
}
