package maytinhbotui;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double soThuNhat, soThuHai, ketQua;
        char phepToan;

        System.out.print("Nhập số thứ nhất: ");
        soThuNhat = scanner.nextDouble();

        System.out.print("Nhập số thứ hai: ");
        soThuHai = scanner.nextDouble();

        System.out.print("Chọn phép toán (+, -, *, /): ");
        phepToan = scanner.next().charAt(0);

        switch (phepToan) {
            case '+':
                ketQua = soThuNhat + soThuHai;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '-':
                ketQua = soThuNhat - soThuHai;
                System.out.println("Kết quả: " + ketQua);
                break;

            case '*':
                ketQua = soThuNhat * soThuHai;
                System.out.println("Kết quả: " + ketQua);
                break;
            case '/':
                if (soThuHai == 0) {
                    System.out.println("Lỗi: Không thể chia cho 0!");
                } else {
                    ketQua = soThuNhat / soThuHai;
                    System.out.println("Kết quả: " + ketQua);
                }
                break;
            default:
                System.out.println("Lỗi: Phép toán không hợp lệ!");
        }

        scanner.close();
    }
}
