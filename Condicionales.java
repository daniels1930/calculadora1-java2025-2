// ANALISIS
/*
* Descripcion: 
* Entradas: 
* Salidas:
*/
import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); 

        int edad;
        String nombre, dia;
        double nota;


        System.out.println("Por favor deme la edad: ");
        edad = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Por favor dame tu nombre: ");
        nombre = entrada.nextLine();

        System.out.println("Dame la nota : ");
        nota = entrada.nextDouble();
        entrada.nextLine();

        System.out.println("Dame el dia: ");
        dia = entrada.nextLine();


        // Condicional simple

        if(edad >= 21) {
            System.out.println("Ya puedes irte a rumbear");
        }

        // Condicional doble

        if(nombre.equals("Juan")) {
            System.out.println("Eres Juan");
        } else {
            System.out.println("No eres Juan");
        }

        // Condicional anidado
        if((nota >= 1.0) && (nota <= 2.9)) {
            System.out.println ("bajo");


        } else if ((nota >= 3.0) && (nota <= 3.9)) {
            System.out.println ("basico");


        } else if ((nota >= 4.0) && (nota <= 4.5)) {
            System.out.println ("Alto");

        } else if ((nota >= 4.6) && (nota <= 5.0)) {
            System.out.println ("Superior");

    }


    switch(dia) {
        case "Lunes":
            System.out.println("Fuerza");
            break;
        case "Martes":
            System.out.println("Pereza");
            break;
        case "Miercoles":
            System.out.println("Normal");
            break;
        case "Jueves":
            System.out.println("Ya casi");
            break;
        case "Viernes":
            System.out.println("Por fin");
            break;
        case "Sabado":
            System.out.println("Rumba");
            break;
        case "Domingo":
            System.out.println("Guayabo");
            break;
        default:
            System.out.println("Error, no existe");
            break;
       }
    }
}