package com.example.tablas;

import java.util.Scanner;

public class TablasMulti {

    public void mostrarTabla() {
        System.out.println("¿Que tabla quieres visualizar?\n1. Tabla del 1\n2. Tabla del 2" +
        "\n3. Tabla del 3\n4. Tabla del 4\n5. Tabla del 5\n6. Tabla del 6\n7. Tabla del 7\n8. Tabla del 8" + 
        "\n9. Tabla del 9");

        int opc;
        Scanner in = new Scanner(System.in);
        opc = in.nextInt();

        switch (opc) {
            case 1:
                tabla1();
                break;
            case 2:
                tabla2();
                break;
            case 3:
                tabla3();
                break;
            case 4:
                tabla4();
                break;
            case 5:
                tabla5();
                break;
            case 6:
                tabla6();
                break;
            case 7:
                tabla7();
                break;
            case 8:
                tabla8();
                break;
            case 9:
                tabla9();
                break;
            default:
                System.out.println("Opción no encontrada");
                break;
        }

        in.close();
    }

    public int tabla1() {
        System.out.println("1 x 1 = 1\n1 x 2 = 2\n1 x 3 = 3\n1 x 4 = 4\n1 x 5 = 5\n1 x 6 = 6\n1 x 7 = 7\n1 x 8 = 8\n1 x 9 = 9\n1 x 10 = 10");
        return 0;
    }

    public int tabla2() {

        System.out.println("2 x 1 = 2\n2 x 2 = 4\n2 x 3 = 6\n2 x 4 = 8\n2 x 5 = 10\n2 x 6 = 12\n2 x 7 = 14\n2 x 8= 16\n2 x 9 = 18\n2 x 10 = 20");
        return 0;
    }

    public int tabla3() {
        System.out.println("3 x 1 = 3\n3 x 2 = 6\n 3 x 3 = 9\n3 x 4 = 12\n3 x 5 = 15\n3 x 6 = 18\n3 x 7 = 21\n3 x 8 = 24\n 3 x 9 = 27\n3 x 10 = 30");
        return 0;
    }

    public int tabla4() {
        System.out.println("4 x 1 = 4\n4 x 2 = 8\n4 x 3 = 12\n4 x 4 = 16\n4 x 5 = 20\n4 x 6 = 24\n4 x 7 = 28\n4 x 8 = 32\n4 x 9 = 36\n4 x 10 = 40");
        return 0;
    }

    public int tabla5() {
        System.out.println("5 x 1 = 5\n5 x 2 = 10\n5 x 3 = 15\n5 x 4 = 20\n5 x 5 = 25\n5 x 6 = 30\n5 x 7 = 35\n5 x 8 = 40\n5 x 9 = 45\n5 x 10 = 50");
        return 0;
    }

    public int tabla6() {
        System.out.println("6 x 1 = 6\n6 x 2 = 12\n6 x 3 = 18\n6 x 4 = 24\n6 x 5 = 30\n6 x 6 = 36\n6 x 7 = 42\n6 x 8 = 48\n6 x 9 = 54\n6 x 10 = 60");
        return 0;
    }

    public int tabla7() {
        System.out.println("7 x 1 = 7\n7 x 2 = 14\n7 x 3 = 21\n7 x 4 = 28\n7 x 5 = 35\n7 x 6 = 42\n7 x 7 = 49\n7 x 8 = 56\n7 x 9 = 63\n7 x 10 = 70");
        return 0;
    }

    public int tabla8() {
        System.out.println("8 x 1 = 8\n8 x 2 = 16\n8 x 3 = 24\n8 x 4 = 32\n8 x 5 = 40\n8 x 6 = 48\n8 x 7 = 56\n8 x 8 = 64\n8 x 9 = 72\n8 x 10 = 80");
        return 0;
    }

    public int tabla9() {
        System.out.println("9 x 1 = 9\n9 x 2 = 18\n9 x 3 = 27\n9 x 4 = 36\n9 x 5 = 45\n9 x 6 = 54\n9 x 7 = 63\n9 x 8 = 72\n9 x 9 = 81\n9 x 10 = 90");
        return 0;
    }
    
}
