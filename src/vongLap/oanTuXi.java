package vongLap;


import java.util.Scanner;

public class oanTuXi {

	public oanTuXi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Vui long chon 0-3");
		xuLy(scan);
		
	}
	
	public static String player(int number) {
		int num = number ;
	  String player = ""; {
			String choice = "" ;
			switch (num) {
			case 1:
				choice = "Keo";
				break;
			case 2:
				choice = "Bua";
				break;
			case 3:
				choice = "Bao";
				break;
			}return choice;
		}
	}
	
	
	public static String bot() {
		String choice= "";
		
		int bot = (int) (Math.random()*3);
		
		if (bot == 1) {
			choice ="Keo";
		}else if (bot == 2) {
			choice = "Bua";
		}else {
			choice ="Bao";
		}
		return choice;
	}
	
	public static void xuLy(Scanner scan) {
		 int num ;
		 int playerPoint = 0;
		 int botPoint = 0;
		 boolean flag = true;
		 
		 do {
			 System.out.println("1.Keo");
				System.out.println("2.Bua");
				System.out.println("3.Bao");
				System.out.println("0.Nghi choi");
				num = Integer.parseInt(scan.nextLine());
				String player = player(num);
				
			 if (num > 0 && num <4) {
				 System.out.println("Player: " + player);
				 System.out.println("Bot: " + bot());
				if (player.equals(bot()) ) {
					System.out.println("Ca hai cung chon " + player );
					System.out.println("============================");
				}else if (player.equals("Keo") && bot().equals("Bao") || player.equals("Bao") && bot().equals("Bua") || player.equals("Bua") && bot().equals("Keo")) {
					System.out.println("Nguoi choi thang");
					System.out.println("============================");
					playerPoint ++;
				}else {
					System.out.println("AI thang");
					System.out.println("============================");
					botPoint ++;	
				}
			 
			}else if (num<0 || num >4) {
				System.out.println("Vui long nhap lai");
			}
			 else if(num==0) {
				flag = false;
			}
			
		} while (flag);
		 System.out.println("Ty so la nguoi choi: (" + playerPoint+ ") AI : ("+ botPoint +")" );
			if (playerPoint > botPoint) {
				System.out.println("Nguoi choi thang nhieu nhat");
			}else if (playerPoint < botPoint) {
				System.out.println("AI thang nhieu nhat");
			}else {
				System.out.println("Hoa");
			}
	}
}
