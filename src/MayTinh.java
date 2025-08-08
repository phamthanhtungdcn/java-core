import java.util.InputMismatchException;
import java.util.Scanner;

public class MayTinh {
    private static double so1;
    private static double so2;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 📐 UNG DUNG MAY TINH DON GIAN ===");
        nhapSo();

        while(true){
            System.out.println("\n===== MENU =====");
            System.out.println("1. Phep cong");
            System.out.println("2. Phep tru");
            System.out.println("3. Phep nhan");
            System.out.println("4. Phep chia");
            System.out.println("5. Thoat");
            System.out.print("👉 Chon chuc nang (1-5): ");

            int choice;
            try{
                choice = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("❌ Loi: Vui long nhap so 1-5!");
                scanner.nextLine();
                continue;
            }

            switch (choice){
                case 1:
                    System.out.println("Ket qua phep cong la: " + tinhCong(so1, so2));
                    break;
                case 2:
                    System.out.println("Ket qua phep tru la: " + tinhTru(so1, so2));
                    break;
                case 3:
                    System.out.println("Ket qua phep nhan la: " + tinhNhan(so1, so2));
                    break;
                case 4:
                    System.out.println("Ket qua phep chia la: " + tinhChia(so1, so2));
                    break;
                case 5:
                    System.out.println("Ket thuc chuong trinh, tam biet!");
                    return;
                default:
                    System.out.println("Vui long nhap dung chuc nang");
            }
        }


    }

    public static double tinhCong(double so1, double so2){
        return so1 + so2;
    }

    public static double tinhTru(double so1, double so2){
        return so1 - so2;
    }

    public static double tinhNhan(double so1, double so2){
        return so1 * so2;
    }

    public static double tinhChia(double so1, double so2){
        return so1 / so2;
    }

    public static void nhapSo(){
        try {
            System.out.print("Nhap so thu nhat: ");
            so1 = scanner.nextDouble();

            System.out.print("Nhap so thu hai: ");
            so2 = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("❌ Vui lòng nhập số hợp lệ");
        }
    }
}
