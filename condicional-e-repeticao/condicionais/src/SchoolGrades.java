public class SchoolGrades {
    public static void main(String[] args) {
        int grade = 7;

        if (grade >= 7)
            System.out.println("Aprovado");

        else if (grade >= 5 && grade < 7)
            System.out.println("Recuperação");

        else 
            System.out.println("Reprovado");
    }
}
