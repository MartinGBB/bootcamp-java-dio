import java.util.Locale;
import java.util.Scanner;

public class AboutMeTerminal {
  public static void main(String[] args) {
    try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) { 
      System.out.println("Digite seu nome");
      String name = scanner.next();
      
      System.out.println("Digite seu sobrenome");
      String lastName = scanner.next();
      
      System.out.println("Digite sua idade");
      int age = scanner.nextInt();
      
      System.out.println("Olá, me chamo " + name + " " + lastName);
      System.out.println("Tenho " + age + " anos");
    }
  }
};
