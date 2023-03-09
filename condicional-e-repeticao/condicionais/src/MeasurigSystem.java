class MeasuringSystem {
  public static void main(String[] args) {
    switchCase('P');
    ifElse('s');
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
          System.out.println("INDEFINIDO");
    }
  }

  public static void ifElse(char acronym) {
    if (acronym == 'P') {
      System.out.println("PEQUENO");
    }
    else if (acronym == 'M') {
      System.out.println("MÉDIO");
    }
    else if (acronym == 'G') {
      System.out.println("GRANDE");
    }
    else {
      System.out.println("INDEFINIDO");
    }
  } 
}