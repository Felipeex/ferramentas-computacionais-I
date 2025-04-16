class SegundoExercicio {
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
  
  public static void main(String[] args) {
    exibeMatrizQuadrada(gerarMatrizQuadrada(10));
  }
}