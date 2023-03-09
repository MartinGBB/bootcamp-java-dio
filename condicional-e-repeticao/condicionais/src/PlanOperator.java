/*
 * Imagina que fomos requisitados a criar um sistema de plano telefônico onde:
 * O sistema terá 03 planos: BASIC, MIDIA , TURBO;
 * BASIC: 100 minutos de ligação;
 * MIDIA: 100 minutos de ligação + WhatsApp e Instagram grátis;
 * TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB Youtube.
 */


public class PlanOperator {
  public static void main(String[] args) {
    plan("TURBO");
  }
  
  public static void plan(String plan) {
    switch (plan) {
      case "BASIC":
        System.out.println("O plano BASIC tem 100 minutos de ligação");
      
      case "MIDIA":
        System.out.println("O plano MIDIA tem 100 minutos de ligação + WhatsApp e Instagram grátis"); 
      
      case "TURBO":
        System.out.println("O plano TURBO tem 100 minutos de ligação + WhatsApp e Instagram grátis"); 
    }
  }
}
