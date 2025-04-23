
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

  static boolean verificaQM(int matriz[][]) {
    int somaElementosLinha[] = new int[matriz.length], somaElementosColuna[] = new int[matriz.length];
    int somaPrimeiraDiagonal = 0, somaSegundaDiagonal = 0;

    // somaElementosLinha
    for(int linha = 0; linha < matriz.length; linha++) {
      for(int coluna = 0; coluna < matriz.length; coluna++) {
        somaElementosLinha[linha] += matriz[linha][coluna];
      }
    }
    
    // somaElementosColuna
    for(int coluna = 0; coluna < matriz.length; coluna++) {
      for(int linha = 0; linha < matriz.length; linha++) {
        somaElementosColuna[coluna] += matriz[linha][coluna];
      }
    }

    // somaPrimeiraDiagonal
    for(int linha = matriz.length - 1, coluna = 0; linha >= 0 && coluna <= matriz.length; linha--, coluna++) {
      somaPrimeiraDiagonal += matriz[linha][coluna];
    }

    // somaSegundaDiagonal
    for (int linha = 0, coluna = 0; linha < matriz.length; linha++, coluna++) {
      somaSegundaDiagonal += matriz[linha][coluna];
    }

    // verifica somaElementosLinha
    for(int i = 0; i < somaElementosLinha.length; i++) {
      if (somaElementosLinha[0] != somaElementosLinha[i]) return false;
    }

    // verifica somaElementosColuna
    for(int i = 0; i < somaElementosColuna.length; i++) {
      if (somaElementosColuna[0] != somaElementosColuna[i]) return false;
    }

    // verifica diagonal
    if (somaPrimeiraDiagonal != somaSegundaDiagonal) {
      return false;
    }

    return true;
  }

  static void gerarAteAchar() {
    boolean isQM;
    int matriz[][];

    do {
      matriz = gerarMatrizQuadrada(3);

      isQM = verificaQM(matriz);
      System.out.println(Arrays.deepToString(matriz));
    } while(!isQM);
  } 
  
  public static void main(String[] args) {
    int matriz[][] = gerarMatrizQuadrada(3);

    exibeMatrizQuadrada(matriz);
    System.out.println("É um quadro mágico? " + (verificaQM(matriz) ? "Sim" : "Não"));
  }
}