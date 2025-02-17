package vongLap;

import java.util.Scanner;

public class tinhSoNamDoi {

	public tinhSoNamDoi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		float soTienGui, soTienMuon, laiSuat;
		int namDoi = 0;
		
		Scanner nhap= new Scanner(System.in);
		
		System.out.println("Vui long nhap so tien gui(tr) vao");
		soTienGui = Float.parseFloat(nhap.nextLine());
		
		System.out.println("vui long nhap so tien mong muon(tr) vao");
		soTienMuon = Float.parseFloat(nhap.nextLine());
		
		System.out.println("vui long nhap lai suat gui(%) tu 0-100 vao");
		laiSuat = Float.parseFloat(nhap.nextLine())/100;
		
		
		/**do {
			if (soTienGui < soTienMuon) {
				soTienGui *= (1+ laiSuat);
				namDoi++;
			}else {
				System.out.println("So nam it nhat can phai doi la" + namDoi);
			}
		} while (true);**/
		
		while (soTienGui<soTienMuon) {
			soTienGui = soTienGui * (1 + laiSuat);
			namDoi ++;
		}
		System.out.println("So nam it nhat can phai doi la " + namDoi);
	}
	

}
