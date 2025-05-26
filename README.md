# Bài tập thực hành kiểm thử với JUnit

## Mô tả bài toán
Xây dựng lớp `StudentAnalyzer` trong Java để xử lý danh sách điểm số học sinh. Chương trình cần:
- Đếm số học sinh đạt loại Giỏi (điểm ≥ 8.0)
- Tính điểm trung bình các điểm hợp lệ (0–10)
- Bỏ qua các giá trị không hợp lệ như < 0 hoặc > 10

## Mục tiêu
- Hiểu và triển khai điều kiện lọc và vòng lặp trong Java
- Viết kiểm thử đơn vị bằng JUnit 5
- Sử dụng GitHub để quản lý mã nguồn và theo dõi tiến độ qua Issues/Commits

## Các chức năng chính
| Phương thức | Mô tả |
|------------|-------|
| `countExcellentStudents(List<Double> scores)` | Trả về số lượng học sinh giỏi với điểm hợp lệ |
| `calculateValidAverage(List<Double> scores)` | Tính điểm trung bình hợp lệ trong khoảng 0–10 |

## Kiểm thử với JUnit
Đã viết test case kiểm thử các tình huống:
- Danh sách có cả điểm hợp lệ và không hợp lệ
- Danh sách rỗng
- Giá trị biên (0 và 10)
- Dữ liệu không hợp lệ (< 0 hoặc > 10)

## Công nghệ sử dụng
- Java 8 trở lên
- JUnit 5 (Jupiter)
- Git & GitHub
- IDE: IntelliJ IDEA 


### Chạy kiểm thử JUnit
1. Đảm bảo JUnit 5 đã được khai báo trong project 
2. Mở file `StudentAnalyzerTest.java` trong thư mục `test/`
3. Nhấn chuột phải → **Run Tests** hoặc dùng phím tắt IDE (Shift + F10)

## Tác giả
- Họ tên: Nguyễn Phương Thảo
- MSSV: BIT220144
- Lớp: 22IT-SE2

## Đánh giá độ bao phủ mã kiểm thử
1. Đã phát hiện và xử lý 4 vấn đề:
- Issue #1: Xử lý null input.
- Issue #2: Bổ sung kiểm thử giá trị cận (precision).
- Issue #3: Đo và ghi nhận coverage vào README.md.
- Issue #4: Cải tiến đặt tên và tách nhỏ kiểm thử.

2. Kết quả đo code coverage (sử dụng IntelliJ IDEA):
- Statement Coverage: 100%


✅ Mã kiểm thử đơn vị hoàn thiện và có độ bao phủ toàn diện.
