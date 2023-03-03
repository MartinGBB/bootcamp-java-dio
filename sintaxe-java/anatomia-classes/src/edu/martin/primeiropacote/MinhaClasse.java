package edu.martin.primeiropacote;

public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Martin";
        String lastName = "Brazón";

        String fullName = fullName(firstName, lastName);
        System.out.print(fullName);
    }

    public static String fullName(String firstName, String lastName) {
        return "Nome completo: " + firstName.concat(" ").concat(lastName);
    }
}
