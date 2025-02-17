package vongLap;

import java.util.Scanner;

public class tamGiac {

	public tamGiac() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Nhập chiều cao của tam giác: ");
		        int n = scanner.nextInt();

		        System.out.println("Tam giác đặc:");
		        printSolidTriangle(n);

		        System.out.println("\nTam giác rỗng:");
		        printHollowTriangle(n);
		    }

		    // Hàm in ra tam giác đặc
		    public static void printSolidTriangle(int n) {
		        for (int i = 1; i <= n; i++) {
		            for (int j = 1; j <= n - i; j++) {
		                System.out.print(" ");
		            }
		            for (int j = 1; j <= 2 * i - 1; j++) {
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		    }

		    // Hàm in ra tam giác rỗng
		    public static void printHollowTriangle(int n) {
		        for (int i=1; i <=n; i++ ) {
		        	for(int j =1; j <= 2*n-1;j++) {
		        		if(i ==n|| j == n-i+1 || j== n+i-1) {
		        			System.out.print("*");
		        		}else {
							System.out.print(" ");
						}
		        	}
		        System.out.println( );	
		        }
		    }

}
