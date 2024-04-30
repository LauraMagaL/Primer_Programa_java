package com.company;

import java.util.Random;
import java.util.Scanner;

public class Adivinanzas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroRandom = new Random().nextInt(100);
        int intentos = 0;
        double contador = 0;

        while (intentos<5){
            System.out.println("Adivina un número entero entre 0 y 100, tienes 5 intentos");
            int numeroAdivinado = teclado.nextInt();
            System.out.println(numeroRandom);
            intentos++;
            if(numeroAdivinado == numeroRandom){
                System.out.println("¡Adivinaste el número!");
                break;
            } else if (numeroAdivinado != numeroRandom && intentos<5){
                System.out.println("¡Qué mal! Vuelve a intentar");
            } else {
                System.out.println("Lástima! vuelve a jugar!");
            }
        }

    }
}
