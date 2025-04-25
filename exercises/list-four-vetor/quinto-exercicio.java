import java.util.Arrays;
import java.util.Scanner;

class QuintoExercicio {
  static int[] gerarAposta(int quantidadeDeNumeros) {
    int[] numerosSorteio = new int[quantidadeDeNumeros];

    for(int i = 0; i < quantidadeDeNumeros;) {
      int numeroSorteado = (int) (Math.random() * 60);
      if (!verificaNumeroRepetido(numerosSorteio, numeroSorteado)) {
        numerosSorteio[i] = numeroSorteado;
        i++;
      }
    }

    return numerosSorteio;
  }

  static int[] gerarMegaSena() {
    int megaSena[] = new int[6];

    for(int i = 0; i < megaSena.length; i++) {
      int primeiroDigito = (int) (Math.random() * 5);
      int segundoDigito = (int) (Math.random() * 9);
      int numeroSorteado = Integer.valueOf(String.valueOf(primeiroDigito) + String.valueOf(segundoDigito));

      megaSena[i] = numeroSorteado;
    }

    return megaSena;
  }

  static boolean verificaNumeroRepetido(int vetor[], int numero) {
    for(int i = 0; i < vetor.length; i++) {
      if (vetor[i] == numero) return true;
    }

    return false;
  }

  static int verificaAposta(int aposta[], int megaSena[]) {
    int somaAcertos = 0;

    for(int i = 0; i < aposta.length; i++) {
      for(int j = 0; j < megaSena.length; j++) {
        if (aposta[i] == megaSena[j])
          somaAcertos++;
      }
    }

    return somaAcertos;
  }

  static void mostraMegaSena(int megaSena[]) {
    System.out.println("Mega Sena: " + Arrays.toString(megaSena));
  }

  static void mostraApostas(int apostas[][]) {
    System.out.println("Apostas: " + Arrays.deepToString(apostas));
  }

  public static void main(String args[]) {
    final String NORMAL = "\033[0m";
    final String AMARELO = "\033[0;33m";

    int quantidadeDeJogos, quantidadeDeNumeros = 6;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Forneça a quantidade de jogo que você deseja jogar: ");
    quantidadeDeJogos = scanner.nextInt();

    do {
      if (quantidadeDeNumeros < 6 || quantidadeDeNumeros > 15) {
        System.out.println(AMARELO + "\n[Aviso] A quantida de números pode ir de 6 á 15." + NORMAL);
      }

      System.out.println("Forneça a quantidade de números dos jogos: ");
      quantidadeDeNumeros = scanner.nextInt();
    } while (quantidadeDeNumeros < 6 || quantidadeDeNumeros > 15);

    int apostas[][] = new int[quantidadeDeJogos][quantidadeDeNumeros];
    
    for(int i = 0; i < quantidadeDeJogos; i++) {
      apostas[i] = gerarAposta(quantidadeDeNumeros);
    }

    int numerosSorteadoMegaSena[] = gerarMegaSena();

    mostraMegaSena(numerosSorteadoMegaSena);
    mostraApostas(apostas);

    for(int i = 0; i < quantidadeDeJogos; i++) {
      System.out.printf("No jogo %d você acertou %d\n", i + 1, verificaAposta(apostas[i], numerosSorteadoMegaSena));
    }
  }
}