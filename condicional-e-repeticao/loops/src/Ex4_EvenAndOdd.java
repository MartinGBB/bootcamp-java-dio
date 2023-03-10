import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/

public class Ex4_EvenAndOdd {
  public static void main(String[] args) {
    int number =  0;
    int pair = 0;
    int odd = 0;
    int count = 0;
    int quantityNumbers = 0;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Digite quantidade de repetição:");
      quantityNumbers = scanner.nextInt();
  
      do {
        System.out.println("Digite um numero:");
        number = scanner.nextInt();
        count += 1;
    
        if (number % 2 == 0) pair += 1;
        else odd += 1;
      } while(count < quantityNumbers);
    }
 
  System.out.println("Números pares: " + pair);
  System.out.println("Números ímpares: " + odd);
  }
}
