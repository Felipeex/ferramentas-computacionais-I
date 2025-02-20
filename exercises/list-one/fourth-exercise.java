
import java.util.Scanner;

class FourthExercise {
  public static void main(String[] args) {
    Scanner secondsScanner = new Scanner(System.in);
    System.out.printf("Segundos: ");
  
    String secondsString = secondsScanner.nextLine();
    
    int seconds = Integer.parseInt(secondsString);
    int minutes = 0;
    int hours = 0;

    if (seconds >= 60) {
      minutes = seconds / 60;
      seconds %= 60;

      if (minutes >= 60) {
        hours = minutes / 60;
        minutes %= 60;
      }
    }

    System.out.println("Hora: " + hours);
    System.out.println("Minutos: " + minutes);
    System.out.println("Segundos: " + seconds);

    secondsScanner.close();
  }
}