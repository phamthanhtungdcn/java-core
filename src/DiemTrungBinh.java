import java.util.InputMismatchException;
import java.util.Scanner;

public class DiemTrungBinh {
    private static double diemToan = 0;
    private static double diemVan = 0;
    private static double diemAnh = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 📐 UNG DUNG TINH DIEM TRUNG BINH ===");
        nhapDiemSo();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tinh diem trung binh");
            System.out.println("2. Nhap lai diem");
            System.out.println("3. Thoat");
            System.out.print("👉 Chon chuc nang (1-3): ");

            int choice;
            try{
                choice = scanner.nextInt();
            } catch(InputMismatchException e){
                System.out.println("❌ Loi: Vui long nhap so 1-3!");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    double diemTrungBinh = tinhDiemTrungBinh(diemToan, diemVan, diemAnh);
                    if(diemTrungBinh >= 8){
                        System.out.printf("✅ Diem trung binh: %.2f, Xep loai gioi \n", diemTrungBinh);
                    } else if(diemTrungBinh >= 6.5){
                        System.out.printf("✅ Diem trung binh: %.2f , Xep loai kha\n", diemTrungBinh);
                    } else if (diemTrungBinh >= 5.0) {
                        System.out.printf("✅ Diem trung binh: %.2f , Xep loai trung binh\n", diemTrungBinh);
                    } else {
                        System.out.printf("✅ Diem trung binh: %.2f , Xep loai yeu\n", diemTrungBinh);
                    }

                    break;
                case 2:
                    nhapDiemSo();
                    break;
                case 3:
                    System.out.print("👋 Tam biet, hen gap lai!");
                    return;
                default:
                    System.out.println("❌ Lua chon khong hop le!");
            }
        }
    }

    public static double tinhDiemTrungBinh(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    public static void nhapDiemSo() {
        while (true) {
            try {
                System.out.println("Nhap diem Toan: ");
                diemToan = scanner.nextDouble();

                System.out.println("Nhap diem Van: ");
                diemVan = scanner.nextDouble();

                System.out.println("Nhap diem Anh: ");
                diemAnh = scanner.nextDouble();

                if (diemToan < 0 || diemVan < 0 || diemAnh < 0) {
                    System.out.println("❌ Diem so khong the nho hon 0! Moi nhap lai");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("❌ Loi: Vui long nhap so");
                scanner.nextLine();
            }
        }
    }
}
