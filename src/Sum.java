import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("두 수를 입력 하세요: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("두 수 : "+a+","+b);
		System.out.println("합:"+(a+b));
		sc.close();
	}
}
