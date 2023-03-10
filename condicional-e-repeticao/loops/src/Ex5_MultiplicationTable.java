import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Ex5_MultiplicationTable {
  public static void main(String[] args) {
    int numberTable;    
    int currentValue;

    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Insira o numero da tabuada que deseja ver");
      numberTable = scanner.nextInt();

      for (int index = 1; index <= 10; index += 1) {
        currentValue = numberTable * index;
        System.out.println(numberTable + " X " + index + " = " + currentValue);
      }
    }
  }
}
