package thangdinh.love2code.Array;

public class Array {
    public static void main(String[] args) {
        int[] a = { 1 ,2 ,3 ,4 , 5, 6,7};

        System.out.println(a[0]); // truy cap phan tu cua mang


        // duyet mang

        for (int i =0 ;i < a.length;i++){
            System.out.println(a[i]);
        }


        System.out.println("");
        // duyet bang for-each

        for (int x : a){
            System.out.println(x);
        }
    }
}
