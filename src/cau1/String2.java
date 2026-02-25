package cau1;

import java.util.Scanner;

public class String2 {
    //Cau 1 phan 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean checkSpace = true;
        boolean checkA = false;
        boolean checkDot = false;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // Kiem tra khoang trang
            if (c == ' ') {
                checkSpace = false;
                break;
            }
            // Kiem tra @
            if (c == '@' && !checkA) {
                checkA = true;
            } else if (c == '@' && checkA) {
                checkA = false;
                break;
            }
            // Kiem tra .
            if (c == '.' && checkA) {
                checkDot = true;
            }
        }
        if (checkSpace && checkDot && checkA) {
            System.out.println("Email hop le");
        } else {
            System.out.println("Email khong hop le");
        }
    }
}
