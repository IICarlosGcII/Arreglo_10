import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

        int[] arreglo = new int[10]; //Declaramos el array con 10 espacios
        boolean creciente = true; //Declramos la variable de tipo boolean
        int numero,sitio=0,j=0; //Declaramos las varables a usar

        do{ //Usamos un do while para que se ejecute hasta que se cumpla
            System.out.println("Llenando el arreglo: ");
            for(int i = 0 ; i<5 ; i++){ //Guardar datos del arreglo, en este caso 5 porque eso nos piden
                arreglo[i] = entrada.nextInt(); //almacenamos todos los datos en el arreglo
            }
            for(int i = 0; i<4 ; i++) { //Hacemos un bucle para que el usuario vuelva a insertar un array ordenado con 4 veces de oportunidad sino se mostrara el arreglo insistente
                if (arreglo[i]<arreglo[i+1]) { //1-2-3-4-5...
                    creciente = true; //Logica resuelta, es creciente

                }
                if (arreglo[i]>arreglo[i+1]) { //5-4-3-2-1...
                    creciente = false; //Logica resuelta, es creciente
                    break; //Hacemos un brake para que temrine aqui
                }
            }

            if(creciente == false){ //mandamos mensaje al usuario
                System.out.println("El arreglo no esta ordenado, digite un nuevo arreglo");
            }
        }while(creciente == false); //Terminamos el while y esto va serguir repitiendose mientras el arreglo no sea creciente

            System.out.println("Digite un elemento a insertar: "); //Saliendo del bucle while se pide el numero
            numero = entrada.nextInt(); //Pedimos el numero que vamos a ingresar y guardamos en la variable numero

            //Buscamos que la posicion arreglo[j] sea menor que numero para poder colocarlo y que el arreglo quede en orden
            while(arreglo[j] < numero  && j<5) { //Si la posicion i del arreglo es menos a numero y j, numero de espacios del arreglo, es menos que cinco, o sea hay 5 espacios en el arreglo
                sitio++; //aumentamos por cada iteracin
                j++;
            }

            for(int i=4 ; i>=sitio ; i--){ //Recorremos hacia la derecha un espacio para dejar libre al nuevo numero ingresado
                arreglo[i+1] = arreglo[i]; // la posicion que le sigue sera la posicion nueva del numero anterior
            }

            arreglo[sitio] = numero; //Colocamos el numero en el sitio creado anteriormente

        System.out.println("El arreglo es: ");
        for(int i = 0 ; i<6 ; i++){ //mostramos el arreglo resultante
            System.out.print(arreglo[i]+" - ");
        }
    }
}
