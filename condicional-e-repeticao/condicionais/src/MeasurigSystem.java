class MeasuringSystem {
  public static void main(String[] args) {
    switchCase('P');
  }

    public static void switchCase(char acronym) {
      switch (acronym) {
        case 'P':
          System.out.println("PEQUENO");
        break;
        
        case 'M':
          System.out.println("MÉDIO");
          break;

        case 'G':
          System.out.println("GRANDE");
        break;
        
        default: 
          System.out.println("Indefinido");
    }
  }
}