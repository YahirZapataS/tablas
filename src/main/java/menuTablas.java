package com.example.tablas;

import java.util.Scanner;

public class menuTablas {
    public static void main(String[] args) {

        TablasMulti tablas = new TablasMulti();

        Scanner in = new Scanner(System.in);
        int opcion;
        System.out.println("Selecciona una opcionión: \n1. Mostrar una tabla\n2. Mostrar tablas del 2 al 5\n3. Salir");
        opcion = in.nextInt();

        do {
            switch (opcion) {
                case 1:
                    tablas.mostrarTabla();
                    break;
                case 2:
                    tablas.tabla2();
                    tablas.tabla3();
                    tablas.tabla4();
                    tablas.tabla5();
                    break;
                case 3:
                    System.out.println("Hasta luego");
            }
        } while (opcion != 3);

        in.close();
    }
}