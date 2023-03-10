import java.util.Scanner;

/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

public class Ex6_factorial {
  public static void main(String[] args) {
    int fatorialIn;
    int fatorialOut = 1;
  
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Insira un valor para calcular o fatorial");
      fatorialIn = scanner.nextInt();

      for (int index = fatorialIn; index >= 1; index -= 1) {
        fatorialOut *= index;
      }
      System.out.println("!" + fatorialIn + " = " + fatorialOut);
    }
  }
}
