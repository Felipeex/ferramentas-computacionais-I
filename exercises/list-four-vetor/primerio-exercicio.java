
import java.util.Arrays;

class PrimeiroExercicio {
  static int[] decomporNumero(long numero) {
    int tamanhoNumero = Long.toString(numero).length();
    int numeroEmVetor[] = new int[tamanhoNumero];

    while(numero > 0) {
      numeroEmVetor[--tamanhoNumero] = (int) numero % 10;
      numero /= 10;
    }

    return numeroEmVetor;
  }
  
  public static void main(String[] args) {
    System.out.println(Arrays.toString(decomporNumero(1300)));
  }
}