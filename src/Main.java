// ejercicio 1 sumativa 1 .cpp : Programa que calcula la media aritmetica de 5 numeros. Por: Josmar Osorio. Para: Programación II-UBA.

import java.util.Scanner;//Importamos la libreria java.util.Scanner para poder leer datos ingresados por pantalla
public class Main {

    public static void main(String[] args) {

     Scanner sc = new Scanner(System.in); //Creamos el objeto sc para leer la entrada de datos que ingrese el usuario

     System.out.println("Por favor introduzca el primer numero: ");//Mostarmos un mensaje para que el usuario sepa que debe ingresar un numero
     double numero1 = sc.nextDouble();//Se guarda el valor ingresado por el usuario en una variable que es leida por el objeto sc

     System.out.println("Por favor introduzca el segundo numero: ");//Mostarmos un mensaje para que el usuario sepa que debe ingresar un numero
     double numero2 = sc.nextDouble();//Se guarda el valor ingresado por el usuario en una variable que es leida por el objeto sc

     System.out.println("Por favor introduzca el tercer numero: ");//Mostarmos un mensaje para que el usuario sepa que debe ingresar un numero
     double numero3 = sc.nextDouble();//Se guarda el valor ingresado por el usuario en una variable que es leida por el objeto sc

     System.out.println("Por favor introduzca el cuarto numero: ");//Mostarmos un mensaje para que el usuario sepa que debe ingresar un numero
     double numero4 = sc.nextDouble();//Se guarda el valor ingresado por el usuario en una variable que es leida por el objeto sc

     System.out.println("Por favor introduzca el quinto numero: ");//Mostarmos un mensaje para que el usuario sepa que debe ingresar un numero
     double numero5 = sc.nextDouble();//Se guarda el valor ingresado por el usuario en una variable que es leida por el objeto sc

     double media = (numero1 + numero2 + numero3 + numero4 + numero5) /5;//Calculamos la media sumando todos los numeros ingresados y dividiendo ese resultado entre 5

     System.out.println("La media de estos 5 numeros es de: " + media);//Mostramos el resultado final por pantalla al usuario
    }
}