import java.util.Scanner;

public class ExercicoMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matriz = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = sc.nextInt();
            }
        }

        int r = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matriz[i][j] == r) {
                    System.out.printf("Posição %d,%d:\n", i, j);
                    if (j - 1 < matriz[i].length && j - 1 >= 0) {
                        System.out.printf("Esquerda: %d\n", matriz[i][j - 1]);
                    }
                    if (j + 1 < matriz[i].length) {
                        System.out.printf("Direita: %d\n", matriz[i][j + 1]);
                    }
                    if (i + 1 < matriz.length) {
                        System.out.printf("Baixo: %d\n", matriz[i + 1][j]);
                    }
                    if (i - 1 >= 0) {
                        System.out.printf("Cima: %d\n", matriz[i - 1][j]);
                    }
                }
            }
        }

        sc.close();
    }

}

