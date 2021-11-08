class Warshall {
    public static void procesoWarshall(int a[][]) {
        int n = a.length;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (a[i][j] != 1) {
                        a[i][j] = a[i][k] & a[k][j];
                    }
                }
            }
        }
    }


    public static void MostrarMatrizClausura(int[][] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" " + a[i][j]);
            }
            System.out.println(" ");
        }
    }
}

public class Algoritmo_Warshall {
    public static void main(String[] args) {
        int x[][];
        int n;
        x = new int[4][4];
        n = x.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j]=0;

            }
        }
        x[0][1] = 1;
        x[1][0] = 1;
        x[1][2] = 1;
        x[2][3] = 1;

        Warshall.procesoWarshall(x);
        Warshall.MostrarMatrizClausura(x);
    }
}