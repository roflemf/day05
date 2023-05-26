package for_;

public class TestClass02 {
	public static void main(String[] args) {
		for(int i=1; i<5;i++) {
			System.out.println("상위 for 시작");
			for(int j=1; j<3; j++) {
				System.out.println(i+", "+j);
			}
			System.out.println("상위 for 끝");
		}
		for(int i=2; i<=9; i++) {
			System.out.println();
			for(int j=1; j<=9; j++) {
				System.out.printf("%d * %d = %d \n",i,j,i*j);
			}
			System.out.println("===================");
		}
			
				
		
		
		
	}
}
