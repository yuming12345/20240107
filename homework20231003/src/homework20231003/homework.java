package homework20231003;

import java.util.Scanner;

public class homework {

	public static void main(String[] args) {
		Scanner sc;
		sc=new Scanner(System.in);
		System.out.print("請輸入您的姓名：");
		String name = sc.nextLine();
		System.out.println("請輸入年齡：");
		int age = sc.nextInt();
		System.out.printf(name+"你的出生西元年：%d",2023-age);
		
		sc.close();
	}

}
