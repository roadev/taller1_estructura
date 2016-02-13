/*
* This program makes multiple operations between vectors
*/

import java.util.*;

/**
*
* @author Juan Roa
* @version 0.2.3
* @since 2016-02-10
*/

public class Vector {

  private int mayor;
  private int menor;

  // Constructor
  public void vector() {
    mayor = 0;
    menor = 700;
  }

  java.util.Scanner input = new java.util.Scanner(System.in);

  public int[] vectorCalc() {

    int vector[];

    System.out.println("Digite el tamaño del vector: ");
    vector = new int[input.nextInt()];

    for (int i = 0; i < vector.length; i++) {
      System.out.println("Digite el valor del índice " + i);
      vector[i] = input.nextInt();
    }
    return vector;
  }

  //Punto 1
  public void inverse(int[] vector) {

    System.out.println("El vector en sentido inverso es: ");
    for (int i = (vector.length - 1); i >= 0; i--) {
      System.out.print(vector[i] + "  ");
    }
  }

  public int sum(int[] vector) {

    int sum = 0;
    for (int i = 0; i < vector.length; i++) {
      sum = sum + vector[i];
    }

    return sum;
  }

  // Punto 2
  public double prom(int [] vector, int sum) {

    double prom = 0;
    prom = (sum / vector.length);

    return prom;
  }

  public void mostrarsumComponentes(int[] vector) {

    System.out.println("\nLa suma de las componentes es: " + sum(vector));
  }


  public void promCalc(int sum, int[] vector){

    System.out.println("\nEl prom es : " + prom(vector, sum));
  }

  //Punto 3

  public void iguales(int [] vector) {

    int contP = 0;
    int contU = 0;
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] != vector[0]) {
        contP++;
      }
      if (i != vector.length - 1) {
        if (vector[i] == vector[vector.length - 1]) {
          contU++;
        }
      }
    }
    System.out.println("La cantidad de elementos iguales al ultimo son: " + contU);
    System.out.println("La cantidad de elementos diferentes al primero son: " + contP);
  }

  public void sumPairs(int [] vector) {

    int sumPares = 0;
    String text = "";
    for (int i = 0; i < vector.length; i++) {
      if ((vector[i] % 2) == 0) {
        sumPares = sumPares + vector[i];
        text += "+" + vector[i];
      }
    }
    System.out.println("La suma de los números pares es: " + text + " = " + sumPares);
  }

  public void sumImpares(int [] vector) {

    int sumImpares = 0;
    String text = "";

    for (int i = 0; i < vector.length; i++) {
      if (i % 2 == 0) {
        if ((vector[i] % 2) != 0) {
          sumImpares = sumImpares + vector[i];
          text += "+" + vector[i];
        }
      }
    }
    System.out.println("La suma de los números Impares, en posicion par es: " + text + " = " + sumImpares);
  }

  public void menoresprom(int [] vector, double prom) {

    int cont = 0;
    String text = "";
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] < prom) {
        cont++;
        text += vector[i] + ",";
      }
    }
    System.out.println("Los números menores al prom son: " + text + " Total: " + cont);
  }

  public void mayorMenor(int [] vector) {

    for (int i = 0; i < vector.length; i++) {
      if (vector[i] > mayor) {
        mayor = vector[i];
      }
      if (vector[i] < menor) {
        menor = vector[i];
      }
    }
    System.out.println("El elemento mayor es: " + mayor + " El elemento menor es: " + menor);
  }

  public void menorRepetido(int [] vector) {

    int cont = 0;
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == menor) {
        cont++;
      }
    }
    System.out.println("El numero menor se repite: " + cont + " veces");
  }

  public void fivePosition(int [] vector) {

    int posicion = 0;
    int cont = 0;
    for (int i = 0; i < vector.length; i++) {
      if (vector[i] == 5) {
        posicion = i;
        i = vector.length;
      } else {
        cont++;
      }
    }
    if (cont == vector.length) {
      System.out.println("El vector no tiene 5");

    } else {
      System.out.println("La posición en la que se encuentra el primer 5 es: " + posicion);
    }
  }

  public int[] vectorialSum(int [] vector, int [] vector2) {

    int vector3[] = new int[vector2.length];
    for (int i = 0 ; i < vector2.length; i++){
      vector3[i] = vector[i] + vector2[i];
    }
    return vector3;

  }

  public void showVectorialSum (int[] vector, int[] vector2){

    System.out.println("\nLa suma de los dos vectores es:" );
    for (int i = 0 ; i < vectorialSum(vector, vector2).length; i++){
      System.out.print(vectorialSum(vector, vector2)[i] + " ");
    }
  }
}
