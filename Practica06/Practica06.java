/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practica06;

import java.util.Scanner;

/**
 *
 * @author erikespvel
 */
public class Practica06 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        sc.useDelimiter("\n");

        System.out.println("MENU: ");
        System.out.println("1.- Ejercicio 1");
        System.out.println("2.- Ejercicio 2");
        System.out.println("3.- Ejercicio 3");
        System.out.println("4.- Ejercicio 4");
        System.out.println("5.- Ejercicio 5");
        System.out.println("6.- Ejercicio 6");
        System.out.println("Enter option: ");
        String opcion = sc.next();

        switch (opcion) {
            case "1":
                ejercicio1();
                break;
            case "2":
                ejercicio2();

                break;
            case "3":
                ejercicio3();

                break;
            case "4":
                ejercicio4();

                break;
            case "5":
                ejercicio5();

                break;
            case "6":
                ejercicio6();

                break;
            default:
                System.out.println("Opcion incorrecta");
        }
    }

    private static void ejercicio1() {
        int puntos = 0;

        // Pregunta 1
        System.out.println("\nQuestion 1: What is the output of 'System.out.println(5 + 3);'?");
        System.out.println("a) 53\nb) 8\nc) 5+3\nd) Error");
        System.out.println("Answer: ");
        String pregunta1 = sc.next().toLowerCase();
        if (pregunta1.equals("b")) {
            puntos = +1;
        }

        // Pregunta 2   
        System.out.println("\nQuestion 2: Which keyword is used to create a class in Java?");
        System.out.println("a) class\nb) create\nc) new\nd) method");
        System.out.println("Answer: ");
        String pregunta2 = sc.next().toLowerCase();
        if (pregunta2.equals("a")) {
            puntos = +1;
        }

        // Pregunta 3
        System.out.println("\nQuestion 3: What data type is used to create a variable that should store text?");
        System.out.println("a) myString\nb) String\nc) Txt\nd) Text");
        System.out.println("Answer: ");
        String pregunta3 = sc.next().toLowerCase();
        if (pregunta3.equals("c")) {
            puntos = +1;
        }

        // Pregunta 4
        System.out.println("\nQuestion 4: How do you start the main method in Java?");
        System.out.println("a) public void main()\nb) public static void main()\nc)  main()\nd) static void main()");
        System.out.println("Answer: ");
        String pregunta4 = sc.next().toLowerCase();
        if (pregunta4.equals("c")) {
            puntos = +1;
        }

        // pregunta 5
        System.out.println("\nQuestion 5: What is the correct way to create a variable of type int?");
        System.out.println("a) int num = 5\nb) integer num = 5\nc) num int = 5\nd)  num = int 5");
        System.out.println("Answer: ");
        String pregunta5 = sc.next().toLowerCase();
        if (pregunta5.equals("d")) {
            puntos = +1;
        }
        System.out.println("\nFinal Grade: " + puntos + "/5");

    }

    private static void ejercicio2() {
        System.out.println("\nEnter a 3-digit number: ");
        int numero = sc.nextInt();

        // Verificación de 3 dígitos
        if ((numero >= 100 && numero <= 999) || (numero <= -100 && numero >= -999)) {
            // Obtener dígitos
            int centenas = Math.abs(numero) / 100; // primer dígito
            int unidades = Math.abs(numero) % 10;  // último dígito

            // Comprobar si es capicúa
            if (centenas == unidades) {
                System.out.println("\nThe number is capicua");
            } else {
                System.out.println("\nThe number is not capicua");
            }
        } else {
            System.out.println("Este no es un número de 3 dígitos.");
        }
    }

    private static void ejercicio3() {
        System.out.println("\nEnter a number: ");
        int numero = sc.nextInt();
        int count = 0;
        if (numero >= 100000 || numero <= -100000) {
            System.out.println("Este no es un número de 5 dígitos.");
            return;
        } else if (numero < 0) {
            numero = -numero; // Hacer el número positivo
        }

        if (numero >= 10000) {
            count = 5;
        } else if (numero >= 1000) {
            count = 4;
        } else if (numero >= 100) {
            count = 3;
        } else if (numero >= 10) {
            count = 2;
        } else {
            count = 1; // Para el caso 0
        }

        System.out.println("\nThe number has " + count + " digits");
    }

    private static void ejercicio4() {
        // Pedir el día de la semana
        System.out.println("\nEnter day of the week: ");
        String dia = sc.next().toLowerCase();
        sc.nextLine();

        // Pedir la hora en formato HH MM
        System.out.println("Enter time (HH MM): ");
        String tiempo = sc.nextLine(); // Lee ambos valores en una línea

        String[] partes = tiempo.split(" ");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        int minutosRestantes = 0; // Variable para almacenar el tiempo restante en minutos

        // Calcular los minutos restantes hasta el fin de semana dependiendo del día y la hora
        switch (dia) {
            case "monday":
                minutosRestantes = ((4 * 24 + 15) * 60) - (horas * 60 + minutos);
                break;
            case "tuesday":
                minutosRestantes = ((3 * 24 + 15) * 60) - (horas * 60 + minutos);
                break;
            case "wednesday":
                minutosRestantes = ((2 * 24 + 15) * 60) - (horas * 60 + minutos);
                break;
            case "thursday":
                minutosRestantes = ((1 * 24 + 15) * 60) - (horas * 60 + minutos);
                break;
            case "friday":
                minutosRestantes = (15 * 60) - (horas * 60 + minutos);
                break;
            default:
                System.out.println("Dia no valido. Ingrese un dia entre monday y friday.");
                return;
        }

        // Mostrar el resultado final
        if (minutosRestantes > 0) {
            System.out.println("\nMinutes until weekend: " + minutosRestantes);
        } else {
            System.out.println("Ya es fin de semana o el tiempo ingresado es posterior al inicio del fin de semana.");
        }
    }

    private static void ejercicio5() {
        // Pedir la base imponible
        System.out.println("\nEnter the taxable base: ");
        double baseImponible = sc.nextDouble();

        // Pedir el tipo de impuesto
        System.out.println("Enter the TAX type (general, reduced, super-reduced): ");
        String tipoImpuesto = sc.next().toLowerCase();

        // Calcular el impuesto según el tipo
        double porcentajeImpuesto = 0;
        if (tipoImpuesto.equals("general")) {
            porcentajeImpuesto = 0.21;
        } else if (tipoImpuesto.equals("reduced")) {
            porcentajeImpuesto = 0.10;
        } else if (tipoImpuesto.equals("super-reduced")) {
            porcentajeImpuesto = 0.04;
        } else {
            System.out.println("Tipo de impuesto no válido.");
            return;
        }

        // Pedir el código promocional
        System.out.println("Enter the promo code (noPromo, half, fixdDiscount, percentage): ");
        String codigoPromo = sc.next().toLowerCase();

        // Calcular el precio con impuestos
        double impuesto = baseImponible * porcentajeImpuesto;
        double precioconimpuestos = baseImponible + impuesto;

        // Aplicar el descuento según el código promocional
        double descuento = 0;
        if (codigoPromo.equals("half")) {
            descuento = precioconimpuestos * 0.5;
        } else if (codigoPromo.equals("fixdiscount")) {
            descuento = 5;
        } else if (codigoPromo.equals("percentage")) {
            descuento = precioconimpuestos * 0.05;
        } else if (!codigoPromo.equals("nopromo")) {
            System.out.println("Código promocional no válido.");
            return;
        }

        // Calcular el total después de aplicar el descuento
        double total = precioconimpuestos - descuento;

        // Mostrar resultados
        System.out.printf("\n%-20s %16.2f\n", "Base imponible:", baseImponible);
        System.out.printf("IMPUESTO (%.0f%%): %20.2f\n", porcentajeImpuesto * 100, impuesto);
        System.out.printf("%-20s %15.2f\n", "Precio con impuestos:", precioconimpuestos);
        System.out.printf("Codigo promocional (%s): %10.2f\n", codigoPromo, descuento);
        System.out.printf("%-20s %16.2f\n", "TOTAL:", total);

    }

    private static void ejercicio6() {
        boolean jugada1OK;
        boolean jugada2OK;
        System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String opcionJugador1 = sc.next().toLowerCase();

        switch (opcionJugador1) {
            case "papel":
                jugada1OK = true;
            case "piedra":
                jugada1OK = true;
            case "tijera":
                jugada1OK = true;
                break;
            default:
                jugada1OK = false;
                System.out.println("Jugada no valida para el jugador 1");
                break;
        }

        System.out.println("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String opcionJugador2 = sc.next().toLowerCase();

        switch (opcionJugador2) {
            case "papel":
                jugada2OK = true;
            case "piedra":
                jugada2OK = true;
            case "tijera":
                jugada2OK = true;
                break;
            default:
                jugada2OK = false;
                System.out.println("Jugada no valida para el jugador 2");
                break;
        }
        if (jugada1OK && jugada2OK == true) {

            if (opcionJugador1.equals(opcionJugador2)) {
                System.out.println("Empate");
            } else {
                String numJugador = "1";
                switch (opcionJugador1) {
                    case "papel":
                        if (!opcionJugador2.equals("piedra")) {
                            numJugador = "2";
                        }
                        break;
                    case "piedra":
                        if (!opcionJugador2.equals("tijera")) {
                            numJugador = "2";
                        }
                        break;
                    case "tijera":
                        if (!opcionJugador2.equals("papel")) {
                            numJugador = "2";
                        }
                        break;
                    default:
                        System.out.println("Opción no válida");
                        break;
                }
                System.out.println("Ha ganado el jugador: " + numJugador);
            }
        } else {
            System.out.println("Hay jugadas invalidas");
        }
    }
}
