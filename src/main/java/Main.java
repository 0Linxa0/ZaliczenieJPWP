import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Podaj tekst: ");
    String txt = sc.nextLine();
    String reverse= new StringBuilder(txt).reverse().toString();
    System.out.println(reverse);
    if (reverse.equalsIgnoreCase(txt)){
      System.out.println("Jest palindromem");
    }
    else {
      System.out.println("Nie jest palindromem");
    }
    
    

    
  }

 
}