import java.util.ArrayList;
import java.util.Scanner;

public class SoChanLe {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lichSu = new ArrayList<>();

        System.out.println("=== 📐 UNG DUNG KIEM TRA SO CHAN LE ===");
        System.out.println("Nhập số nguyên để kiểm tra.");
        System.out.println("Nhập 'q' để thoát chương trình.\n");

        while (true){
            System.out.print("Nhap so: ");
            String input  = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("\n📜 Lịch sử các số đã nhập:");
                if(lichSu.isEmpty()){
                    System.out.println("Khong co du lieu");
                } else {
                    for (String record : lichSu) {
                        System.out.println(record);
                    }
                }

                System.out.println("👋 Tạm biệt! Chương trình kết thúc.");
                break;
            }

            try{
                int soNhap = Integer.parseInt(input);

                String ketQua;
                if(soNhap % 2 == 0){
                    ketQua = "CHAN";
                } else {
                    ketQua = "LE";
                }

                lichSu.add("Số " + soNhap + " là số " + ketQua);

                System.out.println("➡ Số " + soNhap + " là số " + ketQua);
            } catch (NumberFormatException e){
                System.out.println("❌ Vui lòng nhập số nguyên hợp lệ hoặc 'q' để thoát.");
            }
        }

        scanner.close();
    }
}
