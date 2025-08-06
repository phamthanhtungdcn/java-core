import java.util.InputMismatchException;
import java.util.Scanner;

public class HinhChuNhat {
    private static double dai = 0;
    private static double rong = 0;
    private static Scanner scanner =  new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 📐 ỨNG DỤNG TÍNH HÌNH CHỮ NHẬT ===");
        nhapKichThuoc();

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tinh dien tich");
            System.out.println("2. Tinh chu vi");
            System.out.println("3. Tinh duong cheo");
            System.out.println("4. Đoi chieu dai va chieu rong");
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
                    System.out.printf("✅ Dien tich: %.2f\n ", tinhDienTich(dai, rong));
                    break;
                case 2:
                    System.out.printf("✅ Chu vi: %.2f\n", tinhChuVi(dai, rong));
                    break;
                case 3:
                    System.out.printf("✅ Duong cheo: %.2f\n", tinhDuongCheo(dai, rong));
                    break;
                case 4:
                    nhapKichThuoc();
                    break;
                case 5:
                    System.out.println("👋 Tam biet, hen gap lai!");
                    return;
                default:
                    System.out.println("❌ Lua chon khong hop le!");
            }
        }
    }

    public static double tinhDienTich(double dai, double rong){
        return dai * rong;
    }

    public static double tinhChuVi(double dai, double rong){
        return (dai + rong) * 2;
    }

    public static double tinhDuongCheo(double dai, double rong){
        return Math.sqrt(dai * dai + rong * rong);
    }

    public static void nhapKichThuoc(){
        while(true){
            try{
                System.out.println("Nhap chieu dai :");
                dai = scanner.nextDouble();

                System.out.println("Nhap chieu rong :");
                rong = scanner.nextDouble();

                if(dai <= 0 || rong <= 0){
                    System.out.println("❌ Chieu dai va chieu rong phai lon hon 0! Vui long nhap lai.");
                } else{
                    break;
                }
            } catch (InputMismatchException e){
                System.out.println("❌ Loi: Vui long nhap so");
                scanner.nextLine();
            }
        }

    }
}
