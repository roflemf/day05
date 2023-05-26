package for_;

public class TestClass01 {
	public static void main(String[] args) {
		// f11 : 디버깅 실행모드 
		// f6: 한줄 실행
		// ctrl + f2: 디버깅 종료
		// f8: run(다음 브레이크 포인터에서 멈춤)
		// f5: 한줄실행(메소드를 만나면 해당 코드로 이동)
		System.out.println("Test");
		int sum =0;
		
		for(int i=0; i<100000; i++) {
			sum += i;
		}
		System.out.println("시작");
	}
}
