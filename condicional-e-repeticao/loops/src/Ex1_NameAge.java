import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/


public class Ex1_NameAge {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            
            String name;
            int age;
            
            while(true) {        
                System.out.println("Nome: ");
                name = scanner.next();
                if (name.equals("0")) break;
                
                System.out.println("Idade: ");
                age = scanner.nextInt();
            }
        }
    }
}
