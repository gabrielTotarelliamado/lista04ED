package view;

import java.util.Scanner;

import controller.exc03con;

public class principal {

	public static void main(String[] args) throws Exception {
		exc03con exc03con = new exc03con();
		Scanner sc = new Scanner(System.in);
		
		int num = 100;
		while(num > 10 || num <0) {
			System.out.println("digite um numero");
		 num = sc.nextInt();
		}
		int c = controller.exc03con.FatController(num);
		System.out.println(c);
	}

}
