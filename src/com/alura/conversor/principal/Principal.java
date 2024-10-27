package com.alura.conversor.principal;

import com.alura.conversor.modelos.Moneda;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        double valor;
        double valorConvertido;
        Moneda moneda = new Moneda("USD");
        do {
            System.out.println("""
                *****************************************
                Sea bienvenido al conversor de monedas!!!
                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real Brasileño
                4) Real Brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano =>> Dólar
                7) Salir
                Elija una opción válida:
                *****************************************
                """);
            opcion = scanner.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = scanner.nextDouble();
                    valorConvertido = valor*moneda.getConversionValor().get("ARS");
                    System.out.println("El valor de "+valor+" [USD] corresponde al valor final de =>> "+valorConvertido+" [ARS]");
                    break;
                case 2:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = scanner.nextDouble();
                    valorConvertido = valor/moneda.getConversionValor().get("ARS");
                    System.out.println("El valor de "+valor+" [ARS] corresponde al valor final de =>> "+valorConvertido+" [USD]");
                    break;
                case 3:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = scanner.nextDouble();
                    valorConvertido = valor*moneda.getConversionValor().get("BRL");
                    System.out.println("El valor de "+valor+" [USD] corresponde al valor final de =>> "+valorConvertido+" [BRL]");
                    break;
                case 4:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = scanner.nextDouble();
                    valorConvertido = valor/moneda.getConversionValor().get("BRL");
                    System.out.println("El valor de "+valor+" [BRL] corresponde al valor final de =>> "+valorConvertido+" [USD]");
                    break;
                case 5:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = scanner.nextDouble();
                    valorConvertido = valor*moneda.getConversionValor().get("COP");
                    System.out.println("El valor de "+valor+" [USD] corresponde al valor final de =>> "+valorConvertido+" [COP]");
                    break;
                case 6:
                    System.out.println("Ingresa el valor que deseas convertir");
                    valor = scanner.nextDouble();
                    valorConvertido = valor/moneda.getConversionValor().get("COP");
                    System.out.println("El valor de "+valor+" [COP] corresponde al valor final de =>> "+valorConvertido+" [USD]");
                    break;
                case 7:
                    System.out.println("Saliendo del sistema....");
                    break;
                default:
                    System.out.println("Por favor, digite una opción válida");
                    break;
            }
        }while (opcion != 7);
    }
}
