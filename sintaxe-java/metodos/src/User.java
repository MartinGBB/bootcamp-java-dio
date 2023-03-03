public class User {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada: " + smartTv.on);
    System.out.println("volumem: " + smartTv.volume);
    System.out.println("canal: " + smartTv.channel);

    System.out.println("Metodos:");

    smartTv.on(args);
    System.out.println("TV ligada: " + smartTv.on);

  }
}
