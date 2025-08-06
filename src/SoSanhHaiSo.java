import java.util.InputMismatchException;
import java.util.Scanner;

public class SoSanhHaiSo {
    private static double soThuNhat = 0;
    private static double soThuNhi = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== 📐 ỨNG DỤNG SO SANH HAI SO ===");

        while (true){
            try{
                System.out.print("Nhap so thu nhat: ");
                soThuNhat = scanner.nextDouble();

                System.out.print("Nhap so thu nhi: ");
                soThuNhi = scanner.nextDouble();

                if(soThuNhat == soThuNhi){
                    System.out.println("Hai so bang nhau");
                } else {
                    System.out.println("Hai so khong bang nhau");

                    if(soThuNhat > soThuNhi){
                        System.out.println("So thu nhat lon hon so thu hai");
                    } else {
                        System.out.println("So thu nhat nho hon so thu hai");
                    }
                }
                break;

            } catch (InputMismatchException e){
                System.out.println("❌ Vui long nhap dung dinh dang so.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }
}
