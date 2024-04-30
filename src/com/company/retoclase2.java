package com.company;

class Retoclase2 {
    public static void main(String[] args) {
        double temperaturaCelsius = 50;
        double temperaturaFarenheit = (temperaturaCelsius*1.8)+32;
        System.out.println(temperaturaFarenheit);

        double temperaturaEnCelsius = 30.4;
        double temperaturaEnFahrenheit = (temperaturaEnCelsius * 1.8) + 32;

        String mensaje = String.format("La temperatura de %f Celsius es equivalente a %f Fahrenheit", temperaturaEnCelsius, temperaturaEnFahrenheit);

        System.out.println(mensaje);

        int temperaturaEnFahrenheitEntero = (int) temperaturaEnFahrenheit;
        System.out.println("La temperatura en Fahrenheit entera es: " + temperaturaEnFahrenheitEntero);
    }
}