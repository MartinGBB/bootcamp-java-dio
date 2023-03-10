import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

public class Ex3_MajorAndMedian {
  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {

      int number;
      int count = 0;
      int major = 0;
      int sum = 0;
      int media = 0;

      do {
        System.out.println("Digite um numero:");
        number = scanner.nextInt();

        sum += number;
        media = sum / 5;
        if (major < number) major = number;

        count += 1;
      } while(count < 5);

      System.out.println("O maior é: " + major);
      System.out.println("A media é: " + media);
    }
  }
}
