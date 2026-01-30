BÀI TẬP THỪA KẾ VÀ ĐA HÌNH
TRONG LẬP TRÌNH HƯỚNG ĐỐI TƯỢNG VỚI JAVA
NỘI DUNG
I. ÔN TẬP LÝ THUYẾT	1
1. Giới thiệu	1
2. Thừa kế trong ngôn ngữ Java	1
2. Đa hình trong ngôn ngữ Java	3
II. BÀI TẬP	4
III. BÀI TẬP TỰ THỰC HIỆN	10

 
I. ÔN TẬP LÝ THUYẾT
1. Giới thiệu
Phần này sẽ nhắc lại một số kiến thức trọng điểm của Chương 3. Thừa kế và đa hình.  
2. Thừa kế trong ngôn ngữ Java 
-	Quan hệ “chứa” (“has – a”) hay quan hệ tích hợp thành phần (Composition): Quan hệ này chỉ ra rằng có 2 lớp A và B, trong đó lớp B chỉ sử dụng một phần mã chương trình của lớp A (phương thức, thuộc tính) mà không sửa đổi gì về nội dung của lớp A. Do vậy, lớp A được coi là hợp phần (compostition) của lớp B khi trong khai báo B chứa A (hay nói cách khác A thuộc về B).
-	Quan hệ “thừa kế” (“is – a”) : 
Cài đặt thừa kế trong Java: Để báo cho trình biên dịch rằng “lớp B thừa kế từ lớp A” hoặc “lớp B được dẫn xuất từ lớp A” phải thêm vào sau lớp B từ khóa extends với cú pháp như sau:
+ Cú pháp: 
public class A {
	............// Định nghĩa lớp cha
}
public class B extends A{
	..............// Định nghĩa lớp con
}
Trong đó, A là lớp cha và B là lớp con được thừa kế từ lớp cha; extends là từ khóa thừa kế. Lớp A và lớp B có thể là lớp do người dùng tự định nghĩa hoặc là lớp đã được định nghĩa sẵn trong thư viện của Java. Nếu không có từ khóa extends, ví dụ như định nghĩa lớp A, mặc định A được thừa kế từ lớp Object trong thư viện của Java. Lớp Object là lớp cha của mọi lớp được định nghĩa trong Java. 
+ Định nghĩa lớp con : Mô tả một lớp con cũng giống như biểu diễn nó trong ORD, ta chỉ tập trung vào những điểm khác với lớp cha. Điều này mang đến những lợi ích sau:
	Đơn giản hoá khai báo lớp;
	Hỗ trợ nguyên lý đóng gói của hướng đối tượng;
	Hỗ trợ tái sử dụng mã nguồn (sử dụng lại định nghĩa của các phương thức và thuộc tính);
	Che giấu thông tin ;
	Tiết kiệm bộ nhớ ;
Những vấn đề cần nhớ khi cài đặt thừa kế: phương thức khởi tạo constructor, quyền truy cập public – private – protected, toán tử super.
2. Đa hình trong ngôn ngữ Java 
-	Phân loại đa hình nạp chồng và đa hình vượt quyền:
+ Nạp chồng (Overloading): Đã biết hai hoặc nhiều hàm hoặc phương thức trùng tên với các chữ kí khác nhau được gọi là Overloading-nạp chồng. Nạp chồng là dạng đơn giản đầu tiên của đa hình: Đa hình hàm - function polymorphism. Đa hình hàm hay còn gọi là hàm chồng- function Overloading trong lập trình chúng ta đã gặp khi lập trình hướng cấu trúc với C++. Khi đó, hai hàm trùng tên nhưng khác nhau về danh sách tham số, ví dụ foo(int i) và foo(int i, int j). Trong lập trình hướng đối tượng, đa hình nạp chồng sẽ trở thanh Phương thức chồng - method Overloading: hai phương thức trùng tên nhưng danh sách tham số khác nhau.
+ Vượt quyền (Overriding) : Đa hình được cài đặt bởi một khái niệm tương tự Overloading nhưng hơi khác: method overriding  với  “override” có nghĩa “vượt quyền”. Method overriding là: nếu một phương thức của lớp cơ sở được định nghĩa lại tại lớp dẫn xuất thì định nghĩa tại lớp cơ sở có thể bị “che” bởi định nghĩa tại lớp dẫn xuất.
Với method overriding, toàn bộ thông điệp (cả tên và tham số) là hoàn toàn giống nhau - điểm khác nhau là lớp đối tượng được nhận thông điệp.
-	Lớp trừu tượng - abstract class
Lớp cha trong cây thừa kế khi không thực sự được dùng để tạo ra thể hiện thì nó được tạo ra nhằm mục đích cho tất cả các lớp được thừa kế từ lớp cha đó sử dụng chung mã nguồn. 
Cú pháp khai báo một lớp trừu tượng sử dụng từ khóa abstract
abstract class Base{}
Khi khai báo một lớp là trừu tượng, việc tạo thể hiện cho lớp đó, hay cài đặt một phương thức nào đó cho lớp không có ý nghĩa, Java ngăn điều đó xảy ra ngay khi biên dịch để chặn người dùng. 
-	Cú pháp khai báo và cài đặt giao diện trong Java
+ Khai báo interface:
interface A{
		...
}
+ Cài đặt interface:
class B implements A {
		....
}
Lưu ý : lớp B phải định nghĩa các phương thức khai báo ở lớp A.
II. BÀI TẬP 
Bài 1.	Giả sử ta có một lớp Fruit để mô tả các loại hoa quả. Vì táo cũng là một loại hoa quả, do đó táo có tính chất chung nhất của các loại quả. Tạo hai lớp Fruit và Apple để chỉ hoa quả nói chung và quả táo nói riêng theo quan hệ has-a
 
Hướng dẫn
Bài 2.	Sử dụng kiểu lập trình Composition để tạo mối quan hệ Người – Nhân viên – Quản lý. 
Hướng dẫn:
Lớp Người
Lớp Nhân viên
Lớp Quản lý
Bài 3.	Tạo hai lớp Fruit và Apple để chỉ hoa quả nói chung và quả táo nói riêng theo quan hệ is-a
 
Hướng dẫn
Bài 4.	Giả sử có 2 danh sách dưới đây:
Danh sách cán bộ
Họ và tên	Ngày sinh	Giới tính	Quê quán	Cấp hàm	Chức vụ
Nguyễn Văn A	30/10/1963	Nam	Hà Nội	Trung tá	Trưởng Khoa
Nguyễn Thị B	22/11/1976	Nữ	Ninh Bình	Đại úy	
....	...	...	....	...	...
Danh sách sinh viên
Họ và tên	Ngày sinh	Giới tính	Quê quán	Lớp	Khoa
Trần Văn A	20/05/1995	Nam	Thái Bình	B16D47	CN&ANTT
Lê Thị B	22/11/1997	Nữ	Hải Phòng	B1D50	ANĐT
....	...	...	....	...	....
Hãy lập trình theo hướng đối tượng để in ra danh sách cán bộ và danh sách sinh viên nói trên (bỏ qua phần lập trình để vẽ bảng). 
Hướng dẫn:
Trước hết, nhìn vào 2 danh sách, có thể thấy có 2 loại đối tượng là cán bộ và sinh viên. Tiếp theo, tạo 2 lớp để quản lý 2 loại đối tượng này. 
 
CÁN BỘ
	SINH VIÊN
Họ và tên
Ngày sinh
Giới tính
Quê quán
Cấp hàm
Chức vụ		Họ và tên
Ngày sinh
Giới tính
Quê quán
Lớp
Khoa 
Nhập tên
Nhập ngày sinh
Nhập giới tính
Nhập quê quán
Nhập cấp hàm
Nhập chức vụ
In thông tin cán bộ		Nhập tên
Nhập ngày sinh
Nhập giới tính
Nhập quê quán
Nhập lớp
Nhập khoa
In thông tin sinh viên
Quan sát các lớp trên, ta thấy có những phương thức và thuộc tính chung. Nhóm những thuộc tính và phương thức đó lại và định nghĩa chúng trong 1 lớp gọi là lớp Người như sau:
NGƯỜI
Họ và tên
Ngày sinh
Giới tính
 Quê quán
Nhập tên
Nhập ngày sinh
Nhập giới tính
Nhập quê quán
In thông tin
Hai lớp CÁN BỘ, SINH VIÊN có tất cả những phương thức và thuộc tính của lớp NGƯỜI. Ngoài ra 2 lớp này còn có thêm các thuộc tính và phương thức riêng của chúng. Ví dụ: CÁN BỘ có thêm thuộc tính Cấp hàm, Chức vụ và phương thức Nhập cấp hàm, Nhập chức vụ.
Biểu diễn bằng thừa kế
Cài đặt
Bài 5.	 Một lớp học cố định chỉ có 40 sinh viên:
-	Cài đặt lớp Lop có thuộc tính sosv là hằng có giá trị 40. 
-	Computer là hằng số trong thời gian chạy do Math.random khởi tạo giá trị biểu diễn số máy tính cấp nhẫu nhiên cho 1 lớp học. 
-	Lớp Lop khai báo thêm 1 thuộc tính count là static đánh số lớp hiện có. 
Hướng dẫn
Bài 6.	Trở lại cây thừa kế Người-Cán bộ. Lớp cha khai báo Nguoi khai báo biến x quản lý số người. Cứ có 1 người sinh ra sẽ tăng x lên 1 đơn vị. 
Hướng dẫn:  Cứ có một Nguoi được sinh ra tăng x lên 1 đơn vị. Trong phương thức khởi tạo của Nguoi sẽ thực hiện x++. Lớp con CanBo trong phương thức inCanBo(), thêm câu lệnh in ra giá trị của x
Cài đặt
Bài 7.	Quay trở lại với ví dụ về Lop, viết phương thức print() là static để in ra số thứ tự lớp (từ 1) từ các thể hiện và từ chính lớp Lop.  
Hướng dẫn
Bài 8.	Quan sát các phương thức doh dưới đây: 
-	Bart là lớp con của lớp Homer. 
-	Thiết kế các phương thức doh tại lớp cha, lớp con thể hiện sự ẩn danh.
Hướng dẫn
Bài 9.	Xây dựng lớp Giaovien thừa kế lớp Nguoi và nằm khác gói package với lớp Nguoi. Cài đặt lớp Giaovien tái sử dụng phương thức layTen() của lớp Nguoi. 
Hướng dẫn
Bài 10.	 Một ví dụ về upcast trong truyền tham số Instrument – Wind
Hướng dẫn
Bài 11.	 Trong cùng một lớp các phương thức trùng tên – overloading
Hướng dẫn
Bài 12.	 Minh họa khả năng của đa hình nạp chồng phương thức đứng trong định nghĩa của một phương thức này, gọi tới phương thức nạp chồng với phương thức đó. 
Hướng dẫn
Bài 13.	 Về đa hình vượt quyền. Xét phương thức vẽ draw của các lớp trong cây dưới đây:
 
Thông điệp draw gửi cho một thể hiện của mỗi lớp trên sẽ yêu cầu thể hiện đó tự vẽ chính nó.
 
Một thể hiện của Point phải vẽ một điểm, một thể hiện của Circle phải vẽ một đường tròn, và một thể hiện của Rectangle phải vẽ một hình chữ nhật.
Với đặc điểm đa hình của method overriding, ta sẽ có được điều trên, với phương thức draw được định nghĩa lại tại các lớp dẫn xuất là Circle hoặc Rectangle.
Hướng dẫn
Bài 14.	 Cây phả hệ Animal - Dog với phương thức print được định nghĩa ở lớp cha Animal và định nghĩa lại ở lớp con Dog thực hiện theo các cách khác nhau.
Hướng dẫn
Bài 15.	 Cây thừa kế Nguoi-Nhanvien-Quanly cùng có hành vi talk() nhưng mỗi lớp thực hiện một câu lệnh khác nhau. Khi thực hiện upcasting cho các kết qua khác nhau.
Hướng dẫn
Bài 16.	 Cây thừa kế các loại hình khối
 
Dùng lớp ảo để tạo lớp Hình, phương thức ảo để cài đặt các phương thức vẽ, xóa...
Hướng dẫn
Bài 17.	 Cài đặt giao diện Action cho Circle. Thiết kế trong Action các phương thức di chuyển, xóa, vẽ...
Hướng dẫn
Bài 18.	 Cài đặt giao diện Action cho lớp ảo Shape
Hướng dẫn
Bài 19.	 Lớp Hero mô tả các siêu nhân có thể đánh nhau, bơi lội hoặc là bay. Viết từng giao diện cho từng khả năng của Hero
Hướng dẫn:
III. BÀI TẬP TỰ THỰC HIỆN
Bài 1.	
a. Xây dựng lớp trừu tượng Shape có các phương thức:
-		double area(); trả về giá trị diện tích của hình.
-		double volume(); trả về giá trị thể tích của hình.
-		abstract String getName(); trả về tên của đối tượng hình học.
-		abstract void toString(); in ra màn hình giá trị các thuộc tính của đối tượng dưới dạng chuỗi.
b. Xây dựng lớp Point kế thừa lớp Shape với 2 thuộc tính x, y và các phương thức khởi tạo:
-		 Point();
-		 Point(int t) cho biết hoành độ x = t;
-		 Point(int t, int m);
-		 Các phương thức get, set giá trị các thuộc tính.
-		 Phương thức toString, getName;
c. Xây dựng lớp Square kế thừa từ lớp Point, có các thuộc tính x, y và a (chiều dài cạnh). Xây dựng:
-	 3 phương thức khởi tạo cho lớp Square.
-	 Các phương thức get, set giá trị thuộc tính.
-	 Phương thức tính chu vi hình vuông.
d. Xây dựng lớp Circle kế thừa lớp Point, có các thuộc tính: x, y, radius. Xây dựng các phương thức :
-		 Phương thức khởi tạo: Circle(); Circle(R, x, y);
-		 Các phương thức get, set giá trị thuộc tính.
-		 Phương thức area(), perimeter() tính diện tích, chu vi hình tròn.
e. Xây dựng lớp Cylinder kế thừa từ lớp Circle, có các thuộc tính x, y, r, h (chiều cao). Xây dựng các phương thức:
-		 Phương thức khởi tạo.
-	 Các phương thức get, set giá trị thuộc tính.
-		 Phương thức area(), volume() để tính diện tích và thể tích hình trụ.
f. Xây dựng lớp Test để kiểm tra tính kế thừa của các đối tượng hình học, kiểm tra các phương thức của các lớp đã tạo.
Bài 2.	
a. Xây dựng lớp trừu tượng như sau:
	abstract class Hinh{
		abstract public float getArea();
}
b. Xây dựng lớp HinhVuong, HinhTron, HinhTamGiac bằng cách kế thừa từ lớp Hinh và ghi đè phương thức getArea() để tính diện tích của các hình tương ứng.
Bài 3.	
a. Xây dựng lớp DaySo để mô tả một dãy số, gồm các phương thức sau:
-	 Phương thức nhap để nhập dãy số từ bàn phím.
-	 Phương thức print để in dãy số ra màn hình.
-	 Hàm tạo DaySo(int n) dùng để khởi tạo một mảng gồm n phần tử.
b. Xây dựng giao diện Sort như sau:
	interface Sort{
		public void Sort();
	}
c. Xây dựng các lớp BubbleSort, SelectionSort, InsertionSort bằng cách kế thừa từ lớp DaySo và thực thi giao diện Sort để thực hiện việc sắp xếp.
Bài 4.	Xây dựng lớp trừu tượng A, có phương thức trừu tượng inRa() và phương thức in() in các số từ 0 đến 9 ra màn hình.
-	Xây dựng 2 lớp B, C kế thừa từ lớp A, ghi đè phương thức inRa();
-	 Với lớp B, phương thức inRa() in ra màn hình dòng chữ “Day la lop B”.
-	 Với lớp C, phương thức inRa() in ra màn hình dòng chữ “Day la lop C”.
-	Phương thức main() của lớp B và lớp C gọi sử dụng 2 phương thức in() và inRa();
Bài 5.	
a) Xây dựng lớp “DaySo” để mô tả một dãy số, gồm các phương thức sau: 
-	 Phương thức “nhap” dùng để nhập dãy số từ bàn phím. 
-	 Phương thức “print” dùng để in dãy số ra màn hình.
-	 Hàm tạo DaySo(int n) dùng để khởi tạo một mảng gồm n phần tử.
 b) Xây dựng giao diện Sort như sau: 
interface Sort{ 
		public void Sort(); 
} 
 c) Xây dựng các lớp “QuickSort”, “BubbleSort”, “SelectionSort”, “InsertSort” bằng cách kế thừa từ lớp DaySo và triển khai giao diện Sort để thực hiệp việc sắp xếp: nổi bọt, chọn trực tiếp, chèn trực tiếp. 
Bài 6.	
a) Xây dựng lớp trừu tượng “Sort” như sau: 
abstract class Sort extends DaySo{ 
		abstract public void sapXep(); 
} 
trong đó lớp DaySo được xây dựng trong Câu 5.
b) Xây dựng các lớp “QuickSort”, “BubbleSort”, “SelectionSort”, “InsertionSort” bằng cách kế thừa từ lớp Sort để thực hiệp việc sắp xếp: nổi bọt, chọn trực tiếp, chèn trực tiếp.

