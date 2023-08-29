import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Condicional switch-Condicional multiple
        Scanner lector = new Scanner(System.in);
        double valorA, valorB, resultado,cociente = 0.0;
        System.out.println("Menu de opciones:");
        System.out.println("a) Sumar");
        System.out.println("b) Restar");
        System.out.println("c) Multiplicar");
        System.out.println("d) Dividir");
        System.out.println("e) Potenciacion");
        System.out.println("f) Radicacion");
        System.out.println("g) Salir");
        char opc = lector.next().charAt(0);
        switch (opc) {
            case 'A':
            case 'a':
                System.out.println("1) Sumar");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                resultado = valorA + valorB;
                System.out.println("La suma de " + valorA + " + " + valorB + " = " + resultado);
                break;
            case 'B':
            case 'b':
                System.out.println("2) Restar");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                resultado = valorA - valorB;
                System.out.println("La diferencia entre " + valorA + " - " + valorB + " = " + resultado);
                break;
            case 'C':
            case 'c':
                System.out.println("3) Multiplicar");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                resultado = valorA * valorB;
                System.out.println("El producto de " + valorA + " * " + valorB + " = " + resultado);
                break;
            case 'd':
                System.out.println("4) Dividir");
                System.out.print("a: ");
                valorA = lector.nextDouble();
                System.out.print("b: ");
                valorB = lector.nextDouble();
                if (valorB == 0) {
                    System.out.println("El divisor no puede ser 0.");
                } else {
                    cociente = valorA / valorB;
                    System.out.println("El cociente entre " + valorA + " / " + valorB + " = " + cociente);
                }                
                break;
            case 'e':
                System.out.println("e) Potenciacion");
                System.out.println("Base: ");
                valorA = lector.nextDouble();
                System.out.println("Exponente: ");
                valorB = lector.nextDouble();
                resultado = Math.pow(valorA,valorB);
                System.out.println(valorA + " a la " + valorB + " = " + resultado);
                break;
            case 'f':
                System.out.println("f) Radicacion");
                System.out.println("Radicando: ");
                valorA = lector.nextDouble();                             
                resultado = Math.sqrt(valorA);
                if (valorA < 0) {
                    System.out.println("El radicando " + valorA +  " no puede ser menor que 0");
                    System.out.println("El resultado es un numero complejo o imaginario");
                } else {
                    System.out.println(" La raiz cuadrada de " + valorA + " = " + resultado);
                }                
                break;
            case 'g':
                System.out.println("Saliendo de la App");
                break;
            default:
                System.out.println("Opcion incorrecta/no valida.");
                System.out.println("Saliendo de la App");
                break;
        }
        lector.close();
    }
}
