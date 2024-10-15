package com.chi;

import java.util.Scanner;

public class Java5w {
    public static void main(String[] args) {
//        Viết một chương trình Java để thực hành khai báo, khởi tạo và sử dụng các biến. Chương trình sẽ thực hiện các bước sau:
//
//        Khai báo các biến với các kiểu dữ liệu khác nhau (int, double, char, boolean, và String).
//        Khởi tạo các biến với các giá trị cụ thể.
//        Thực hiện các phép toán cơ bản với các biến.
//        In kết quả ra màn hình.

        int age = 20;
        double price = 100.5;
        char name = 'N';
        boolean isChecked = true;
        String fullName = "Luu Chan Nam";
//        Scanner scanner = new Scanner(System.in);
//
//        int mu = scanner.nextInt();

        double sum = age + price;
        double divide = price / age;
        int subtract = (int) (price - age);
        int multiple = (int) (age * price);
        System.out.println("tong la: " + sum);
        System.out.println("chia la: " + divide);
        System.out.println("hieu la" + subtract);
        System.out.println("nhan la: " + multiple);

//        Phát triển chương trình sử dụng 02 biến cùng loại (02 biến int, 02 biến double, 02 biến boolean, 02 biến String) để thực hiện các yêu cầu sau:
//
//        Sử dụng các phép toán so sánh (==, !=, >, <, >=, <=) với các biến số nguyên và số thực.
//        Sử dụng các phép toán logic (&&, ||, !) với các biến boolean.
//                Sử dụng các phép toán cộng chuỗi với biến kiểu String.
//        In kết quả của các phép to

        int age1 = 20;
        int age2 = 25;

        double price1 = 100.5;
        double price2 = 200;

        char name1 = 'N';
        char name2 = 'L';

        boolean isChecked1 = true;
        boolean isChecked2 = false;

        String fullName1 = "Luu Chan Nam";
        String fullName2 = "Vu Thi Kim Chi";
// Phep so sanh
        System.out.println(age1==age2);
        System.out.println(age1>=age2);
        System.out.println(age1<=age2);
        System.out.println(age1>age2);
        System.out.println(age1<age2);
        System.out.println(age1!=age2);
// Phep so sanh
        System.out.println(age1==age2 && age1 == price1);
        System.out.println(price2>=age2 || name1 != name2);
        System.out.println(!isChecked1);
        System.out.println(fullName1 + " " + fullName2);

    }
}
