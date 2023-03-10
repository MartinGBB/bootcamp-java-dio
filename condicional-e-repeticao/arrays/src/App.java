public class App {
    public static void main(String[] args) {
        int[] arrayOfNumbers = { -5, -6, 15, 20, 40, 12 }; 
        System.out.println(arrayOfNumbers); // espaco em memoria

        int count = arrayOfNumbers.length - 1;

        while(count >= 0) {
            System.out.print(arrayOfNumbers[count] + " ");
            count -= 1;
        }
    }
}
