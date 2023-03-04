public class User {
  public static void main(String[] args) throws Exception {
    SmartTv smartTv = new SmartTv();

    System.out.println("TV ligada: " + smartTv.on);
    System.out.println("volume atual: " + smartTv.volume);
    System.out.println("canal atual: " + smartTv.channel);

    System.out.println("Metodos:");

    smartTv.on();
    System.out.println("TV ligada(metodo on): " + smartTv.on);

    smartTv.off();
    System.out.println("TV ligada(metodo off): " + smartTv.on);

    smartTv.increaseVolume();
    smartTv.increaseVolume();
    smartTv.increaseVolume();
    smartTv.increaseVolume();
    System.out.println("Aumentar volume: " + smartTv.volume);

    smartTv.decreaseVolume();
    System.out.println("Diminuir volume: " + smartTv.volume);


    
    
    smartTv.changeChanel(52);

    smartTv.increaseChanel();
    smartTv.increaseChanel();

    smartTv.decreaseChanel();
    System.out.println("Canal com parametro: " + smartTv.channel);
    
  }
}
