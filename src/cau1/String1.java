package cau1;

import java.util.Scanner;

public class String1 {
    //Cau 1 phan 1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chuoi: ");
        String str = sc.nextLine().trim().toLowerCase();
        String res = "";
        if (!str.isEmpty()) {
            res += Character.toUpperCase(str.charAt(0));
            for (int i = 1; i < str.length(); i++) {
                char c1 = str.charAt(i - 1);
                char c2 = str.charAt(i);
                // Bo khoang trang thua
                if (c1 == ' ' && c2 == ' ') {
                    continue;
                }
                // In hoa chu dau
                if (c1 == ' ') {
                    c2 = Character.toUpperCase(c2);
                }
                res += c2;
            }
            System.out.println("Chuoi sau khi chuan hoa: " + res);
        } else {
            System.out.println("Chuoi rong");
        }
        sc.close();
    }

}
