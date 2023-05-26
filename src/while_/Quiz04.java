package while_;

import java.util.Scanner;

public class Quiz04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int i = 1;
		System.out.print("정수 하나 입력: ");
		num = sc.nextInt();
		
		while(i <= num) {
			System.out.printf("5의 배수: %d\n", 5*i);
			i++;
		}
	}
}
