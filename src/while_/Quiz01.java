package while_;


public class Quiz01 {
	public static void main(String[] args) {
//		int day = 0;
//		double snail = 0.0;
//		
//		while(true) {
//			day ++;
//			snail += 3.0;
//			
//			if(snail >= 13.0) {
//				break;
//			}else {
//				snail = snail - 2.5;
//			}
//		}
//		System.out.println(day + "일");
		
		
		char a = 'A' ;
		while (a <= 'Z') {
			System.out.print(a++ + "-");
			if(a == 'Z')
				System.out.print(a++);
		}
	}
}
