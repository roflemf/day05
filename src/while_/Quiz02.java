package while_;

public class Quiz02 {
	public static void main(String[] args) {
		int all = 25;
		int move = 0;
		
		while( move < all) {
			System.out.println("발차기를 계속합니다.");
			System.out.println("현재 이동 거리: " + move);
			move += 3;
		}
		System.out.println("도착");
	}
}
