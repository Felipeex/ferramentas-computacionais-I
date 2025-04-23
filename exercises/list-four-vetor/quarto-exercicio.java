
import java.util.Arrays;

class QuartoExercicio {
  static int[][] gerarMatriz(int m, int x) {
    int matriz[][] = new int[m][x];

    for(int linha = 0; linha < m; linha++)
      for(int coluna = 0; coluna < x; coluna++)
        matriz[linha][coluna] = (int) (Math.random() * 100);
    
    return matriz;
  }

  static int[] separarParesEimpares(int matriz[][]) {
    int quantidadeDeNumeros = matriz.length * matriz[0].length;
    int vetorSeparador[] = new int[quantidadeDeNumeros];
    int vetorTL = 0;

    for(int i = 0; i < 2; i++) {
      for(int linha = 0; linha < matriz.length; linha++)
        for(int coluna = 0; coluna < matriz[0].length; coluna++)
          if (matriz[linha][coluna] % 2 == i)
            vetorSeparador[vetorTL++] = matriz[linha][coluna];     
    }
    
    return vetorSeparador;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(separarParesEimpares(gerarMatriz(5, 5))));
  }
}