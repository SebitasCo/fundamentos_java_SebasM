import java.util.Scanner;
public class solve {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            mostrarMenu();
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Main.Ejercicio1();
                    break;
                case 2:
                    Main.Ejercicio2();
                    break;
                case 3:
                    Main.Ejercicio3();
                    break;
                case 4:
                    Main.Ejercicio4();
                    break;
                case 5:
                    Main.Ejercicio5();
                    break;

                case 6:
                    Main.Ejercicio6();
                    break;
                case 7:
                    Main.Ejercicio7();
                    break;
                case 8:
                    Main.Ejercicio8();
                    break;
                case 9:
                    Main.Ejercicio9();
                    break;
                case 10:
                    Main.Ejercicio10();
                    break;

                case 11:
                    Main.Asignacion1();
                    break;
                case 12:
                    Main.Asignacion2();
                    break;
                case 13:
                    Main.Asignacion3();
                    break;
                case 14:
                    Main.Asignacion4();
                    break;
                case 15:
                    Main.Asignacion5();
                    break;
                case 16:
                    Main.OperadoresID1();
                    break;
                case 17:
                    Main.OperadoresID2();
                    break;
                case 18:
                    Main.OperadoresID3();
                    break;
                case 19:
                    Main.OperadoresID4();
                    break;
                case 20:
                    Main.OperadoresID5();
                    break;
                case 21:
                    Main.Combinados1();
                    break;
                case 22:
                    Main.Combinados2();
                    break;
                case 23:
                    Main.Combinados3();
                    break;
                case 24:
                    Main.Combinados4();
                    break;
                case 25:
                    Main.Combinados5();
                    break;
                case 26:
                    Main.Combinados6();
                    break;
                case 27:
                    Main.Combinados7();
                    break;
                case 28:
                    Main.Combinados8();
                    break;
                case 29:
                    Main.Combinados9();
                    break;
                case 30:
                    Main.Combinados10();
                    break;








                case 31:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 31);

        scanner.close();
    }

    public static void mostrarMenu() {
        System.out.println("----- MENÚ PRINCIPAL -----");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("4. Ejercicio 4");
        System.out.println("5. Ejercicio 5");
        System.out.println("6. Ejercicio 6");
        System.out.println("7. Ejercicio 7");
        System.out.println("8. Ejercicio 8");
        System.out.println("9. Ejercicio 9");
        System.out.println("10. Ejercicio 10");
        System.out.println("11. Asignacion 1");
        System.out.println("12. Asignacion 2");
        System.out.println("13. Asignacion 3");
        System.out.println("14. Asignacion 4");
        System.out.println("15. Asignacion 5");
        System.out.println("16. Operadores Incremento y Decremento 1");
        System.out.println("17. Operadores Incremento y Decremento 2");
        System.out.println("18. Operadores Incremento y Decremento 3");
        System.out.println("19. Operadores Incremento y Decremento 4");
        System.out.println("20. Operadores Incremento y Decremento 5");
        System.out.println("21. Combinado 1");
        System.out.println("22. Combinado 2");
        System.out.println("23. Combinado 3");
        System.out.println("24. Combinado 4");
        System.out.println("25. Combinado 5");
        System.out.println("26. Combinado 6");
        System.out.println("27. Combinado 7");
        System.out.println("28. Combinado 8");
        System.out.println("29. Combinado 9");
        System.out.println("30. Combinado 10");

        System.out.println("31. --------------------------");
    }
}
