import java.util.Scanner;
import java.lang.Math;
class Main {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Co chcesz zrobić?");
    System.out.println("1 - mnożenie");
    System.out.println("2 - dzielenie");
    System.out.println("3 - pierwiastek");
    System.out.println("4 - potęga");
    System.out.println("5 - reszta");
    double a, b, wynik;
    int x = scanner.nextInt();
    switch (x){
        
    case 1:
    System.out.println("Mnożenie");
        
    System.out.println("Podaj pierwszą liczbę");
    a = scanner.nextFloat();
    
    System.out.println("Podaj drugą liczbę");
    b = scanner.nextFloat();
    
    wynik = a*b;
    System.out.println("Twój wynik to: "+wynik);
    break;
        
    case 2:
    System.out.println("Dzielenie")
      ;
    System.out.println("Podaj pierwszą liczbę");
    a = scanner.nextFloat();
    
    System.out.println("Podaj drugą liczbę");
    b = scanner.nextFloat();
        
    wynik = a/b;
    System.out.println("Twój wynik to: "+wynik);
    break;

    case 3:
    System.out.println("Pierwiastek")
      ;
    System.out.println("Podaj liczbę");
    a = scanner.nextFloat();
        
    wynik = Math.sqrt(a);
    System.out.println("Twój wynik to: "+wynik);
    break;

    case 4:
    System.out.println("Potęga")
      ;
    System.out.println("Podaj liczbę");
    a = scanner.nextFloat();

    System.out.println("Podaj potęgę");
    b = scanner.nextFloat();
        
    wynik = Math.pow(a, b);
    System.out.println("Twój wynik to: "+wynik);
    break;

    case 5:
    System.out.println("Reszta")
      ;
    System.out.println("Podaj pierwszą liczbę");
    a = scanner.nextFloat();

    System.out.println("Podaj drugą liczbę");
    b = scanner.nextFloat();
        
    wynik = a%b;
    System.out.println("Twój wynik to: "+wynik);
    break;
    }
  }
}