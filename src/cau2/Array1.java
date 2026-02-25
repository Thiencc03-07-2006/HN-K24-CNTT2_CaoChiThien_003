package cau2;

import java.util.Scanner;

public class Array1 {
    //Cau 2 phan 1
    //Kiem tra ton tai
    public static boolean check(int[] arr, int n, int value) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        int k = 0;
        int[] num = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Mời nhập vào giá trị phần tử thứ %d: ", i + 1);
            num[i] = sc.nextInt();
        }
        // Check trung
        for (int i = 0; i < n; i++) {
            if (!check(res, k, num[i])) {
                res[k] = num[i];
                k++;
            }
        }
        System.out.print("Mang sau khi loai bo trung: ");
        for (int i = 0; i < k; i++) {
            System.out.print(res[i] + " ");
        }
        sc.close();
    }
}
