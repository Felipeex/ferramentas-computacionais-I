import java.util.Arrays;

class SegundoExercicio {
 static int[][] fakeQM(int n) {
    int matriz[][] = new int[n][n];

    for(int linha = 0; linha < n; linha++)
      for(int coluna = 0; coluna < n; coluna++)
        matriz[linha][coluna] = 1;

    return matriz;
  }

  static int[][] gerarMatrizQuadrada(int n) {
    int matriz[][] = new int[n][n];

    for(int linha = 0; linha < n; linha++)
      for(int coluna = 0; coluna < n; coluna++)
        matriz[linha][coluna] = (int) (Math.random() * Math.pow(n, 2));

    return matriz;
  }

  static void exibeMatrizQuadrada(int matriz[][]) {
    for(int linha = 0; linha < matriz.length; linha++)
      for(int coluna = 0; coluna < matriz.length; coluna++)
        System.out.println(matriz[linha][coluna]);
  }

  static void verificaQM(int matriz[][]) {
    int somaElementosLinha[] = new int[matriz.length], somaElementosColuna[] = new int[matriz.length];

    for(int linha = 0; linha < matriz.length; linha++) {
      for(int coluna = 0; coluna < matriz.length; coluna++) {
        somaElementosLinha[linha] += matriz[linha][coluna];
      }
    }

    for(int coluna = 0; coluna < matriz.length; coluna++) {
      for(int linha = 0; linha < matriz.length; linha++) {
        somaElementosColuna[coluna] += matriz[linha][coluna];
      }
    }

    System.out.println(Arrays.toString(somaElementosLinha));
    System.out.println(Arrays.toString(somaElementosColuna));
  }
  
  public static void main(String[] args) {
    // exibeMatrizQuadrada(gerarMatrizQuadrada(10));
    verificaQM(gerarMatrizQuadrada(10));
    // System.out.println(Arrays.deepToString(gerarMatrizQuadrada(10)));
  }
}