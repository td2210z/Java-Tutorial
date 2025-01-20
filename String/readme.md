# 🚀 String 



- [🚀 String](#-string)
  - [Tổng quan](#tổng-quan)
  - [Nhập xuất string:](#nhập-xuất-string)
  - [Các hàm thông dụng:](#các-hàm-thông-dụng)
    - [Hàm length():](#hàm-length)
    - [Hàm charAt():](#hàm-charat)
    - [Hàm toUpperCase():](#hàm-touppercase)
    - [Hàm toLowerCase():](#hàm-tolowercase)
    - [Hàm concat():](#hàm-concat)
    - [Hàm compareTo() và compareToIgnoreCase():](#hàm-compareto-và-comparetoignorecase)
    - [Hàm substring():](#hàm-substring)
    - [Hàm contains():](#hàm-contains)
  - [Các kĩ thuật cơ bản](#các-kĩ-thuật-cơ-bản)
    - [Tách các từ trong xâu:](#tách-các-từ-trong-xâu)
    - [Các hàm kiểm tra](#các-hàm-kiểm-tra)
    - [Chuyển xâu thành số và ngược lại:](#chuyển-xâu-thành-số-và-ngược-lại)
    - [Bài toán số lớn:](#bài-toán-số-lớn)
    - [Lop BigInt](#lop-bigint)
    - [Các bài toán liên quan tới tần suất xuất hiện của kí tự trong xâu:](#các-bài-toán-liên-quan-tới-tần-suất-xuất-hiện-của-kí-tự-trong-xâu)
  - [Lớp StringBuilder:](#lớp-stringbuilder)

## Tổng quan

String là lớp để xử lý xâu kí tự trong ngôn ngữ lập trình Java. Các bạn có
thể nghĩ String như một mảng kí tự nhưng có thể mở rộng, thu hẹp và hỗ
trợ rất nhiều hàm xử lý xâu thông dụng.


```java
string name_string;

public class Main {
        public static void main(String[] args) {
        String s = "xin chao";
        System.out.println(s);
        }
}

```


## Nhập xuất string:
Để nhập xâu kí tự ta sử dụng hàm nextLine(), hàm này sẽ đọc tới khi gặp
kí tự xuống dòng.

```java
package thangdinh.love2code.String;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
    }
}
```

+ Khi dùng nextLine(), bản chất cách hoạt động của nextLine() sẽ dừng
nhập tới khi gặp dấu xuống dòng, vì thế hãy đảm bảo trước khi nhập
nextLine(), trong bộ đệm bàn phím không còn thừa dấu enter do các hàm
như nextInt(), nextLong()... để lại từ câu lệnh nhập trước


+ Cách xử lý: Hãy nhớ rằng không phải cứ trước nextLine() là bạn cần xóa bộ
đệm, bao giờ trước nextLine() mà có câu lệnh như nextInt(), nextLong()..
thì mới cần phải xóa bộ đệm. Các bạn xóa đi phím enter trong bộ đệm
bằng câu lệnh nextLine().



```java
Scanner sc = new Scanner("System.in");
int n = sc.nextInt();
sc.nextLine(); // đọc phím enter thừa
String s = sc.nextLine();
System.out.println(s);
```


## Các hàm thông dụng:

+ String trong Java một khi đã khai báo
bạn không thể thay đổi nó, vì thế các
hàm của String đều trả về 1 xâu kí tự mới
sau khi áp dụng các hàm.

### Hàm length():

Trả về số kí tự trong xâu

```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Nguyen Dinh thang";
        System.out.println(s.length());
    }
}
```

### Hàm charAt():

+ String tương tự như mảng, chỉ số bắt đầu từ 0,
hàm charAt(index) trả về kí tự ở chỉ số index


```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang";
        for (int i =0 ;i < s.length();i++){
            System.out.print(s.charAt(i) + " ");
        }
    }
}
```

### Hàm toUpperCase():

+ Trả về xâu ở dạng in hoa, hàm này không thay đổi xâu ban đầu


```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang";


        System.out.println(s.toUpperCase());
    }
}
```


### Hàm toLowerCase():

+ Trả về xâu ở dạng in thường, hàm này không thay đổi xâu ban đầu


```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang";


        System.out.println(s.toLowerCase());
    }
}

```

### Hàm concat():

+ Hàm concat() nối xâu kí tự khác vào cuối xâu hiện tại, bạn
có thể sử dụng toán tử + để làm chức năng tương tự.



```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang";
        String tmp = "@gmail.com";

        String res = s + tmp;
        String res2 = s.concat(tmp);

        System.out.println(res);
        System.out.println("");
        System.out.println(res2);
    }
}
```


### Hàm compareTo() và compareToIgnoreCase():

+ Hàm compareTo() so sánh 2 xâu theo thứ tự từ điển, nếu 2 xâu bằng nhau trả về 0,
trả về số âm nếu xâu hiện tại nhỏ hơn xâu cần so sánh, ngược lại trả về số dương.

+ Hàm compareToIgnoreCase() sẽ bỏ qua in hoa in thường khi so sánh.


```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang";
        String tmp = "dinhthang";

        System.out.println(s.compareToIgnoreCase(tmp));
        System.out.println(s.compareTo(tmp));
    }
}

```


### Hàm substring():

+ Hàm substring() trả về xâu con

```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang";

        String t = "22/10/2003";


        System.out.println(s.substring(0,1));
        System.out.println(t.substring(6));
    }
}

```

### Hàm contains():

+ Kiểm tra sự tồn tại của xâu con 


```java
package thangdinh.love2code.String;

public class Fuction {

    public static void main(String[] args) {
        String s = "Dinhthang dep trai";


        if(s.contains("trai2")) System.out.println("ýe");
        else System.out.println("no");
    }
}

```

## Các kĩ thuật cơ bản 

### Tách các từ trong xâu:


**Sử dụng hàm split và regex**
+ Để tách các từ trong xâu theo dấu cách ta sử dụng hàm
split, hàm này trả về 1 mảng chứa các từ trong xâu.

```java
package thangdinh.love2code.String;

public class Split {
    public static void main(String[] args) {
        String s = "thang dinh nguyen la tao day";
        String[] arr = s.split("\\s+");
        
        for (String x : arr){
            System.out.println(x);
        }
    }
}

```


+ Cách 2: Sử dụng lớp StringTokenizer

```java
package thangdinh.love2code.String;

import java.util.StringTokenizer;

public class Split {
    public static void main(String[] args) {
        String s = "thang dinh nguyen la tao day";

        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
```



### Các hàm kiểm tra 

+ isDigit(char c) Kiểm tra chữ số
+ isLowerCase (char c) Kiểm tra chữ in thường
+ isUpperCase(char c) Kiểm tra in hoa
+ isAlphabetic(char c) Kiểm tra chữ cái
+ char toLower(char c) Chuyển thành chữ in thường
+ char toUpper(char c) Chuyển thành chữ in hoa

```java

package thangdinh.love2code.String;

public class Alpha {
    public static void main(String[] args) {
        String s = "jva 2210thang JACK thien.an.com";
        int digit = 0, lower = 0, upper = 0, special = 0;
        for (char x : s.toCharArray()) {
            if(Character.isDigit(x)) digit++;
            else if(Character.isLowerCase(x)) lower++;
            else if(Character.isUpperCase(x)) upper++;
            else special++;
        }
        System.out.println("digit: " + digit);
        System.out.println("lower: " + lower);
        System.out.println("upper: " + upper);
        System.out.println("special: " + special);
    }
}

```

### Chuyển xâu thành số và ngược lại:

+ Trong Java để chuyển số thành xâu kí tự bạn chỉ cần cộng với 1 xâu
rỗng, còn chuyển từ xâu thành số có thể sử dụng các hàm parse của lớp
Integer, Long...


```java
package thangdinh.love2code.String;

import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2210;
        String s = "" + n;
        System.out.println(s);
        System.out.println(Integer.parseInt(s));
    }
}
```

### Bài toán số lớn:

+ Khi gặp bài toán mà số lượng chữ số của số đầu bài cho lên tới hàng
nghìn chữ số thì các bạn không thể dùng int hay long để lưu. Trong
trường hợp này các bạn lưu như một xâu kí tự

```java
package thangdinh.love2code.String;

public class BigInt {
    public static void main(String[] args) {
        String s = "18238128381283812381123123123123123823812381283";
        int sum =0;
        for (char x : s.toCharArray()) {
            sum += x - '0';
        }
        System.out.println(sum);
    }
}
```


### Lop BigInt

Trong Java bạn có thể xử lý số nguyên lớn bằng lớp BigInteger:


```java

package thangdinh.love2code.String;

import java.math.BigInteger;

public class BigInt {
    public static void main(String[] args) {
        String s1 = "18238128381283812381123123123123";
        String s2 = "192399239192393";

        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        System.out.println(b1.add(b2));
        System.out.println(b1.multiply(b2));
        System.out.println(b1.mod(b2));
        System.out.println(b1.subtract(b2));
        System.out.println(b1.divide(b2));
    }
}

```

### Các bài toán liên quan tới tần suất xuất hiện của kí tự trong xâu:

+ Bài toán: Đếm số lần xuất hiện của các kí tự trong xâu sau đó liệt kê theo
thứ tự từ điển tăng dần
+ Để đếm tần suất xuất hiện của các kí tự xuất hiện trong xâu các bạn có
thể sử dụng mảng để đếm, vì các kí tự thường gặp đều có mã ASCII từ 0
tới 255 nên sử dụng mảng đếm có 256 phần tử là có thể đếm được kí tự
xuất hiện trong xâu.

```java

// dung mang dem
package thangdinh.love2code.String;

public class TS {
    public static void main(String[] args) {
        String s = "ThangDinhthangthang";

        int[] cnt = new int[256];

        for (char x : s.toCharArray()) {
            cnt[x]++;
        }
        for (int i =0; i< 256; i++) {
            if(cnt[i] != 0){
                System.out.println((char) i + " " + cnt[i]);
            }

        }
    }
}
```

```java
// dung mang dem
package thangdinh.love2code.String;
import java.util.Map;
import java.util.TreeMap;


public class TS {
    public static void main(String[] args) {
        String s = "ThangDinhthangthang";

        TreeMap<Character , Integer> v= new TreeMap<>();

        for (char x: s.toCharArray()) {
            if(v.containsKey(x)){
                int count = v.get(x);
                count++;
                v.put(x,count);
            } else{
                v.put(x,1);
            }
        }

        for (Map.Entry<Character , Integer> x: v.entrySet()) {
            System.out.println(x.getKey() + " " + x.getValue());
        }
    }
}
```

##  Lớp StringBuilder:


```java
package thangdinh.love2code.String;


public class Builer {

    public static void main(String[] args) {

        // Create a new StringBuilder with the
        // initial content "GeeksforGeeks"
        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial StringBuilder: " + sb);

        // 1. Append a string to the StringBuilder
        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        // 2. Insert a substring at a specific position
        sb.insert(13, " Java");
        System.out.println("After insert: " + sb);

        // 3. Replace a substring with another string
        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        // 4. Delete a substring from the StringBuilder
        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        // 5. Reverse the content of the StringBuilder
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 6. Get the current capacity of the StringBuilder
        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);

        // 7. Get the length of the StringBuilder
        int length = sb.length();
        System.out.println("Current length: " + length);

        // 8. Access a character at a specific index
        char charAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + charAt5);

        // 9. Set a character at a specific index
        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        // 10. Get a substring from the StringBuilder
        String substring = sb.substring(5, 10);
        System.out.println("Substring (5 to 10): " + substring);

        // 11. Find the index of a specific substring
        sb.reverse(); // Reversing back to original order for search
        int indexOfGeeks = sb.indexOf("Geeks");
        System.out.println("Index of 'Geeks': " + indexOfGeeks);

        // 12. Delete a character at a specific index
        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        // 13. Convert the StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}

```



Method	Description	Example
append(String str)	Appends the specified string to the end of the StringBuilder.	sb.append("Geeks");
insert(int offset, String)	Inserts the specified string at the given position in the StringBuilder.	sb.insert(5, " Geeks");
replace(int start, int end, String)	Replaces characters in a substring with the specified string.	sb.replace(6, 11, "Geeks");
delete(int start, int end)	Removes characters in the specified range.	sb.delete(5, 11);
reverse()	Reverses the sequence of characters in the StringBuilder.	sb.reverse();
capacity()	Returns the current capacity of the StringBuilder.	int cap = sb.capacity();
length()	Returns the number of characters in the StringBuilder.	int len = sb.length();
charAt(int index)	Returns the character at the specified index.	char ch = sb.charAt(4);
setCharAt(int index, char)	Replaces the character at the specified position with a new character.	sb.setCharAt(0, 'G');
substring(int start, int end)	Returns a new String that contains characters from the specified range.	String sub = sb.substring(0, 5);
ensureCapacity(int minimum)	Ensures the capacity of the StringBuilder is at least equal to the specified minimum.	sb.ensureCapacity(50);
deleteCharAt(int index)	Removes the character at the specified position.	sb.deleteCharAt(3);
indexOf(String str)	Returns the index of the first occurrence of the specified string.	int idx = sb.indexOf("Geeks");
lastIndexOf(String str)	Returns the index of the last occurrence of the specified string.	int idx = sb.lastIndexOf("Geeks");
toString()	Converts the StringBuilder object to a String.	String result = sb.toString();