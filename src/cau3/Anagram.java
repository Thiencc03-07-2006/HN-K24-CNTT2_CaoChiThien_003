package cau3;

import java.util.Scanner;

public class Anagram {
    //Cau 3
    public static boolean check(char[] arr, int n, char value) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine().trim().toLowerCase();
        String str2 = sc.nextLine().trim().toLowerCase();
        int n1 = str1.length();
        int n2 = str2.length();
        int k = 0;
        char[] chars = new char[Math.max(n1, n2)];
        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            if (c1 == ' ') continue;
            if (!check(chars, k, c1)) {
                chars[k] = c1;
            }
        }
        boolean check = true;
        for (int i = 0; i < k; i++) {
            int count1 = 0;
            int count2 = 0;
            for (int j = 0; j < n1; j++) {
                char c1 = str1.charAt(j);
                if (chars[i] == c1) {
                    count1++;
                }
            }
            for (int j = 0; j < n2; j++) {
                char c1 = str2.charAt(j);
                if (chars[i] == c1) {
                    count2++;
                }
            }
            if (count1 != count2) {
                check = false;
                break;
            }
        }
        if (check && k > 0) {
            System.out.println("Hai chuoi la Anagram");
        } else {
            System.out.println("Hai chuoi khong phai la Anagram");
        }
        sc.close();
    }
}
