# 🚀 Array


- [🚀 Array](#-array)
  - [Tổng quan](#tổng-quan)
    - [Định nghĩa và tính chất của mảng 1 chiều:](#định-nghĩa-và-tính-chất-của-mảng-1-chiều)
    - [Khai báo mảng:](#khai-báo-mảng)
    - [Truy cập phần tử và duyệt mảng:](#truy-cập-phần-tử-và-duyệt-mảng)
    - [Mảng làm tham số của hàm:](#mảng-làm-tham-số-của-hàm)
    - [Ưu và nhược điểm của mảng:](#ưu-và-nhược-điểm-của-mảng)
    - [Cách sắp xếp mảng](#cách-sắp-xếp-mảng)
    - [Một số bài toán cơ bản liên quan đến mảng 1 chiều](#một-số-bài-toán-cơ-bản-liên-quan-đến-mảng-1-chiều)
  - [Mảng 2 chiều](#mảng-2-chiều)
    - [Khai báo mảng 2 chiều:](#khai-báo-mảng-2-chiều)
    - [Nhập và duyệt mảng 2 chiều:](#nhập-và-duyệt-mảng-2-chiều)
    - [Các bài toán cơ bản trên mảng 2 chiều:](#các-bài-toán-cơ-bản-trên-mảng-2-chiều)
    - [Sắp xếp mảng hai chiều theo hàng:](#sắp-xếp-mảng-hai-chiều-theo-hàng)




## Tổng quan

### Định nghĩa và tính chất của mảng 1 chiều:

+ Là một cấu trúc dữ liệu gồm nhiều phần
tử có cùng kiểu dữ liệu, được lưu trữ ở các
ô nhớ liên tiếp nhau trong bộ nhớ.

+ Được sử dụng khi bạn cần lưu trữ một số
lượng lớn các phần tử có cùng kiểu dữ liệu.

+ Mảng 1 chiều đơn giản, dễ hiểu và được sử
dụng rất nhiều trong mọi ngôn ngữ lập trình.



### Khai báo mảng:

```java
Data_type[] array_name = new Data_type [Number_of_element];



int[ ] a = new int[100]; // Mảng số nguyên int a có 100 phần tử
float[ ] b = new float[1000]; //Mảng số thực float b có 1000 phần tử
double[ ] diem = new double[10]; //Mảng số thực double diem có 10 phần tử
char[ ] ten = new char[50]; //Mảng kí tự char ten có 50 phần tử
```

+ Khai báo mảng a có 3 phần tử là số nguyên, các giá trị của a sẽ là giá trị
mặc định là 0.
```java
int[] a = new int[3];
```

+ Khai báo mảng a có 3 phần tử là số nguyên, gán lần lượt các phần tử trong
mảng a là 1, 2, 3:

```java
int[] a = {1 , 2 ,3 };
```


### Truy cập phần tử và duyệt mảng:

Các phần tử trong mảng được truy cập thông qua chỉ số, chỉ số của mảng
được đánh từ 0 và kết thúc bởi n - 1 với n là số lượng phần tử của mảng.

```java
array_name[index];
```


ví dụ:

int[6] a = {3, 8, 9, 1, 7, 4};

Array 3 8 9 1 7 4
Index 0 1 2 3 4 5


***Duyệt mảng thông qua chỉ số***

```java
public class Main {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
        a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
        System.out.print(a[i] + " ");
        }
}
}
```


### Mảng làm tham số của hàm:

+ Khi mảng làm tham số của hàm, những
thay đổi trong hàm sẽ làm thay đổi tới
mảng mảng được truyền vào.

+ Chú ý: Khi xây dựng hàm có tham số
là mảng, cần phải kèm theo 1 tham số
nữa là số lượng phần tử trong mảng


Ví Dụ:


Gấp đôi mọi phần tử trong mảng

```java

public class Main {
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
}
}
```


### Ưu và nhược điểm của mảng:


***Ưu***

• Đơn giản, dễ hiểu và dễ sử dụng
• Truy cập vào phần tử trong mảng
nhanh chóng thông qua chỉ số.
• Dễ dàng khai báo một loạt các
phần tử cùng kiểu dữ liệu.
• Dễ dàng duyệt mọi phần tử trong
mảng bằng một vòng lặp duy nhất.


***Nhược***
• Kích thước của mảng là cố định,
bạn không thể mở rộng cũng như
thu hẹp mảng một khi nó đã
được khai báo.
• Việc chèn và xóa phần tử trong
mảng là khó khăn.


### Cách sắp xếp mảng 

1. Sử dụng Arrays.sort()
Java cung cấp một phương thức tĩnh Arrays.sort() từ lớp Arrays để sắp xếp mảng. Đây là cách đơn giản và nhanh chóng nhất để sắp xếp mảng trong Java.


+ Tăng dần
```java
import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 6};
        
        // Sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr)); // [1, 2, 5, 5, 6, 9]
    }
}

```

+ Giảm dần 
```java
public class Main {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
        a[i] = sc.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        for(int x : a){
        System.out.print(x + " ");
        }
}
}
```




### Một số bài toán cơ bản liên quan đến mảng 1 chiều

Link:  []()



## Mảng 2 chiều 


+ Mảng hai chiều:
Mảng 2 chiều được sử dụng trong các bài
toán liên quan tới ma trận, bảng số,... Các bạn
có thể coi mảng 2 chiều chính là các mảng
một chiều được xếp chồng lên nhau.

### Khai báo mảng 2 chiều:


+ Khi khai báo mảng 1 chiều, các bạn cần chỉ ra số hàng, số cột của ma trận.
+ Khai báo mảng 2 chiều
có 3 hàng và 3 cột


```java
int[][] a = {

{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

int[][] b = new int[3][3];
```

+ Để truy cập vào phần tử trong mảng, các bạn dùng chỉ số hàng và chỉ
số cột. Chỉ số hàng và cột của mảng 2 chiều được đánh số từ 0 tương
tự như mảng 1 chiều.

```java
System.out.println(a[0][0]); // phần tưr đầu tiên 

```


### Nhập và duyệt mảng 2 chiều:

+ Để nhập mảng 2 chiều từ bàn phím ta duyệt qua từng hàng, mỗi hàng
duyệt qua từng cột.


```java
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); //row
    int m = sc.nextInt(); //col
    int[][] a = new int[n][m];
    for(int i = 0; i < n; i++)
    for(int j = 0; j < m; j++)
    a[i][j] = sc.nextInt();
    for(int i = 0; i < n; i++)
    for(int j = 0; j < m; j++)
    System.out.print(a[i][j] + " ");

}

```

### Các bài toán cơ bản trên mảng 2 chiều:

1. Tính tổng, hiệu hai ma trận:

+ Trong đại số tuyến tính, ma trận tương tự như một mảng 2 chiều gồm n hàng
và m cột. Để 2 ma trận có thể cộng hoặc trừ cho nhau thì chúng phải có cùng
số hàng và số cột.


```java
package thangdinh.love2code.Array;

import java.util.Scanner;

public class ArrayTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); //row
        int m = sc.nextInt(); //col
        int[][] a = new int[n][m];
        int[][] b = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                a[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                b[i][j] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println("");
        }
    }
}

```

2. Nhân hai ma trận:
+ Giả sử có 2 ma trận a cỡ nxm, ma trận b cỡ pxq, để ma trận a có thể
nhân với ma trận b thì số cột của ma trận a, tức là m phải bằng số hàng
của ma trận b, tức là p.

a[n][m] x b[p][q] = c[n][q]

+ Khi đó m = p thì ma trận tích của a với b sẽ là ma trận c có cỡ nxq. Phần
tử ở chỉ số (i, j) của ma trận tích c được tính bằng cách nhân từng cặp
phần tử ở hàng i của ma trận a với các phần tử ở cột j của ma trận b.


```java

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

```


### Sắp xếp mảng hai chiều theo hàng:

+ Giả sử bạn gặp 1 bài toán muốn lưu các cặp số, ví
dụ tọa độ một điểm trong hệ Oxy, khi đó mảng 2
chiều là một lựa chọn hoàn hảo trong Java.
+ Tuy nhiên đôi khi ta cần sắp xếp các tọa độ này -
cũng chính là các hàng của mảng 2 chiều này theo
phần tử thứ nhất hay thứ 2, hoặc cả 2.



```java
import java.util.Arrays;

public class Sort2DArrayRows {
    public static void main(String[] args) {
        int[][] array = {
            {4, 2, 7},
            {9, 5, 1},
            {6, 3, 8}
        };

        // Sắp xếp từng hàng của mảng
        for (int[] row : array) {
            Arrays.sort(row);
        }

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp từng hàng:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
```


```java
import java.util.Arrays;

public class SortEntire2DArray {
    public static void main(String[] args) {
        int[][] array = {
            {4, 2, 7},
            {9, 5, 1},
            {6, 3, 8}
        };

        // Chuyển mảng 2 chiều thành mảng 1 chiều
        int rows = array.length;
        int cols = array[0].length;
        int[] flatArray = new int[rows * cols];
        
        int index = 0;
        for (int[] row : array) {
            for (int element : row) {
                flatArray[index++] = element;
            }
        }

        // Sắp xếp mảng 1 chiều
        Arrays.sort(flatArray);

        // Chuyển ngược lại thành mảng 2 chiều
        index = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = flatArray[index++];
            }
        }

        // In mảng sau khi sắp xếp
        System.out.println("Mảng sau khi sắp xếp toàn bộ phần tử:");
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }
}
```