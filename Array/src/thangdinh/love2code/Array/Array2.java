package thangdinh.love2code.Array;

import java.util.Scanner;

public class Array2 {


    public static int tong(int a[], int n){
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += a[i];
        }
        return sum;
    }


    public static void nhanDoi(int a[], int n){
        for(int i = 0; i < n; i++){
            a[i] *= 2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1, 2, 3, 4};
        nhanDoi(a, 4);
        for(int x : a){
            System.out.print(x + " ");
        }

        System.out.println("");
        System.out.println(tong(a, 4));
    }
}
