
public class Main {

	public static void main(String[] args) {
		int a = 10;
		int b = 999;
		isSymmetric(a, b);
	}

	private static void isSymmetric(int a, int b) {
		for (int i = 10; i <= 999; i++) {
			if (i / 10 == 0) {
				System.out.print(i + " ");
			} else if (i / 100 == 0) {
				if (i % 10 == i / 10) {
					System.out.print(i + " ");
				}
			} else if (i % 10 == i / 100) {
				System.out.print(i + " ");
			}
		}
	}
}
