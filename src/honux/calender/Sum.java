package honux.calender;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		// 입력: 키보드
		// 출력: 화면에 두 수의 합을 출력한다.
		int a, b;
		Scanner scanner = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요");
		s1 = scanner.next();
		s2 = scanner.next();
		System.out.println(s1 + " , " + s2);
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		//System.out.println(a + " , " + b);

		int c = a + b;
		System.out.println("두 수의 합은 " + c + "입니다.");
		scanner.close();
	}
}
