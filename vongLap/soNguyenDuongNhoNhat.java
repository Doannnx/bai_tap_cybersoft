package vongLap;

public class soNguyenDuongNhoNhat {

	public soNguyenDuongNhoNhat() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int num=0 ;
		int sum = 0 ;		
		for (int i = 0; sum <10000; i++) {
			
			num++;
			sum += num;
			
		}
		System.out.println("so nho nhat " + num);
		System.out.println("sum" + sum);
	}
}
