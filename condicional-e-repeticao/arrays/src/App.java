public class App {
    public static void main(String[] args) {
        int[] arrayOfNumbers = { -5, -6, 15, 20, 40, 12 }; 
        System.out.println(arrayOfNumbers); // espaco em memoria

        int count = arrayOfNumbers.length - 1;

        System.out.print("Array inverso: ");
        while(count >= 0) {
            System.out.print(arrayOfNumbers[count] + " ");
            count -= 1;
        }

        System.out.println("");
        System.out.print("Array original: ");
        for (int index = 0; index < arrayOfNumbers.length; index += 1) {
            System.out.print(arrayOfNumbers[index] + " ");
        }
    }
}
