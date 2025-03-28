
import java.util.Scanner;

class FirstExercise {
  public static void main() {

    try {
      Scanner temperatureScanner = new Scanner(System.in);

      System.out.println("Forneça uma temperatura em Celsius");
      double temperature = temperatureScanner.nextDouble();

      temperatureScanner.close();

      System.err.println(temperature);
    } catch (Error err) {
      main();
    }
  }
}