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
    }

    public static void condiçao(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        
        if(numero1 > numero2)
            System.out.print("Numero 1 maior que numero 2");
        
        if(numero1 < numero2)
            System.out.print("Numero 1 menor que numero 2");
        
        if(numero1 >= numero2)
            System.out.print("Numero 1 maior ou igual que numero 2");
        
        if(numero1 <= numero2)
            System.out.print("Numero 1 menor ou igual que numero 2");
        
        if(numero1 != numero2)
            System.out.print("Numero 1 é diferente de numero 2");
    }

}
