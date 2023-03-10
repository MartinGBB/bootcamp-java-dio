import java.util.Scanner;

/*
Faça um programa que peça uma nota, entre zero e dez.
Mostre uma mensagem caso o valor seja inválido
e continue pedindo
até que o usuário informe um valor válido.
*/

public class Ex2_Grade {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int grade;
    
    
    System.out.println("Digite uma nota de 0 a 10:");
    grade = scanner.nextInt();
    
    while(grade > 10 || grade < 0) {
      System.out.println("Nota invalida, digite novamente");
      grade = scanner.nextInt();
    }
  }
}
