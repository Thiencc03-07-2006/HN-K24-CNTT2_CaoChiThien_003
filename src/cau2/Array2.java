package cau2;

import java.util.Scanner;

public class Array2 {
    //Cau 2 phan 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mời nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Mời nhập vào giá trị phần tử thứ %d: ", i + 1);
            num[i] = sc.nextInt();
        }
        int start = 0;
        int leng = 0;
        int index = 0;
        int k = 0;
        //Tim doan dai nhat
        for (int i = 0; i < n - 1; i++) {
            if (num[i] + 1 == num[i + 1]) {
                k++;
            } else {
                if (k > leng) {
                    start = index;
                    leng = k;
                }
                index = i + 1;
                k = 0;
            }
        }
        System.out.println("Do dai: " + (leng + 1));
        System.out.print("Doan tang dai nhat: ");
        for (int i = start; i < start + leng + 1; i++) {
            System.out.print(num[i] + " ");
        }
        System.out.println("\nTu vi tri: " + start + " den " + (start + leng));
        sc.close();
    }
}
