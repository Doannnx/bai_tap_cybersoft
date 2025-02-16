package vongLap;


import java.util.Scanner;

public class tinhGiaiThua {

	public tinhGiaiThua() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int n;
		int giaiThua= 1;
		
		Scanner nhap= new Scanner(System.in);
		
		System.out.println("Vui long nhap so n vao");
		n = Integer.parseInt(nhap.nextLine());
		
		for (int i = 1; i <= n; i++) {
			giaiThua *= i;
			System.out.println(giaiThua);
		}
		
		System.out.println("Giai thua "+n+"! la: " +giaiThua);

	}

}
