# 🚀 OOP : Object-Oriented Programming


- [🚀 OOP : Object-Oriented Programming](#-oop--object-oriented-programming)
  - [Tổng quan](#tổng-quan)
  - [Lập trình hướng đối tượng là gì??](#lập-trình-hướng-đối-tượng-là-gì)
  - [NGUYÊN LÍ THIẾT KẾ OOP](#nguyên-lí-thiết-kế-oop)
  - [CLASS/OBJECT](#classobject)
    - [Thuộc tính và phương thức:](#thuộc-tính-và-phương-thức)
    - [Class Method (Phương thức của class)](#class-method-phương-thức-của-class)
    - [Xây dựng lớp:](#xây-dựng-lớp)
    - [Khai báo đối tượng:](#khai-báo-đối-tượng)
    - [Hàm tạo: (Constructor)](#hàm-tạo-constructor)
    - [Access Modifier](#access-modifier)
    - [Con trỏ this, getter() và setter():](#con-trỏ-this-getter-và-setter)
      - [this](#this)
      - [getter and setter](#getter-and-setter)
  - [Static keyword:](#static-keyword)
  - [4 Nguyên lí OOP](#4-nguyên-lí-oop)
    - [Encapsulation (đóng gói)](#encapsulation-đóng-gói)
    - [KẾ THỪA INHERITANCE](#kế-thừa-inheritance)
      - [Từ khóa super:](#từ-khóa-super)
      - [Overriding:](#overriding)
      - [Overload:](#overload)
    - [Đa hình - Polymorphism](#đa-hình---polymorphism)
      - [Dynamic Binding:](#dynamic-binding)
      - [Ép kiểu đối tượng và toán tử instanceof:](#ép-kiểu-đối-tượng-và-toán-tử-instanceof)
    - [Trừu tượng - Abstract Class:](#trừu-tượng---abstract-class)
  - [Interface](#interface)
    - [Comparable Interface:](#comparable-interface)



## Tổng quan
+ chương trình/phần mềm/app là tập hợp của các khối code
(block code) và máy tính thực hiện tuần tự theo yêu cầu của người dùng

+ Máy tính chỉ có thể "chạy từng dòng lệnh"
+ Có rất nhiều cách để hoàn thiện 1 chương trình:
- procedural programming (pascal) /structure programming
- functional programming (react hook vs react class component)
- object oriented programming

> Cách làm nào không quan trọng, điều quan trọng là nó giải quyết tốt vấn đề bạn gặp phải


OOP có các lợi thế:
- Clear Structure : cấu trúc rõ ràng
- Reuse application code : tính tái sử dụng code cao => dễ dàng maintain (bảo trì),
modify (sửa đổi) và debug (fix bug)
- designing large and complex programs (tương tự angular) : mục tiêu giải quyết các
bài toán phức tạp


**Vậy OOP là gì ?**

OOP là cách chúng ta mô phỏng thế giới thực (real world) vào chương trình
(program) máy tính.
Tất cả các "đối tượng" tham gia vào chương trình chính là những thành phần chủ chốt.
Ví dụ với website khóa học (phân tích chức năng khóa học):
Các "đối tượng"/thành phần tạo lên website:
+ Danh sách khóa học
+ khóa học riêng lẻ
+  nội dung của khóa học : tiêu đề, giá cả...
+ giáo án của khóa học

=> OOP thiên hướng "mô phỏng" những điều bạn thấy (sử dụng) ở thế giới thực tế vào
thế giới programing (coding).
but how 

## Lập trình hướng đối tượng là gì??
Lập trình hướng đối tượng (OOP) là một mô hình dựa trên khái niệm gói gọn dữ liệu và hành vi liên
quan đến dữ liệu đó vào các gói đặc biệt gọi là đối tượng (object), được xây dựng từ một tập các
"bản thiết kế" do lập trình viên định nghĩa, gọi là lớp (class). OOP tập trung vào cách mà các đối
tượng giao tiếp với nhau để giải quyết các bài toán nghiệp vụ.
Một điều khác biệt quan trọng khi làm việc với OOP, đó là quan tâm đến trạng thái (State) của đối
tượng và dữ liệu trong quá trình chương trình hoạt động, cũng như cách mà các đối tượng đó tương
tác (Sending Message). Trong các section bên dưới, bạn sẽ dần hiểu thêm về cách triển khai OOP
phù hợp


## NGUYÊN LÍ THIẾT KẾ OOP

Lập trình hướng đối tượng dựa trên 4 nguyên lí sau
 Abstraction (trừu tượng hoá)
 Encapsulation (đóng gói)
 Inheritance (kế thừa)
 Polymorphism (đa xạ, đa hình)

Bạn có thể tưởng tượng: Đóng gói (Encapsulation) như một chiếc khiên bảo vệ, Trừu tượng
(Abstraction) như đám mây trên bầu trời, Kế thừa (Inheritance) là một cây gia phả, và Đa hình
(Polymorphism) là một chú tắc kè hoa. Rất thú vị phải không 😀.



## CLASS/OBJECT

+ Đối tượng, hay object là những cái gì cụ thể, thấy
được, đếm được, sờ được, nhìn được, nhận dạng
được, ví dụ trong hình dưới đây có 3 đối tượng cờ-hó
– là 3 con vật cụ thể

+ Giữa một đám lộn xộn đối tượng gồm đồ vật, con vật,
sự kiện, con người…ta nhận ra có những đám object
thuộc về một nhóm nào đó bởi vì giữa chúng có sự
tương đồng/đồng dạng/tựa tựa nhau. Ta có thể phân
nhóm, phân cụm, phân hạng, chia nhóm một đám
object dựa trên sự tương đồng, nhóm này đặt cho một
cái tên chung, vậy tên chung này được gọi là class đại
diện cho nhóm đó

+ Đám vài chục “đứa” chạy bằng 4 chân, kêu gâu-gâu
chứ không phải kêu miu-miu, cứ gặp con miu-miu là
rượt, cắn cổ, bao gồm cả 3 object ở hình trên, đích thị
đám này thuộc nhóm, thuộc cụm, thuộc class Dog

+ Theo chiều ngược lại, class Dog là một khái Khuôn
chung để đúc ra đám con gâu-gâu Chi Hu Hu, Ngáo
Đá (chó Ngao), Misa, Milu, Vàng Ơi. Đám con gâu-gâu
này gọi là object, đối tượng, instance, thể hiện, hiệnthân, xuất thân từ thế giới nhà Dog.

> Chốt hạ: Class giống như cái Khuôn. Object là đối
tượng/bức tượng được đúc ra từ Khuôn. Class là
sự chia nhóm, gom nhóm các đối tượng tương
đồng nhau về đặc điểm và hành vi

### Thuộc tính và phương thức:

Để mô tả thông tin của một lớp, bạn cần bổ sung các thuộc tính
(Attribute) và các phương thức (Method).

Ví dụ Các thuộc tính như là : Họ , tên , ngày sinh , giới tính
----- Các phương thức như là : đi lại , ăn uống , giao tiếp....


### Class Method (Phương thức của class)
1. Định nghĩa method thông thường
Method là cách tượng trưng cho hành động của object.
Tên method thường viết theo camelCase, và là các động từ (chỉ hành động)


```java
<return_type> <method_name> ([parameters]) { //code}
<kiểu_trả_về> <tên_method> ([danh_sách_tham_số]) { //code}
ví dụ:
void getName(){
//
}
int getTuoi(){
///
}
```
2. Method Overloading (Nạp chồng phương thức)
- Chúng ta có thể định nghĩa các method với tên giống nhau (nhưng khác nhau về tham
số)
void method( ){ }
void method(int a){ }
void method(int a, String b){ }

### Xây dựng lớp:

+ Trong class sẽ chứa các member có thể là thuộc tính hoặc
phương thức. Khi khai bao các member này thì bạn phải chỉ
ra access_specifier cho các thành phần này.

```java
class class_name{
    access_specifier1:
    member1, member2...
    access_specifier2:
    member1, member2...

};
```

+ Các access_specifier (tạm dịch là
quyền truy cập): public, protected,
private , default

+ Đối với các member là thuộc tính bạn để quyền truy cập là private để đảm bảo
tính chất đóng gói của OOP (Encapsulation). Khi quyền truy cập là private thì
các thuộc tính này chỉ có thể truy cập bên trong phạm vi của lớp.

+ Đối với các member là phương thức bạn để quyền truy cập là public. Quyền truy cập
protected sẽ được giải thích rõ hơn ở phần kế thừa.


### Khai báo đối tượng:

+ Để khai báo một đối tượng của lớp các bạn sử dụng tên lớp
như kiểu dữ liệu. Ngoài ra bạn cũng có thể khai báo mảng đối
tượng, ArrayList đối tượng.

```java
package dinhthang.love2code.OOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student a = new Student("John Doe", 23);
        a.greet();
        System.out.println(a);
    }
}

```

+ Để truy cập các phương thức và
thuộc tính của đối tượng ta sử
dụng toán tử ‘.’
+ Bạn không thể truy cập vào các
member private của lớp bên
ngoài phạm vi của lớp.

### Hàm tạo: (Constructor)

+ Là hàm được gọi mặc định khi bạn khai báo một
đối tượng của 1 lớp nào đó, kể cả khi bạn không
xây dựng hàm này thì hàm này vẫn tồn tại.

+ Tuy nhiên bạn có thể tự xây dựng hàm tạo để
nhanh chóng khởi tạo thông tin cho các thuộc tính
của đối tượng bằng cách nạp chồng hàm tạo.
+ Hàm tạo không có kiểu trả về, có tên trùng với tên
lớp, tùy theo tham số bạn truyền vào cho đối tượng
khi khai báo thì hàm tạo phù hợp sẽ được gọi.

+ Chú ý Tên constructor phải giống y chang tên class, và không
có giá trị trả về


```java
package dinhthang.love2code.OOP;

public class Student {

    private String name;
    private int age;


    public Student() { // hàm tạo k tham số 
        System.out.println("Student Constructor");
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

```

### Access Modifier

Access Modifier : quyền truy cập sử dụng/sửa đổi
Trong java, có 4 thuộc tính hay dùng nhất:
- private: chỉ được sử dụng trong nội bộ class
- public : công khai hoàn toàn (100%)
- (default): là public đối với class trong cùng package. là private khi khác package
- protected: được sử dụng với lớp cha/con (tính chất kế thừa : sẽ đề cập sau


Mức độ che dấu tăng dần theo mũi tên:
public -> protected -> {default} -> private


### Con trỏ this, getter() và setter():


#### this
+ Bạn có thể sử dụng con trỏ this trước tên các thuộc tính
hoặc phương thức để đảm bảo sự rõ ràng khi có những
tham số trùng tên với các thuộc tính.
+ Dùng để "tham chiếu" tới giá trị của instance/object hiện tại (tương tự con trỏ của C :v)

#### getter and setter
+ Getter(): Khi làm việc với các đối tượng, đôi khi bạn muốn
lấy ra các thuộc tính của lớp nhưng không thể truy cập
trực tiếp vào các thuộc tính này. Giải pháp: xây dựng
phương thức getter() để lấy về thuộc tính mong muốn.

+ Setter(): Tương tự như getter(), khi bạn muốn thay đổi thuộc
tính của đối tượng bạn phải sử dụng hàm setter để thay đổi
vì không thể trực tiếp truy cập vào các thuộc tính này.


```java
package dinhthang.love2code.OOP;

public class Student {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("Student Constructor");
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void greet() {
        System.out.println("Hello, " + name + "!");
    }
    @Override
    public String toString() {
        return "Student [name=" + this.name + ", age=" + this.age + "]";
    }
}

```


## Static keyword:

+ Là từ khoá áp dụng cho khai báo hàm, biến, nhóm
lệnh, và class lồng (nested class). Hàm và biến static
sẽ nằm riêng ở một vùng nhớ, là vùng nhớ dùng
chung cho mọi object của class đó.

+ Truy xuất static thông qua tên class chấm (nếu đươc
quyền truy xuất).

+ Static chơi với static. Static còn được gọi là class-level.
+ Biến, hàm non-static, tức là không chứa keyword
static, thì chúng sẽ thuộc về object, còn gọi là objectlevel.
+ Không dùng biến static để lưu trữ các thông tin của
riêng từng object.


+ Biến static: Biến static thuộc về class chứ không thuộc về bất cứ một đối
tượng nào của lớp, tức là các đối tượng của lớp sẽ chung biến static này.


```java
package dinhthang.love2code.OOP;

public class Student2 {

    private String name , ns;
    private int age;
    private static int dem =0;


    public Student2(String name,  String ns, int age) {
        dem++;
        this.name = name;
        this.ns = ns;
        this.age = age;
    }

    public int getDem() {
        return dem;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Student2 a = new Student2("thang" , "22/10/2020", 1990);
        Student2 b = new Student2("dinh" , "22/10/2021", 1992);

        System.out.println(a.getDem());
        System.out.println(b.getDem());
    }
}

```


## 4 Nguyên lí OOP

### Encapsulation (đóng gói)


**Khái niệm**

+ Tính đóng gói là việc che giấu thông tin và hành vi bên trong của một đối tượng, chỉ cho phép truy cập thông qua các phương thức công khai (public methods).

+ Dữ liệu (biến) của đối tượng được bảo vệ và không thể bị thay đổi trực tiếp từ bên ngoài

**Cách thực hiện**

+ Sử dụng access modifiers (phạm vi truy cập) như private, protected, public để kiểm soát quyền truy cập vào các biến và phương thức.

+ Cung cấp các phương thức getter và setter để truy cập và thay đổi dữ liệu một cách an toàn.


Để tăng tính bảo mật cho dữ liệu, bạn cần:
- hạn chế quyền "modify" data
- che dấu data : public/private...

```java
class Person {
    // Biến private (đóng gói)
    private String name;
    private int age;

    // Phương thức public để truy cập dữ liệu
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) { // Kiểm tra tính hợp lệ
            this.age = age;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("John");
        person.setAge(25);

        System.out.println("Tên: " + person.getName()); // Output: Tên: John
        System.out.println("Tuổi: " + person.getAge()); // Output: Tuổi: 25
    }
}
```

### KẾ THỪA INHERITANCE

**khái niệm**

+ Tính kế thừa cho phép một lớp (class) kế thừa các thuộc tính và phương thức từ một lớp khác.

+ Lớp con (subclass) có thể sử dụng lại mã nguồn của lớp cha (superclass) và mở rộng thêm chức năng.

+ Lớp trong Java có thể mở rộng, tạo một lớp mới
từ một lớp cũ mà vẫn bảo toàn được những đặc
điểm của lớp cũ. Quá trình này gọi là kế thừa, kế
thừa liên quan tới các khái niệm như lớp cha
(base class hoặc super class), lớp con (derived
class hoặc sub class).

**Cách thực hiện:**
Sử dụng từ khóa extends để kế thừa từ một lớp cha.

Lớp con có thể ghi đè (override) các phương thức của lớp cha để thay đổi hành vi.


CÚ PHÁP

> public class SubClass extends SuperClass{}

+ Một Con chỉ có tối đa (extends) một Cha (single
inheritance).

+ Nếu class không có class Cha, Cha mặc định là
Object. Object là class ông-tổ của muôn loài

+ Câu lệnh super() gọi constructor Cha nếu xuất hiện
trong constructor Con, thì phải là câu lệnh đầu tiên
trong constructor Con.

+ “Con bất hiếu”, những gì của Cha (hàm, đặc tính) sẽ là
của Con (kế thừa). Những gì của Con tạo dựng (riêng
Con) sẽ là của Con, Cha không biết, không thấy.


+ Cha che giấu thông tin/field với người ngoài (private),
thoải mái cho người nhà (Con), gọi là protected.


+ Khi lớp con kế thừa lớp cha, nó có đầy
đủ các thuộc tính và phương thức của
lớp cha, ngoài ra bạn có thể bổ sung
thêm thuộc tính và phương thức cần
thiết cho lớp con.
+ Tuy nhiên nếu các thuộc tính của lớp
cha là private bạn cũng ko thể truy
cập vào các thuộc tính này từ lớp con.
Nếu muốn thì bạn khai báo phạm vi
truy cập là protected.

```java
public class People {

    private String name;
    private int age;
    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}


public class Person extends People{
    private String lop;
    private double gpa;
    
    public Person(String name, int age, String lop, double gpa) {
        super(name, age);
        this.lop = lop;
        this.gpa = gpa;
        
    }

    @Override
    public String toString() {
        return super.toString() + "\nLop: " + lop + "\nGPA: " + gpa;
    }
}

public class Main {
    public static void main(String[] args) {
        Person a = new Person("Thang" , 45 , "12A" , 6.6);

        System.out.println(a);
        System.out.println(a.getName());
    }
}

```


#### Từ khóa super:

+ Khi muốn gọi các phương thức của lớp cha tại lớp con ta có thể sử dụng
từ khóa super.


```c++
public Person(String name, int age, String lop, double gpa) {
        super(name, age);
        this.lop = lop;
        this.gpa = gpa;
        
    }
```

#### Overriding:

+ Con có hàm trùng 100% tên và tham số và
giá trị trả về với hàm của Cha.

+ Ghi đè trong kế thừa là khi ở lớp cha và lớp con có một phương thức giống
nhau. Nếu lớp con không ghi đè phương thức này thì phương thức của lớp
cha sẽ được gọi khi bạn gọi phương thức này từ đối tượng của lớp con.

#### Overload:

+ xảy ra trong class bất kì, khi có nhiều hàm
trùng tên nhau nhưng khác phần tham số (khác data
type, không quan tâm tên tham số)

```c++
public class Person {
public void greet(){
    System.out.println("Person !");
    }
}
public class Student extends Person{
public void greet(){
    System.out.println("Student !");
}
}

public class Main {
public static void main(String[] args){
Student s = new Student();
s.greet();
}
}

```

### Đa hình - Polymorphism

**Khái niệm:**
+ Tính đa hình cho phép các đối tượng thuộc các lớp khác nhau có thể được xử lý thông qua một interface chung.

+ Đa hình thể hiện qua việc ghi đè (override) phương thức và nạp chồng (overload) phương thức.


+ là một trong 3 tính chất quan
trọng của lập trình hướng đối tượng (bên cạnh Đóng gói -
Encapsulation và Kế thừa - Inheritance). Đa hình cho phép
bạn tham chiếu một biến thuộc kiểu dữ liệu của lớp cơ sở
tới đối tượng của một lớp con.

+ Ví dụ: Lớp Student kế thừa từ lớp
Person thì tất cả các thực thể
(instance) của lớp Student đều là
thực thể của lớp Person, nhưng
ngược lại thì không.


**Cách thực hiện:**
+ Ghi đè phương thức (Method Overriding): Lớp con định nghĩa lại phương thức của lớp cha.

+ Nạp chồng phương thức (Method Overloading): Cùng một tên phương thức nhưng khác nhau về số lượng hoặc kiểu tham số.



```java
package dinhthang.love2code.DaHinh;

public class Person {

    public void display() {
        System.out.println("person");
    }
}

public class Student extends  Person {
    public void display() {
        System.out.println("student");
    }
}

public class Staff extends Person {


    public void display() {
        System.out.println("Staff");
    }
}

public class Main {
    public static void main(String[] args) {

        Person a = new Student();
        Person b = new Staff();
        Person c = new Person();

        a.display();
        b.display();
        c.display();
    }
}

```


#### Dynamic Binding:


+ Trong kế thừa nhiều mức (Multilevel Inheritance) một phương thức có thể được ghi đè ở
nhiều lớp trong chuỗi kế thừa, máy ảo Java (JVM) sẽ quyết định phương thức nào được
gọi lúc Runtime.

#### Ép kiểu đối tượng và toán tử instanceof:


Có hai loại ép kiểu đối tượng trong Java:

+ Ép kiểu ngầm định (Upcasting): Chuyển đổi một đối tượng từ lớp con sang lớp cha. Đây là quá trình tự động và không cần sử dụng toán tử ép kiểu.

+ Ép kiểu tường minh (Downcasting): Chuyển đổi một đối tượng từ lớp cha sang lớp con. Đây là quá trình không tự động và cần sử dụng toán tử ép kiểu

--------------------

1. Ép kiểu ngầm định (Upcasting)
Ép kiểu ngầm định xảy ra khi bạn gán một đối tượng của lớp con cho một biến tham chiếu của lớp cha. Điều này là an toàn vì lớp con kế thừa từ lớp cha.

```java

class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog is barking");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        myAnimal.makeSound(); // Output: Dog is barking
    }
}
```

--------------------

Ép kiểu tường minh (Downcasting)
Ép kiểu tường minh xảy ra khi bạn chuyển đổi một đối tượng từ lớp cha sang lớp con. Điều này cần phải được thực hiện một cách tường minh và có thể gây ra lỗi nếu không cẩn thận.

```java
class Animal {
    void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog is barking");
    }

    void fetch() {
        System.out.println("Dog is fetching");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myAnimal = new Dog(); // Upcasting
        Dog myDog = (Dog) myAnimal; // Downcasting
        myDog.makeSound(); // Output: Dog is barking
        myDog.fetch(); // Output: Dog is fetching
    }
}
```

---------------------

+ Một biến tham chiếu của đối tượng có thể được ép sang tham chiếu của
một đối tượng thuộc lớp khác, đây được gọi là ép kiểu đối tượng

```java
public class Main {
    public static void main(String[] args) {
        Object ob = new Student(); //Implicit casting
        Student s = (Student)ob; // Explicit casting
    }
}
```


**Ép kiểu đối tượng và toán tử instanceof:**

+ Ta có thể ép một instance của lớp con sang một biến đối tượng của lớp cha (upcasting), vì
một đối tượng của lớp con bao giờ cũng là một đối tượng của lớp cha.

+ Khi ép kiểu một instance của lớp cha sang biến đối tượng của lớp con (downcasting) bạn
phải tự đảm bảo rằng instance của lớp cha là một instance của lớp con, nếu không sẽ phát
sinh lỗi ClassCastException. Downcasting được thực hiện bằng Explicit casting


### Trừu tượng - Abstract Class:

**Khái niệm:**
+ Tính trừu tượng là việc ẩn đi các chi tiết phức tạp bên trong và chỉ hiển thị các tính năng cần thiết ra bên ngoài.

+ Giúp tập trung vào "cái gì" thay vì "làm thế nào".

**Cách thực hiện:**
+ Sử dụng abstract class (lớp trừu tượng) hoặc interface để định nghĩa các phương thức trừu tượng.

+ Lớp con phải triển khai (implement) các phương thức trừu tượng.


---------------------------
+ Abstract class không thể sử dụng để tạo ra
một đối tượng như các lớp thông thường, lớp
trừu tượng có thể chứa các phương thức
trừu tượng (abstract method) và sẽ được cài
đặt chi tiết hơn ở các lớp con.

+ Khi một lớp con kế thừa từ 1 lớp trừu tượng,
tất cả các phương thức trừu tượng ở lớp cha
phải được cài đặt cụ thể ở lớp con.


```java

package dinhthang.love2code.TruuTuong;

public abstract  class GeometricObject {
    private String color;
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObject() {}


    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public abstract double getArea();
    public abstract double getPerimeter();


}


public class Circle  extends GeometricObject {

    private double radius;

    public Circle(String color , boolean filled, double radius) {
        super(color , filled);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}


public class Rectangle extends GeometricObject {


    private double width , height;

    public Rectangle(double width, double height , String color , boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;

    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}


public class Main {


    public static boolean equalArea(GeometricObject o1, GeometricObject o2){
        return o1.getArea() == o2.getArea();
    }


    public static void display(GeometricObject o){
        System.out.println(o.getArea() + " " + o.getPerimeter());
    }


    public static void main(String[] args) {
        GeometricObject ob1 = new Circle("Red", true, 10);
        GeometricObject ob2 = new Rectangle(10, 20, "Green", true);
        System.out.println(equalArea(ob1, ob2));
        display(ob1); display(ob2);
    }
}

```


**Note**

+ Không thể tạo đối tượng từ lớp trừu tượng
thông qua toán tử new, tuy nhiên bạn vẫn
có thể tạo constructor cho lớp trừu tượng.

+ Lớp chứa phương thức trừu tượng bắt
buộc phải là một lớp trừu tượng, tuy
nhiên một lớp trừu tượng có thể không
chứa phương thức trừu tượng.


+ Lớp cha của một lớp trừu tượng có thể
không phải là một lớp trừu tượng, ví dụ
lớp Object là cha của lớp GeometicObject

+ Một phương thức trừu tượng chỉ có thể
được chứa trong một lớp trừu tượng, nếu
một lớp con không cài đặt mọi phương
thức trừu tượng ở lớp cha thì nó phải
được khai báo là một lớp trừu tượng. Các
phương thức trừu tượng không thể khai
báo với từ khóa static.

+ Bạn không thể tạo đối tượng từ lớp trừu
tượng nhưng có thể sử dụng nó như một
kiểu dữ liệu.



## Interface

+ Interface là dạng class “Cha” đặc biệt, gom những đứa
“Con” không quan tâm nguồn gốc xuất thân, chỉ quan
tâm chung lí tưởng, hành động, giao tiếp, interface

+ Là hình thức của Câu lạc bộ, Hội nhóm.
Chỉ chứa hàm abstract (trước JDK 8).
+ Không tạo constructor cho interface.
+ Biến, field trong interface mặc định là public static final,
và phải được gán giá trị ngay khi khai báo biến.

+ Mọi hàm trong interface tầm truy xuất là public hoặc
default (trước JDK8).

+ Không dùng toán tử new để tạo object với Interface.
Nếu ngoan cố dùng new sẽ tạo object dạng


+ Interface trong Java có cấu trúc
tương tự như một lớp nhưng chỉ
chứa các hằng số và phương
thức trừu tượng

+ Interface có vai trò tạo ra
những phương thức, hành vi
chung cho các lớp tương tự
như Lớp trừu tượng.

+ Mối quan hệ giữa lớp và
interface được gọi là kế thừa
interface, để một lớp kế thừa
interface ta sử dụng từ khóa
implements

+ Bạn không thể tạo ra một đối
tượng từ interface thông qua
toán tử new.



```java
package dinhthang.love2code.Interface;

public interface Drawable {

    public abstract void draw();
}


public class Circle implements Drawable {
    @Override
    public void draw() {
        System.out.println("Drawing circle ");
    }
}


public class Rectangle implements Drawable {

    @Override
    public void draw() {
        System.out.println("Drawing rectangle");
    }
}

public class Main {

    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
    }
}


```


### Comparable Interface:


Comparable Interface định nghĩa một phương thức là compareTo
để so sánh object. Giả sử bạn cần một phương thức chung để tìm
đối tượng lớn hơn trong 2 Sinh viên, 2 hình tròn... để có thể so
sánh 2 đối tượng thì chúng cần phải so sánh được với nhau, Java
hỗ trợ interface comparable giúp bạn đạt được điều này.

