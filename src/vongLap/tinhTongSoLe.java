package vongLap;
import java.util.Scanner;

public class tinhTongSoLe {

	public tinhTongSoLe() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int num ;
		int sum = 0;
		Scanner nhap= new Scanner(System.in);
		
		System.out.println("Nhập số nguyên lớn hơn 0:");
		num = Integer.parseInt(nhap.nextLine());
		
		if (num >0) {
			for (int i = 1; i <= num; i+=2) {
				sum += i;
			}
		}else {
			System.out.println("Vui lòng nhập lại");
		}
		System.out.println("Tổng các số bé hơn " +num+" là: " +sum);

	}

}
