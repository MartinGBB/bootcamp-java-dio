import java.util.Scanner;

public class Consonants {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String[] consonants = new String[6];
    int consonantsQuantity = 0;
    int count = 0;
  
    do {
      System.out.println("Letra: ");
      String letter = scanner.next();

      if (!(letter.equalsIgnoreCase("a") |
          letter.equalsIgnoreCase("e") |
          letter.equalsIgnoreCase("i") |
          letter.equalsIgnoreCase("o") |
          letter.equalsIgnoreCase("u"))
      ) {

        consonants[count] = letter;
        consonantsQuantity += 1;
      }
        count += 1;
    } while(count < consonants.length);

    System.out.print("Consonantes: ");

    for (String consonant : consonants) {
      if (consonant != null) 
        System.out.print(consonant + " ");
    }
    System.out.print("Quantidade de consoantes: " + consonantsQuantity);
  }
}
