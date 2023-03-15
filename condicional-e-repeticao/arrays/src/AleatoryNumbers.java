import java.util.Random;

public class AleatoryNumbers {
  public static void main(String[] args) {
    Random random = new Random();

    int[] aleatoryNumbers = new int[20];

    for(int i = 0; i < aleatoryNumbers.length; i += 1) {
      int number = random.nextInt(100);
      aleatoryNumbers[i] = number;
    }

    for (int number : aleatoryNumbers) {
      System.out.println(number);
    }
    System.out.println("quantidade: " + aleatoryNumbers.length);
  }
}
