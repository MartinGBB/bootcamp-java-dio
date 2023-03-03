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
}
