package while_;

public class TestClass05 {
	public static void main(String[] args) {
		int su = 0, sum = 0;
		do {
			su++;
			sum += su;
		}while(su <= 9);
		System.out.println("do while: " + sum);
		
		su = 0; sum = 0;
		while(su <= 9) {
			su++;
			sum += su;
		};
		System.out.println("while: " + sum);
		
		System.out.println(" --- 비교 ---");
		su = 100;
		do {
			su++;
			System.out.println("실행");
		}while(su <= 9);
	}
}
