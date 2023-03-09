import java.util.Locale;
import java.util.Scanner;

/*
 * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
 * O sistema terá 03 planos: BASIC, MIDIA , TURBO;
 * BASIC: 100 minutos de ligação;
 * MIDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
 * TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
 */


public class PlanOperator {
  public static void main(String[] args) {

    try(Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
      System.out.println("Digite plano desejado:");
      String plan = scanner.next();
      planInformation(plan);
    }
  }
  
  public static void planInformation(String plan) {
    switch (plan) {
      case "BASIC":
        System.out.println("O plano BASIC tem 100 minutos de ligação.");
        break;
      
      case "MIDIA":
        System.out.println("O plano MIDIA tem 100 minutos de ligação + WhatsApp e Instagram grátis.");
        break; 
      
      case "TURBO":
        System.out.println("O plano TURBO tem 100 minutos de ligação + WhatsApp e Instagram grátis.");
        break; 
    
      default: 
        System.out.println("Plano invalido.");
        break;
    }
  }
}
