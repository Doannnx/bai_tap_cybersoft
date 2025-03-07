package mangMotChieu;

import java.util.Scanner;

public class luyThuaCuaBa {

	public luyThuaCuaBa() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner nhap = new Scanner(System.in) ;
		int n = nhapN(nhap);
		int a[] = taoMang(nhap, n);
		xuatMang(a);
		lietKe(a); 


	}
	
	public static int nhapN(Scanner nhap) {
		int n;
		do {
			System.out.println("nhapN");
			n = Integer.parseInt(nhap.nextLine());
		} while (n<1);
		return n;
	}
	
	public static int[] taoMang(Scanner nhap, int n) {
		int a []= new int [n];
		
		for (int i = 0; i < a.length; i++) {
			System.out.println("a [" +i+"]");
			a[i]= Integer.parseInt(nhap.nextLine());
		}
		return a;
	}
	
	public static void xuatMang(int a[]) {
		for(int item:a) {
			System.out.print(item + "\t");
		}
	}
	
	public static boolean checkLuyThua(int x ) {
		if (x%3==0) {
			return true;
		}
		return false;
	}
	
	public static void lietKe(int a[]) {
		System.out.println("\nDanh sach cac gia tri la luy thua cua 3 la:");
		for (int i = 0; i < a.length; i++) {
			if (checkLuyThua(a[i])) {
				System.out.print(a[i] + "\t");
			}else {
				System.out.println("Mang khong co gia tri luy thua cua 3");
			}
		}
	}
	

}
