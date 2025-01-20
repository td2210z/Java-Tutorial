package thangdinh.love2code.Array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*int[] a= {1 ,7,4, 3, 2 ,5};

        Arrays.sort(a);
        System.out.println(Arrays.toString(a));*/


        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
