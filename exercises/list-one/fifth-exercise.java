import java.util.Scanner;

class FifthExercise {
  public static void main(String[] args) {
    final double METERS_PER_MILHA = 1609.0;
    final double METERS_PER_PÉ = 3.281;
    final double METERS_PER_POLEGADAS = 39.37;
    
    Scanner meterScanner = new Scanner(System.in);
    System.out.printf("Metros: ");
  
    String meterString = meterScanner.nextLine();
    
    int meter = Integer.parseInt(meterString);
    
    System.out.println("Milhas: " + meter / METERS_PER_MILHA);
    System.out.println("Pé: " + meter / METERS_PER_PÉ);
    System.out.println("Polegagas: " + meter / METERS_PER_POLEGADAS);

    meterScanner.close();
  }
}