package com.company;

import java.util.Scanner;

public class Appbancaria {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double saldoDisponible = 1548.85;
        System.out.println("Escriba su nombre: ");
        String nombreCliente = teclado.nextLine();
        int opcion = 0;
        // ciclo para repetir el menu
        while (opcion != 9) {
            String menuPrincipal = String.format("""
                    ******************************************
                    Nombre del cliente: %s
                    Tipo de Cuenta: Corriente
                    Saldo Disponible %f$;
                    """, nombreCliente, saldoDisponible);
            System.out.println(menuPrincipal);
            System.out.println("""
                    *******************************************
                    **Escriba el número de la opción deseada**
                    1 - Consultar saldo
                    2 - Retirar
                    3 - Depositar
                    9 - Salir
                    """);
            opcion = teclado.nextInt();
            if (opcion>4 && opcion< 9) {
                System.out.println("opción inválida");
            }else if (opcion>9){
                System.out.println("opción inválida");
            }
            if (opcion==2){
                System.out.println("¿Cuánto desea retirar? ");
                double saldoRetirado = teclado.nextDouble();
                saldoDisponible -= saldoRetirado;
                if (saldoDisponible<0){
                    System.out.println("No tiene saldo suficiente");
                    saldoDisponible = saldoDisponible + saldoRetirado;
                }
            } else if (opcion == 3){
                System.out.println("¿Cuánto desea depositar? ");
                double saldoDepositado = teclado.nextDouble();
                saldoDisponible += saldoDepositado;
            } else if (opcion == 1){
                System.out.println("Tu saldo disponible es de: " + saldoDisponible);
            } else if (opcion == 9){
                System.out.println("Gracias por usar la app de tu banco favorito");
            }
        }
    }
}
