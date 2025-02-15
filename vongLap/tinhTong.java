package vongLap;

import java.util.Scanner;

public class tinhTong {

	public tinhTong() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n = 0 ;
		int x = 0;
		long s = 0 ;
		Scanner nhap= new Scanner(System.in);
		
		System.out.println("Vui long nhap so n vao");
		n = Integer.parseInt(nhap.nextLine());
		System.out.println("Vui long nhap so x vao");
		x = Integer.parseInt(nhap.nextLine());

		for (int i = 1; i <= n; i++) {
            long dem = 1;
            for (int j = 1; j <= i; j++) {
                dem *= x; // Tính lũy thừa x^i
            }
            s += dem; // Cộng vào tổng
            
        }
			
		
		System.out.println("Tong cua n = " +n+" x = "+x+ " là: " +s);
	}

}
