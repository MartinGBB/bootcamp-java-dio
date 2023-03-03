public class Operadores {
    public static void main(String[] args) {
        String fullName = "Linguagem" + "JAVA";
        System.out.println(fullName);

        String concat ="?"; 
        concat = 1+1+1+"1";
        System.out.println(concat);

        concat = 1+"1"+1+1;
        System.out.println(concat);

        concat = 1+"1"+1+"1";
        System.out.println(concat);

        concat = "1"+1+1+1;
        System.out.println(concat);

        concat = "1"+(1+1+1);       
        System.out.println(concat);


        condiçao(args);
    }

    public static void condiçao(String[] args) {
      int a, b;
      a = 6;
      b = 6;
    
      boolean result;

      if(a==b)
        result = true;
      else
        result = false;

      System.out.println("Condicional: " + result);
      };


}
