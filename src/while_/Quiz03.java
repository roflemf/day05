package while_;

public class Quiz03 {
	public static void main(String[] args) {
		int rice = 100*1000;
		int mouse = 2, day = 0;
		
		while(rice > 0) {
			day++;
			rice -= (mouse*20);
			if(day % 10 == 0)
				mouse *= 2;
		}
		System.out.printf("몇일: %d 몇마리: %d ", day, mouse);
	}
}
