package view;

import model.Student;
import thread.Exit;

import java.util.InputMismatchException;
import java.util.Scanner;

import static jdk.jfr.internal.instrument.JDKEvents.remove;
import static view.MenuSort.studentList;

public class Menu {

    static Scanner scanner = new Scanner(System.in);

    public Menu() {
        startMenu();
    }

    public static void startMenu() {
        try {
            boolean flag = true;
            do {
                mainMenu();
                StudentView studentView = new StudentView();
                String num = scanner.nextLine();
                switch (num) {
                    case "1":
                        studentView.showStudent();
                        break;
                    case "2":
                        StudentView.add();
                        break;
                    case "3":
                        StudentView.update();
                        break;
                    case "4":
                        StudentView.remove();
                        break;
                    case "5":
                        MenuSort.option();
                        break;
                    case "0":
                        System.out.println("Hen gap lai lan sau!");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Không hợp lệ. Vui lòng nhập lại");
                        flag = false;
                }
            } while (!flag);
        } catch (InputMismatchException io) {
            io.printStackTrace();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }


    public static void mainMenu() {

        System.out.print("╔══════════════════════════════════════════════════════════════════╗\n" +
                "║                                                                  ║\n" +
                "║                       QUẢN LÝ SINH VIÊN                          ║\n" +
                "║                                                                  ║\n" +
                "║               [1] Hiển thị danh sách sinh viên                   ║\n" +
                "║               [2] Thêm sinh viên mới                             ║\n" +
                "║               [3] Cập nhật danh sách sinh viên                   ║\n" +
                "║               [4] Xóa sinh viên khỏi danh sách                   ║\n" +
                "║               [5] Hiển thị sắp xếp sinh viên                     ║\n" +
                "║               [0] Thoát chương trình                             ║\n" +
                "║                                                                  ║\n" +
                "╚══════════════════════════════════════════════════════════════════╝\n");
        System.out.printf("Chọn chức năng  \n➨ \t");
    }

    public static void exit() {
        Exit exit = new Exit();
        Thread thread1 = new Thread(exit);
        thread1.start();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print("\t\t Bạn vừa thoát khỏi chương trình");
        System.exit(0);
    }

    public static void inputUpdate() {
        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
        System.out.println("✷    1. Cập nhật họ tên sinh viên       ✷");
        System.out.println("✷    2. Cập nhật tuổi của sinh viên     ✷");
        System.out.println("✷    3. Cập nhật giới tính sinh viên    ✷");
        System.out.println("✷    4. Cập nhật địa chỉ                ✷");
        System.out.println("✷    5. Cập nhật điểm trung bình        ✷");
        System.out.println("✷    0. Quay lại                        ✷");
        System.out.println("✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷✷");
        System.out.println("Chọn chức năng");
        System.out.printf("➨ \t");
    }

    public static void removeConfirm() {
        System.out.println("❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂");
        System.out.println("❂                  BẠN CHẮC CHẮN MUỐN XÓA            ❂");
        System.out.println("❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂");
        System.out.println("❂                                                    ❂");
        System.out.println("❂              1. Nhấn y để xác nhận xóa             ❂");
        System.out.println("❂              2. Nhấn c để quay lại                 ❂");
        System.out.println("❂                                                    ❂");
        System.out.println("❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂❂");
        System.out.printf("➨ \t");
    }
}
