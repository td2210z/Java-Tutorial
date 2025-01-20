# 🚀 Loop , Condition , Fuction


- [🚀 Loop , Condition , Fuction](#-loop--condition--fuction)
  - [Bảng mã ASCII và các câu lệnh kiểm tra liên quan tới kí tự:](#bảng-mã-ascii-và-các-câu-lệnh-kiểm-tra-liên-quan-tới-kí-tự)
  - [Java Conditions and If Statements](#java-conditions-and-if-statements)
  - [If ... else](#if--else)
  - [Switch](#switch)
  - [Java For Loop](#java-for-loop)
  - [Java While](#java-while)
  - [Fuction](#fuction)

## Bảng mã ASCII và các câu lệnh kiểm tra liên quan tới kí tự:
![](https://i0.wp.com/cachhoc.net/wp-content/uploads/2013/08/bang-ma-acsii.png?w=780&ssl=1)


+ Bảng mã này có 256 kí
tự, mỗi kí tự được gán
với một mã nhất định gọi
là mã ASCII.

+ Bạn có thể coi kiểu char như
số hoặc kí tự đều được, tức là
bạn hoàn tòan có thể sử dụng
nó để cộng, trừ, nhân, chia.


+ Hãy luôn nhớ khi cộng,
trừ, nhân, chia một kí tự
nào đó thì mã ASCII của
nó sẽ được sử dụng.


|Dải kí tự | Dải mã ASCII|
|A-Z| 65-90|
|a-z| 97-122|
|0-9|48-57|

> Bảng mã ASCII và các câu lệnh kiểm tra liên quan tới kí tự:

+ dươi đây là một vài câu lệnh
kiểm tra kí tự cần nắm vững.
Về phần này, đều có các hàm có
sẵn để kiểm tra loại kí tự, nhưng
ở thời điểm hiện tại, các bạn hãy
hiểu bản chất của vấn đề trước
khi sử dụng các hàm có sẵn.

+ Chú ý: Hãy luôn nhớ khi cộng, trừ,
nhân, chia một kí tự nào đó thì mã
ASCII của nó sẽ được sử dụng.

```java

//Kiểm tra kí tự in thường
char c;
if ( (c >= ‘a’) && ( c <= ‘z’))

//Kiểm tra kí tự in thường
char c;
if ( (c >= 97) && ( c <= 122))

//Kiểm tra kí tự in hoa

char c;
if ( (c >= ‘A’) && ( c <= ‘Z’))

//Kiểm tra kí tự in hoa

char c;
if ( (c >= 65) && ( c <= 90))

//Kiểm tra kí tự in số

char c;
if ( (c >= ‘0’ ) && ( c <= ‘9’))

//Kiểm tra kí tự là chữ số

char c;
if ( (c >= 48) && ( c <= 57))


//Chuyển kí tự c thành dạng in hoa tương ứng
char c = ‘A’;
c += 32;

Chuyển kí tự c thành dạng in thường tương ứng

char c = ‘a’;
c -=32;
```



## Java Conditions and If Statements


**Java hỗ trợ các điều kiện logic thông thường từ toán học:**


**Toán tử so sánh**
+ Less than: a < b
+ Less than or equal to: a <= b
+ Greater than: a > b
+ Greater than or equal to: a >= b
+ Equal to a == b
+ Not Equal to: a != b


**Toán tử số học**


+ cộng: +
+ trừ: -
+ nhân: *
+ chia: /
+ chia lấy số nguyên: %
+ tăng 1: ++
+ giảm 1: --

**Toán tử Logic**

+ điều kiện và: &&
+ điều kiện hoặc: ||
+ not (lấy giá trị phủ định): !



**Bạn có thể sử dụng các điều kiện này để thực hiện các hành động khác nhau cho các quyết định khác nhau.**



## If ... else
Java có các câu lệnh điều kiện sau:

+ Câu lệnh if được sử dụng trong lập trình trong trường hợp bạn muốn chương trình
của mình thực hiện 1 hoặc 1 nhóm câu lệnh khi một điều kiện nào đó thỏa mãn.
+ Ví dụ: Nếu chỉ số máu của nhân vật bằng 0 thì nhân vật sẽ chết, vậy điều kiện ở đây
là “chỉ số máu của nhân vật bằng 0”, và hành động được thực hiện ở đây là sẽ có
một câu lệnh thực thi làm nhân vật bị chết.

```
if (condition1) {
  // block of code to be executed if condition1 is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}
```


**Cú pháp Short Hand if...else**

```
variable = (condition) ? expressionTrue :  expressionFalse;


int n = 5;

String res = (n > 5) ? "Dung" : "SAI";


```
---
***
___

## Switch

**Thay vì viết nhiều câu lệnh if..else, bạn có thể sử dụng câu lệnh switch.**

+ Tương tự như if và else if thì switch case cũng giúp bạn
kiểm tra nhiều điều kiện khác nhau.
+ Ý nghĩa: Giá trị của val sẽ được so sánh lần lượt với các giá
trị trong các case, nếu giá trị của val bằng giá trị tại 1 case
nào đó thì câu lệnh bên trong case đó được thực thi. Nếu
val không giống bất cư một giá trị trong các case nào thì
câu lệnh bên trong default được thực thi.
+ Chú ý: Giá trị của val có thể là số, kí tự, xâu kí tự (sẽ học
sau). Các khối lệnh bên trong các case sẽ được kết thúc
bằng câu lệnh break.









Câu lệnh switch chọn một trong nhiều khối mã để thực thi:



```
switch(expression) {
  case x:
    // code block
    break;
  case y:
    // code block
    break;
  default:
    // code block
}

```

Nó hoạt động như thế này:
+ Giá trị của biểu thức được so sánh với giá trị của từng trường hợp
+ Nếu có sự trùng khớp, khối mã liên quan sẽ được thực thi.
+ Từ khóa break và default là tùy chọn và sẽ được mô tả sau trong chương này

---
***
___

## Java For Loop

Khi bạn biết chính xác số lần bạn muốn lặp qua một đoạn code, hãy sử dụng vòng lặp for thay vì vòng lặp while:

```java
for( [Câu lệnh khởi tạo] ; [Điều kiện lặp]; [Câu lệnh cập nhật]){

//Câu lệnh bên trong vòng lặp for

}
```

**Vòng lặp for gồm 3 phần chính, các phần phân cách nhau bằng dấu chấm phẩy ;**

+ Câu lệnh khởi tạo thường là khai báo và khởi tạo một biến có nhiệm vụ làm biến đếm cho vòng for (i, j, k).

+ Điều kiện lặp, chừng nào giá trị của điều kiện lặp còn có giá trị true thì vòng for còn lặp.

+ Cập nhật biến đếm, thường phần này sẽ thay đổi giá trị của biến đếm sau khi các câu lệnh ở bên trong vòng lặp for được thực hiện xong.

---
***
___

**SỬ DỤNG FOR**

+ Vòng lặp for được sử dụng nhiều nhất, và thường được sử dụng khi biết trước số vòng lặp cần thực hiện.
+ Vòng for không nhất thiết phải có đủ cả 3 phần nhưng phải luôn có đủ 2 dấu ; để phân cách giữa 3 phần.


**Sơ Đồ Khối**


![](/img/for-e.png)


**Nested Loops (Vòng lặp lồng nhau)**

+ Cũng có thể đặt một vòng lặp bên trong một vòng lặp khác. Đây được gọi là vòng lặp lồng nhau.

+ "Vòng lặp bên trong" sẽ được thực hiện một lần cho mỗi lần lặp của "vòng lặp bên ngoài":

```java
for (int i = 1; i <= 2; i++) {
  System.out.println("Outer: " + i); // Executes 2 times
  
  // Inner loop
  for (int j = 1; j <= 3; j++) {
    System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
  }
}

```

**For-Each Loop**

- vòng lặp "for-each", được sử dụng riêng để lặp qua các phần tử trong một mảng (hoặc các tập dữ liệu khác):

```java
for (type variableName : arrayName) {
  // code block to be executed
}
```


```
String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
for (String i : cars) {
  System.out.println(i);
}
```




**Break và Continue:**

- BREAK
- Khi muốn dừng vòng lặp for với một điều kiện cho trước ta dùng câu lệnh break.
Khi gặp câu lệnh break, vòng for sẽ kết thúc ngay lập tức, thông thường break sẽ
đi kèm với câu lệnh if để kiểm tra điều kiện dừng.


```java
for ( [Câu lệnh khởi tạo] ; [Điều kiện lặp] ; [Câu lệnh cập nhật] ){

//Các câu lệnh trước break
if (condition){

break; // Câu lệnh sẽ được thực thi khi condition true

}
//Nhóm câu lệnh sau break

}
```


- Continue


- Câu lệnh continue sẽ ngắt một lần lặp (trong vòng lặp), nếu một điều kiện được chỉ định xảy ra và tiếp tục với lần lặp tiếp theo trong vòng lặp

```

for (int i = 0; i < 10; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}
```



## Java While
```java
while([Điều kiện lặp]){

//Các câu lệnh của vòng lặp

}
```

+ Khi điều kiện lặp còn đúng thì vòng while còn tiếp tục hoạt động và các câu lệnh bên trong vòng while sẽ tiếp tục được thực hiện.

+ Vòng lặp while được sử dụng khi chưa xác định được số vòng lặp cần thực hiện.

+ Lỗi thường gặp khi sử dụng while : Vòng lặp bị lặp vĩnh viễn.

**SƠ đồ khối**


![](/img/while.png)


**do-while**


```cpp
do{
//code bên trong vòng lặp
}while([Điều kiện lặp]);
```

+ Hoạt động: Tương tự như vòng while nhưng có một chút sự khác biệt đó là Do while luôn thực thi code bên trong vòng lặp 1 lần đầu tiên, sau đó mới kiểm tra điều kiện lặp.

+ Vòng lặp do while được sử dụng khi chưa xác định được số vòng lặp cần thực hiện.
+ Lỗi thường gặp khi sử dụng do while: Thiếu dấu ; đằng sau while.

**Sơ Đồ Khối**

![](/img/do-while.png)

```java
int i = 1;
do{
System.out.println(i);
i++;
}while(i < 5);
```



## Fuction

**Hàm** : 

+ Phần lớn các chương trình máy tính được
xây dựng để giải quyết các bài toán lớn
trong thực tế.

+ Cách tốt nhất để xây dựng và bảo trì một
chương trình đó là xây dựng nó từ những
thành phần nhỏ được xây dựng đơn lẻ.

+ Chức năng Hàm (Function) được sử dụng
để chia nhỏ chương trình thành các thủ
tục nhỏ giải quyết từng chức năng nhỏ.


**Lợi ích khi chia chương trình thành các hàm nhỏ**

+ Code trở nên mạch lạc, dễ đọc
+ Dễ debug khi gặp lỗi
+ Dễ bảo trì khi cần thay đổi một chức năng nhỏ
+ Có khả năng tái sử dụng lại code

**Cú pháp (Syntax):**


```java
public static returnType functionName (parameter1, parameter2,...) {
// function body
}
```

Trong đó:
+ returnType: Kiểu trả về của hàm ví dụ : void, bool, int, long long...
+ functionName: Tên hàm
+ parameter: Tham số của hàm
+ function body: Các câu lệnh bên trong của hàm

> Ví Dụ

```c++
public static void xinChao(){

      System.out.println("Hello !");

}
```

> Gọi hàm (Function call):


```java
public class Main {
public static void xinChao(){
System.out.println("Hello !");
}

public static void main(String[] args) {
System.out.println("Truoc khi goi ham");
xinChao(); //Function call
System.out.println("Sau khi goi ham");
}
}
```

> Tham số và giá trị trả về (Parameter & return type):

1. Tham số và đối số
+ Tham số là những giá trị được truyền cho hàm khi hàm được gọi.

> ví dụ

```java
public class Main {
    public static void printNumber(int a){
    System.out.println(a);
    }
      public static void main(String[] args){
      int n = 10;
      printNumber(n);
      }
}
```

Giải thích:
+ Khi bạn gọi hàm printNumber(n) thì n
được gọi là Đối số hay tham số thực
sự, còn a trong tham số hình thức.
+ Giá trị của n sẽ được gán cho a, vì thế a
cũng sẽ có giá trị là 10, và khi câu lệnh
bên trong hàm printNumber thực hiện
màn hình sẽ hiển thị giá trị 10.


> Tham số và giá trị trả về (Parameter & return type):

Kiểu trả về:

Khi chuẩn bị xây dựng một hàm, các bạn cần xác định kiểu trả về :
+ Nếu hàm không cần trả về giá trị gì, kiểu trả về sẽ là void.
+ Nếu hàm cần trả về giá trị đúng hoặc sai, kiểu trả về là boolean.
+ Nếu hàm cần trả về số nguyên thì kiểu trả về là int hoặc long tùy vào độ lớn.
+ Nếu hàm cần trả về số thực thì kiểu trả về là float hoặc double tùy vào độ chính xác mong muốn.

> Những chú ý khi xây dựng hàm:
1. Hàm này có cần trả về giá trị không,
nếu có thì trả về kiểu dữ liệu là gì ?
2. Hàm này có bao nhiêu tham số,
các tham số có kiểu dữ liệu là gì ?
3. Hàm của bạn xây dựng đã đủ tổng quát chưa hay
quá chi tiết và chỉ phù hợp cho 1 bài toán cụ thể
4. Bạn gọi hàm có đúng thứ tự tham số mà mình mong
muốn hay không, kiểu dữ liệu của tham số hình thức
và tham số chính thức có hợp lí hay không?


> Nạp chồng hàm (Function Overloading):

+ Nạp chồng hàm là một tính năng của
Java khi mà một hàm có cùng tên nhưng
khác nhau về tham số, kiểu trả về. Khi
hàm được gọi thì tùy vào kiểu dữ liệu của
tham số, hàm phù hợp sẽ được gọi.


``` java
public class Main {
public static int findMax(int a, int b) {
    if (a > b) {
    return a;
    } else {
    return b;
}
}
public static float findMax(float a, float b) {
      if (a > b) {
      return a;
      } else {
      return b;
      }
}
public static void main(String[] args) {
    System.out.println(findMax(10, 20));
    System.out.println(findMax(10.2f, 30.4f));
}
}
```



1 Số hàm trong java :  [Tài liệu](https://github.com/lucthienphong1120)