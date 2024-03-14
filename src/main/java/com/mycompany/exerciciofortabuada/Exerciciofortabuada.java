package com.mycompany.exerciciofortabuada;

import java.util.Scanner;

public class Exerciciofortabuada {

public static void main(String[] args) {
        
Scanner teclado = new Scanner(System.in);

int numero = teclado.nextInt();


for (int i = 1; i<=10; i++){
    System.out.println(numero + "x" + i + " = " + (numero*i));
}

    }
}
