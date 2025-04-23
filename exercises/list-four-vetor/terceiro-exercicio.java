
import java.util.Scanner;

class TerceiroExercicio {
  static int[][] gerarMatriz(int linha, int coluna) {
    int matriz[][] = new int[linha][coluna];

    return matriz;
  }

  static int[][] preencherMatrizAleatorios(int matriz[][]) {
    for(int linha = 0; linha < matriz.length; linha++)
      for(int coluna = 0; coluna < matriz.length; coluna++)
        matriz[linha][coluna] = (int) (Math.random() * 100);

    return matriz;
  }

  static void exibirValoresImparesEpares(int matriz[][]) {
    for(int linha = 0; linha < matriz.length; linha++) {
      int somaPares = 0; int somaImpares = 0;

      for(int coluna = 0; coluna < matriz[0].length; coluna++)
        if ((matriz[linha][coluna] % 2) == 1)
          somaImpares++;
        else
          somaPares++;

      System.out.printf("Linha %d: %.2f%% de pares e %.2f%% de impares\n", 
                        linha + 1, (float) somaPares / matriz.length * 100, (float) somaImpares / matriz.length * 100);
    }
  } 

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite a quantidade de linha da matriz: ");
    int linha = scanner.nextInt();
    
    System.out.println("Digite a quantidade de coluna da matriz: ");
    int coluna = scanner.nextInt();
    scanner.close();

    int matriz[][] = preencherMatrizAleatorios(gerarMatriz(linha, coluna));
    exibirValoresImparesEpares(matriz);
  }
}