package ra.run;

import java.util.Scanner;

import ra.entity.Laptop;
import ra.entity.LaptopType;

public class Main {
    public static LaptopType[] types;
    private static int laptopTypeCount = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {

            System.out.println("******************LAPTOP-MANAGEMENT******************\n");
            System.out.print("1. Quản lý loại laptop\n");
            System.out.print("2. Quản lý laptop\n");
            System.out.print("3. Thoát\n");
            System.out.print("Lựa chọn của bạn:");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    laptopTypeMenu();
                    break;
                case 2:
                    laptopMenu();
                    break;
                case 3:
                    System.out.println("Thoát chương trình");
//                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
            if (choice == 3) {
                break;
            }
        }
    }

    private static void laptopTypeMenu() {
        while (true) {
            System.out.println(
                    "***************LAPTOP_TYPE-MENU***************\n" +
                            "1. Hiển thị danh sách các loại laptop \n" +
                            "2. Thêm mới loại laptop \n" +
                            "3. Cập nhật thông tin loại laptop \n" +
                            "4. Xóa loại Laptop \n" +
                            "5. Thoát\n" +
                            "Lựa chọn của bạn:");
            Scanner sc = new Scanner(System.in);
//            System.out.println("Nhập số vào để thực hiện hành một trong những hành động trên ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                   displayLaptopType();
                    break;
                case 2:
                   addLaptopType(sc);
                    break;
                case 3:
                  updateLaptopType(sc);
                    break;
                case 4:
                    deleteLaptopType(sc);
                    break;
                case 5:
                   System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }


    private static void laptopMenu() {
        while (true) {
            System.out.println(
                    "***************LAPTOP-MENU***************\n" +
                            "1. Danh sách Laptop \n" +
                            "2. Thêm mới Laptop\n" +
                            "3. Cập nhật thông tin Laptop \n" +
                            "4. Xóa Laptop\n" +
                            "5. Thống kê số lượng laptop theo từng loại\n" +
                            "6. Thoát\n" +
                            "Lựa chọn của bạn:"
            );
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập số vào để thực hiện hành một trong những hành động trên ");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
//                    displayLaptop();
                    break;
                case 2:
//                   addLaptop(sc);
                    break;
                case 3:
//                    updateLaptop(sc);
                    break;
                case 4:
//                    deleteLaptop(sc);
                    break;
                case 5:
//                    thongke();
                    break;
                case 6:
                  System.out.println("Thoát chương trình");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    public static void displayLaptopType() {
        if (laptopTypeCount == 0 || types == null) {
            System.out.println("Chưa có loại laptop nào.");
            return;
        }
        for (int i = 0; i < laptopTypeCount; i++) {
            System.out.println("---------- Loại laptop " + (i + 1) + " ----------");
            types[i].displayData();
            System.out.println("---------------------------------");
        }
    }

    public static void addLaptopType(Scanner scanner) {
        if (types == null) {
            types = new LaptopType[5];
        }
        if (laptopTypeCount == types.length) {
            // If array is full, resize it
            LaptopType[] newArray = new LaptopType[types.length + 5];
            System.arraycopy(types, 0, newArray, 0, types.length);
            types = newArray;
        }
        LaptopType laptopType = LaptopType.inputData();
        if (laptopType != null) {
            types[laptopTypeCount++] = laptopType;
            System.out.println("Loại laptop đã được thêm vào danh sách.");
        } else {
            System.out.println("Không thể thêm loại laptop do dữ liệu không hợp lệ.");
        }
    }

    public static void updateLaptopType(Scanner scanner) {
        if (laptopTypeCount == 0 || types == null) {
            System.out.println("Chưa có loại laptop nào để cập nhật.");
            return;
        }
        System.out.print("Nhập mã loại laptop cần cập nhật: ");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < laptopTypeCount; i++) {
            if (types[i].getTypeId() == id) {
                System.out.println("Thông tin loại laptop hiện tại:");
                types[i].displayData();
                System.out.println("Nhập thông tin mới:");
                types[i].updateData();
                System.out.println("Cập nhật thông tin thành công.");
                types[i].displayData();
                return;
            }
        }
        System.out.println("Không tìm thấy loại laptop với mã số này.");
    }

    public static void deleteLaptopType(Scanner scanner) {
        if (laptopTypeCount == 0 || types == null) {
            System.out.println("Chưa có loại laptop nào.");
            return;
        }
        System.out.print("Nhập mã laptop cần xóa: ");
        int id = Integer.parseInt(scanner.nextLine());
        int deleteIndex = -1;
        for (int i = 0; i < laptopTypeCount; i++) {
            if (types[i].getTypeId() == id) {
                deleteIndex = i;
                break;
            }
        }
        if (deleteIndex == -1) {
            System.out.println("Không tìm thấy mã laptop để xóa.");
            return;
        }
        for (int i = deleteIndex; i < laptopTypeCount - 1; i++) {

            types[i] = types[i + 1];
    }
    laptopTypeCount--;
        for (int i = 0; i < laptopTypeCount; i++) {
        types[i].setTypeId(i + 1);
    }
    LaptopType.nextId = laptopTypeCount + 1;
        System.out.println("Xóa thành công!");
}
    }

