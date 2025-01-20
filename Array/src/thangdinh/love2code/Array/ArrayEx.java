package thangdinh.love2code.Array;

import java.util.Scanner;

public class ArrayEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //row
        int m = sc.nextInt(); //col
        int p = sc.nextInt();
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for(int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for(int i = 0; i < m; i++)
            for(int j = 0; j < p; j++)
                b[i][j] = sc.nextInt();
        int[][] c = new int[n][p];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < p; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }
}
