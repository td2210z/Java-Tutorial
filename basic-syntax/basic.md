
# 🚀 Tổng Quan




- [🚀 Tổng Quan](#-tổng-quan)
  - [Thành phần ngôn ngữ (Java Language)](#thành-phần-ngôn-ngữ-java-language)
- [BIẾN](#biến)
- [Chú thích trong Java:](#chú-thích-trong-java)
- [TOÁN TỬ (OPERATORS)](#toán-tử-operators)
  - [Bitwise (\&, |, ^, ~)](#bitwise----)
- [Các hàm xuất ra màn hình](#các-hàm-xuất-ra-màn-hình)
  - [1. In ra màn hình console](#1-in-ra-màn-hình-console)
  - [2. Nhập từ bàn phím](#2-nhập-từ-bàn-phím)
  - [3. Biến và toán tử](#3-biến-và-toán-tử)
- [Java Type Casting (Conversion)](#java-type-casting-conversion)


**XUẤT XỨ TÊN GỌI JAVA**
- Tên hòn đảo trồng nhiều café ở Indonesia


**NGÔN NGỮ LẬP TRÌNH JAVA**

- Là tên gọi của một ngôn ngữ lập trình hướng đối
tượng được công bố vào năm 1995. Tên gọi lấy cảm
hứng từ loại café (đến từ hòn đảo mà ai cũng biết)
nhóm phát triển ra ngôn ngữ này nghiện uống.

**ĐẶC ĐIỂM NỔI BẬT**

- Ngôn ngữ mức cao/high-level language có các đặc
điểm nổi bật (characteristics):
Simple
- Object oriented
- Distributed
- Multithreaded
- Dynamic linking
- Architecture neutral
- Portable
- High performance
- Robust
- Secure


**PLATFORM LÀ GÌ?**

- Tên gọi chung của một tổ hợp được tạo nên bởi phần
cứng, phần mềm, hệ điều hành mà một chương trình
máy tính chạy trên nó. Nó cung cấp một nền tảng, môi
trường/không gian để app có thể chạy.

**Các bước viết và chạy app Java**
- Lập trình/viết app, tạo ra mã nguồn của app
(source code), là các tập tin .java
- Dịch (compile) bởi tool javac (trong bộ JDK)
ra mã byte-code, là các tập tin .class
(không được xem là file nhị phân hoàn chỉnh
kiểu .exe bên Windows)
- Máy ảo Java hiểu mã byte-code và chuyển
dịch thành lệnh tương ứng với hệ điều hành
mà app đang chạy


**Platform-independence**
- Độc lập môi trường vận hành nghĩa là ngôn ngữ Java
được thiết kế để app viết bằng ngôn ngữ này – file
.java; và sau đó nó dịch thành file file .class, có thể
chạy không phụ thuộc vào hệ điều hành (OS) và phần
cứng ứng với hệ điều hành đó bởi nó đã được “che”
bởi Java Virtual Machine (JVM – máy ảo Java). Vậy
khi chạy app Java ta chỉ cần máy ảo tương ứng với
OS mà app Java sẽ chạy trên đó
- Hiện có máy ảo cho MacOS, Linux, Windows…Khi đó
lập trình viên chỉ quan tâm viết code bằng ngôn ngữ
Java và dịch code ra mã byte-code, phần thực thi với
OS nào do máy ảo “đảm nhiệm”, do đó lập trinh viên
không cần viết nhiều phiên bản app tương ứng với các
OS khác nhau, khái niệm này gọi là “write once, run
anywhere”

**JRE**
- Để app Java chạy được trên máy bạn, ta cần cài đặt
các “đồ chơi” cần thiết bao gồm máy ảo Java – JVM và
phụ kiện (thư viện, library, dependency). Đám “đồ
chơi” này gọi là môi trường thực thi Java – Java
Runtime Environment.

**JDK**
- Để viết code và chạy thử nghiệm app Java, lập trình
viên cần nhiều đồ chơi hơn nữa, dĩ nhiên phải bao
gồm luôn JRE, bộ đồ “khủng” này được gọi là JDK
(Java Development Kit – bộ công cụ phát triển phần
mềm Java). Do đó JDK = JRE + …+…

- Chốt hạ: Muốn chạy app Java cần tối thiểu JRE.
Muốn viết app Java bắt buộc cần JDK.


## Thành phần ngôn ngữ (Java Language)

**KIỂU DỮ LIỆU (DATA TYPES)**

- Java cung cấp hai cách thức “lớn” để lưu trữ dữ liệu –
2 kiểu dữ liệu: nguyên thuỷ (primitive data types) và
tham chiếu (reference data types, object data types)

**Primitive Data Types**

- Kiểu dữ liệu nguyên thuỷ dùng một lượng nhỏ bộ nhớ
để biểu diễn một giá trị đơn, không thể chia nhỏ. Kiểu
dữ liệu này được đặt tên bằng cụm chữ thường. Có 8
loại dữ liệu nguyên thuỷ: byte (1 byte), short (2
byte), int (4 byte), long (8 byte), float (4 byte), double (8
byte), char (2 byte hỗ trợ Unicode), boolean (true/false,
không chỉ định rõ kích thước, hoặc 1 bit).

|  Types  |       Description       | Default |  Size  |              Example Literlas               | Range of values |
| :-----: | :---------------------: | :-----: | :----: | :-----------------------------------------: | :-------------: |
| boolean |      true or false      |  false  |  8bit  |                true , false                 |  true , false   |
|  byte   | twos-complement integer |    0    |  8bit  |                   (none)                    |   -128 to 127   |
|  char   |    Unicode character    | \u0000  | 16 bit | ‘a’, ‘\u0041’, ‘\101’, ‘\\’, ‘\’, ‘\n’, ‘β’ |    0 to 225     |
|  short  | twos-complement integer |    0    | 16 bit |                   (none)                    | -32,768to32,767 |
|   int   | twos-complement intger  |    0    | 32 bit |                 -2,-1,0,1,2                 | -2,147,483,648  |
|  long   | twos-complement integer |    0    | 64bit  |              -2L,-1L,0L,1L,2L               |  -10^9 -> 10^9  |
|  float  | IEEE 754 floating point |   0.0   | 32bit  |    1.23e100f , -1.23e-100f , .3f ,3.14F     |   up to 7  tp   |
| double  | IEEE 754 floating point |   0.0   | 64bit  |     1.23456e300d , -123456e-300d , 1e1d     |   up to 16 tp   |


**Quy tắc đặt tên biến**

- Sử dụng ký tự alphabet (a-zA-Z), dấu $ hoặc dấu gạch dưới(_)
- Tên biến có phân biệt HOA/thường
- không đặt tên bắt đầu bởi số, và không dùng các từ khóa được sử dụng để xây dựng
ngôn ngữ java, ví dụ:
new, class, const...
ví dụ:
Tên biến nào sau đây không hợp lệ:

```
abc
1abc
ab_c
_abc
$abc
ab-c
_123
$123
if
$if
```


**1.boolean**
- Kiểu dữ liệu boolean biểu diễn một giá trị logic có thể là đúng hoặc sai. Về mặt khái niệm, nó biểu diễn một bit thông tin duy nhất, nhưng kích thước thực tế mà máy ảo sử dụng phụ thuộc vào việc triển khai và thường là ít nhất một byte (tám bit) trong thực tế. Các giá trị của kiểu boolean không được chuyển đổi ngầm định hoặc rõ ràng sang bất kỳ kiểu nào khác bằng cách sử dụng ép kiểu. Tuy nhiên, các lập trình viên có thể viết mã chuyển đổi nếu cần.

```
boolean booleanVar;
```

**2. byte Data Type**
- Kiểu dữ liệu byte là số nguyên bù hai có dấu 8 bit.
- Kiểu dữ liệu byte hữu ích để tiết kiệm bộ nhớ trong các mảng lớn.
```
byte byteVar;
```

**3. short Data Type**
- Kiểu dữ liệu short là số nguyên bù hai có dấu 16 bit. Tương tự như byte, short được sử dụng khi tiết kiệm bộ nhớ là vấn đề, đặc biệt là trong các mảng lớn có không gian bị hạn chế.
```
short shortVar;
```

**4. int Data Type**

- Số nguyên
```
int x;
```

**5. long Data Type**

- Kiểu dữ liệu dài là số nguyên bù hai có dấu 64 bit. Nó được sử dụng khi int không đủ lớn để chứa giá trị, cung cấp phạm vi rộng hơn nhiều.
```
long x;
```

**6. float Data Type**

- Kiểu dữ liệu float là kiểu dữ liệu dấu phẩy động IEEE 754 32 bit độ chính xác đơn. Sử dụng float (thay vì double) nếu bạn cần lưu bộ nhớ trong các mảng lớn các số dấu phẩy động. Kích thước của kiểu dữ liệu float là 4 byte (32 bit)
```
float x;
```


**7. double Data Type**
- Kiểu dữ liệu double là kiểu dữ liệu dấu phẩy động IEEE 754 64 bit có độ chính xác kép. Đối với các giá trị thập phân, kiểu dữ liệu này thường là lựa chọn mặc định. Kích thước của kiểu dữ liệu double là 8 byte hoặc 64 bit.
```
double x;
```


**8. char Data Type**

- Kiểu dữ liệu char là một ký tự Unicode 16 bit duy nhất có kích thước là 2 byte (16 bit)
```
char charVar;
```



**Non-Primitive (Reference) Data Types**

Bao gồm  : String , Class , Object , Interface , Array (nói rõ ở các chương sau)


**Object Data Types**
- Các primitive có thể được gom lại với nhau để tạo ra
những kiểu dữ liệu phức tạp hơn, gọi là object data
types. Object data types chứa bên trong nhiều value
phức hợp, ví dụ kiểu dữ liệu Student (do người dùng
tự định nghĩa) sẽ chứa bên trong nó những thông tin
như mã số, tên, ngày sinh, địa chỉ… Tương tự cho các
kiểu dữ liệu Person - người dùng tự tạo; File, Scanner
– có sẵn trong Java… “Sờ, chạm” đến thông tin bên
trong vùng phức hợp này qua dấu chấm, ví dụ:

```
Student s1 = new Student("SE12345", "An
Nguyễn", 2000, 9.5);
System.out.println(s1.getName());
//lấy và in ra tên của sinh viên An Nguyễn
```

- LƯU Ý: Biến object khi không muốn lưu trữ giá trị
gì cả, hoặc thiết lập giá trị mặc định cho nó, ta sẽ
nói nó trỏ về null
- Không dùng var để khai báo đặc điểm/field/attribute
của class. var chỉ được dùng làm biến cục bộ trong
hàm, trong vòng lặp



**Sử dụng Primitive Data Types**

- Mặc định Java ưu tiên số kiểu int, double. Do đó nếu
muốn dùng số kiểu long, float phải lưu ý hậu tố/suffix.
Câu lệnh hợp lệ khi dùng kiểu long với số lớn


```
long n1 = 3000000000L;
//mặc định mọi số nguyên là int. Số 3 tỷ
tràn miền int nên phải ghi hậu tố L ám chỉ
đang nói số long. Có thể dùng l thường
```


Câu lệnh hợp lệ khi dùng kiểu float
```
float n2 = 3.14F;
//mặc định mọi số thập phân là double 8
byte, bị ép về 4 byte để gán vào float thì
phải nói rõ. Có thể dùng f thường
```
Câu lệnh hợp lệ khi dùng số lớn

```
long n3 = 3_000_000_000L;
//Dấu gạch dưới _ dùng phân cách phần ngàn
để dễ đọc code. Không xuất hiện khi in ra
màn hình
```


Câu lệnh hợp lệ với số hệ thập lục phân (hex)
```
int n4 = 0xFA;
//0x là tiền tố/prefix ám chỉ con số nguyên
ghi dưới dạng hệ 16 (hexa)
```

Câu lệnh hợp lệ với số hệ bát phân (oct):
```
int n5 = 077;
//0 là tiền tố ám chỉ con số nguyên ghi dưới
dạng hệ 8 (octal)
```
Câu lệnh bị báo lỗi
```
int n6 = 091;
//báo lỗi vì 9 không thể xuất hiện trong hệ
8. Hệ 8 chỉ dùng 0, 1, … 7 để biểu diễn các
con số
```
# BIẾN
+ Biến được sử dụng để lưu các giá trị trong quá trình tính toán của chương
trình. Tùy theo kiểu dữ liệu của biến, một ô trong bộ nhớ sẽ được cấp phát
để lưu trữ giá trị của biến này.

> CÚ PHÁP
```
[Kiểu dữ liệu] [Tên biến] ;


vd:

int a;
long b;
float chuVi;
double dienTich;
boolean check;
char kiTu;
```


**Quy tắc đặt tên biến:**

+  Không được đặt tên biến bắt đầu bằng chữ số. Vd:  1dientich, 2chuvi, 222bankinh,...
+ Tên biến không được chứa dấu cách và các kí tự đặc biệt. vd: ban kinh, dien#tich, chu@vi,...
+ Tên biến không được trùng với tên từ khóa trong Java. vd: int, main, for, while, ...
+ Tên biến trong Java là phân biệt hoa thường. vd : banKinh và BanKinh
+ Trong Java khi đặt tên biến bạn
cần phải tuân theo quy chuẩn đặt
tên chung.
+ Tên biến được chia thành các từ, ngoại trừ
từ đầu tiên thì các từ tiếp theo bạn viết hoa
chữ cái đầu và viết thường chữ cái sau.

# Chú thích trong Java:

+ Chú thích trên một dòng:

Để chú thích trên 1 dòng ta dùng //
```c++
//Đây là chú thích
//Chú thích giúp code rõ ràng hơn
```


Chú thích trên nhiều dòng:

Để chú thích trên nhiều dòng ta đặt
nội dung cần chú thích giữa /* và */
```c++
/*
Đây là
chú thích trên nhiều dòng
*/
```

# TOÁN TỬ (OPERATORS)

**Math Operators (phép toán truyền thống)**
```
+, -, *, /, % (lấy dư), ++, --, +=, -=, *=,
/=…
```


+ Chú ý 1: Nếu bạn chia 2 số nguyên (int, long long) cho nhau thì phép chia ở trên sẽ
là phép chia nguyên, tức là nó chỉ lấy phần nguyên và bỏ phần thập phân ở thương.
Nếu muốn kết quả ở số thập phân thì ít nhất 1 trong 2 số phải ở kiểu số thực và
biến thương phải ở dạng số thực.

+ Chú ý 2: Nếu bạn nhân 2 hoặc cộng số nguyên int với nhau mà kết quả của tích
(tổng) vượt giới hạn lưu của số int thì kết quả sẽ bị tràn, ngay cả khi bạn sử dụng
biến long long để lưu biến tích. Việc cần xử lý ở đây là can thiệp vào phép nhân.

+ Chú ý 3: Các toán tử toán học có thứ tự ưu tiên nhân chia trước cộng trừ sau. Các
toán tử có cùng thứ tự ưu tiên thì phép toán được thực hiện từ trái qua phải. Tốt
nhất các bạn nên sử dụng đóng mở ngoặc tròn để có thể thực hiện biểu thức theo ý
muốn của mình.
**Shift Operators <<, >>**


Một con số trong hệ thập phân có thể được tăng giảm
giá trị thông qua phép đẩy các bit của nó khi xét nó
được biểu diễn dưới dạng số nhị phân.
Có hai phép toán đẩy/dịch bit. Phép dịch bit >> đẩy
sang phải, << đẩy sang trái một số lần các bit nhị phân
của con số nào đó trong hệ 10. Đẩy mãi thì con số gốc
sẽ còn lại toàn bit 0, tức là số gốc sẽ tiến về 0.
Nguyên tắc đẩy là hụt thì bù 0, lố/té thì mất luôn.
Làm dạng bài tập đẩy bit bắt buộc phải đổi con số hệ
10 sang dạng nhị phân, và biết trước tổng số bit để
biểu diễn con số này trong hệ 10. Biết tổng số bit để ta
còn bù 0 khi bị hụt, cho bit “té” đi mất khi bị dồn đẩy ra
ngoài biên

Xem kết quả đẩy con số 7 (hệ 10) sang phải 2 lần
sẽ được con số mấy? Biết rằng dùng 4 bit để lưu
con số 7.

7 >> 2


Số 7 biểu diễn dưới dạng nhị phân 4 bit có dạng 0111.
Số 7 cần đẩy bit của nó sang phải 2 lần. Khi đẩy sang
phải 2 lần, bit nào bên phải nhất bị té khỏi vùng 4 bit
thì mất luôn, song song việc bị té thì bit bên trái bị hụt,
sẽ được bù 0. Vậy sau hai lần đẩy sang phải 0111 còn
lại 0001 nhị phân (hai số 11 bị té, hụt hai số 00). Đổi
0001 nhị phân thành số 1 trong hệ 10. Vậy 7 đẩy sang
phải 2 bit sẽ thành con số 1.
Xem kết quả đẩy con số 7 sang trái 2 lần sẽ được
con số mấy? Biết rằng dùng 4 bit để lưu con số 7.
7 << 2
Bài giải:
Số 7 biểu dưới dạng nhị phân 4 bit có dạng 0111. Số 7
cần đẩy bit của nó sang trái 2 lần. Khi đẩy sang trái 2
lần, bit nào bị té (bên trái) khỏi vùng 4 bit thì mất luôn,
song song bị té thì 2 bit bên phải lúc này lại bị hụt,
được bù 00. Vậy sau hai lần đẩy sang trái 0111 ta có
1100 nhị phân, tức là số 12 trong hệ 10. Vậy 7 đẩy
sang trái 2 bit sẽ thành con số 12.


## Bitwise (&, |, ^, ~)


Là các phép tính toán khi thực hiện sẽ thao tác trên
mức bit, tức là 2 mức 0, 1.
Muốn làm dạng bài này phải đổi các toán hạng/con số
(operand) từ dạng thập phân sang dạng nhị phân, và
tiến hành làm phép toán trên từng cặp bit tương ứng
về vị trí. Kết quả cuối cùng đổi ngược lại về thập phân.
Phải cho biết trước số bit dùng biểu diễn con số dưới
dạng nhị phân và thao tác các bit theo bảng chân trị
dưới đây



| a   | b   | a&b | aIb | a^b | ~a  |
| --- | --- | --- | --- | --- | --- |
| 0   | 0   | 0   | 0   | 0   | 1   |
| 0   | 1   | 0   | 1   | 1   | 1   |
| 1   | 0   | 0   | 1   | 1   | 0   |
| 1   | 1   | 1   | 1   | 0   | 0   |


MẸO NHỚ:
 & (AND): chỉ cần nhớ kết quả của phép toán &
là 1 nếu cả hai toán hạng là 1, các trường hợp
còn lại kết quả là 0
 | (OR): chỉ cần nhớ kết quả của phép toán | là
1 nếu có ít nhất một trong hai toán hạng là 1,
cả 2 toán hạng là 1 càng tốt
 ^ (XOR): kết quả phép toán là 1 nếu hai toán
hạng khác nhau, các trường hợp còn lại cho ra
kết quả 0
 ~ (NOT): nghịch đảo, đảo của 1 là 0, đảo của
0 là 1


5 & 5 là mấy (biểu diễn bằng 4 bit)?


Bài giải:
5 ở dạng nhị phân 4 bit là 0101, vậy
```
0 1 0 1
&
0 1 0 1
---------
0 1 0 1
```
Kết quả là 0101, tức là 5 & 5 trả kết quả là 5 ở hệ 10.
Làm tương tự cho các phép toán còn lại dựa vào bảng
chân trị ở trên




# Các hàm xuất ra màn hình

## 1. In ra màn hình console

Nhập

Trước tiên chúng ta cần import thư viện nhập xuất

```
import java.util.Scanner;

Scanner scan = new Scanner(System.in)
```


Trong đó:

+ Scanner: là lớp giúp chúng ta lấy dữ liệu đầu vào, nằm trong gói java.util.
+ scan: là tên đối tượng từ lớp Scanner, khi nhập, ta sẽ làm việc với đối tượng này.
+ Trong ngoặc () là nguồn vào: có thể là hệ thống, người dùng hoặc tệp. Như ở đây là đầu vào hệ thống.


| Phương thức	| Mô tả |                     
|:-------|:------|
| nextByte()	| Đọc một số nguyên kiểu byte |
| nextShort()	| Đọc một số nguyên kiểu short | 
| nextInt()	| Đọc một số nguyên kiểu int | 
| nextLong()	| Đọc một số nguyên kiểu long |
| nextFloat()	| Đọc một số kiểu float |
| nextDouble()	| Đọc một số kiểu double |
| next()	| Đọc một string kết thức trước một ký tự trắng |
| nextLine()	| Đọc một line of text (kết thúc bằng phím Enter) |

b. Xuất:
- Sử dụng `System.out.printfln();`
   - Xuất kết quả ra màn hình đồng thời con trỏ chuột nhảy xuống dòng tiếp theo
- Sử dụng `System.out.print();`
   - Xuất kết quả ra màn hình nhưng con trỏ chuột không xuống dòng.
- Sử dụng `System.out.printf();`




//in ra kết quả có định dạng: print format
```
System.out.printf( );
%d: số nguyên
%f: số thực
- mặc định là 6 số lẻ
%.3f định dạng 3 số lẻ
%s: chuỗi
```

## 2. Nhập từ bàn phím

java.util.Scanner là công cụ được java hỗ trợ sẵn, dùng để nhập dữ liệu từ bàn phím
Bước 1: Tạo đối tượng Scanner
```
Scanner scanner = new Scanner(System.in);
```
Bước 2: sử dụng các phương thức được cung cấp sẵn
```
scanner.nextLine() => nhận 1 dòng nhập từ bàn phím => trả ra dữ liệu string
scanner.nextInt() => nhận 1 số nguyên từ bàn phím => trả ra dữ liệu số nguyên
scanner.nextDouble() => nhận 1 số thực từ bàn phím => trả ra dữ liệu số thực

```


```
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name is: ");
        String name = scanner.nextLine();
        System.out.println("Your age is: ");
        int age = scanner.nextInt();
        System.out.println("My name is " + name + ", age = " + age);
        scanner.close();
}

```

## 3. Biến và toán tử 


- Khai báo: **Data-type Variable-name;**

``` Java
int Num;
String st;
float f;
```

- Lưu ý đặt tên biến:
    - Chỉ được bắt đầu bằng chữ, dấu gạch dưới (_) hoặc dấu dollar ($).
    - Tên biến phải là một chuỗi liên tục.
    - Không trùng với các từ khóa mặc định, có phân biệt hoa và thường.

- Khởi tạo biến:
``` Java
int Num = 10;
String st = "ABC";
float f = scan.nextFloat();
```

- Java có biến toàn cục, biến cục bộ và biến static tương tự như C và CPP.
    - Biến static không thể nằm trong main.
    - Gọi tới biến static của một class bằng `ClassName.StaticVarName`
``` Java
public static int BienStatic;
```

b. `Kiểu dữ liệu & Toán tử `
- Tương tự C và CPP, cũng có ép kiểu.
- Không có kiểu dữ liệu `long long`.
- Muốn nhập kiểu `char`. Ta nhập vào string và trỏ tới vị trí đầu tiên.

``` Java
char c = scan.next().charAt(0);
```
- Toán tử $==$ dùng để so sánh, nhưng khi muốn so sánh 2 string với nhau, ta cần dùng phương thức `equals()`, giá trị trả về là true/false.
``` Java
String a = "ABC";
String b = "ABC";
System.out.println(a.equals(b)); // true
```

# Java Type Casting (Conversion)

- Ép kiểu là một kỹ thuật được trình biên dịch hoặc lập trình viên sử dụng để chuyển đổi một kiểu dữ liệu này sang kiểu dữ liệu khác trong Java. Ép kiểu cũng được gọi là chuyển đổi kiểu. Ví dụ, chuyển đổi int thành double, double thành int, short thành int, v.v.
- Below is the syntax for narrowing type casting i.e., to manually type conversion:

```
double doubleNum = (double) num;
double a = 12.3;
int p = (int) a;
```



