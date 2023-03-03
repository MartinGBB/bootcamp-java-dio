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
        compare(args);
    }

    public static void condiçao(String[] args) {
      int a, b;
      a = 6;
      b = 4;
    
      boolean result;

      if(a==b)
        result = true;
      else
        result = false;

      System.out.println("Condicional IF/ELSE: " + result);

      // Ternary operator
      boolean resultTernary = a==b ? true : false;
      System.out.println("Ternary operator: " + resultTernary);
      
      };

      public static void compare(String[] args) {
        String nome1 = "JAVA";
        String nome2 = "JAVA";
        System.out.println("compare:");
        
        System.out.println(nome1 == nome2); //true

        String nome3 = new String("JAVA");
        
        System.out.println(nome1 == nome3); //false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); //true
        
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true
        System.out.println(nome3.equals(nome4)); //true 

      }
}
