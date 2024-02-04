package Traingle_Casification_class_1.Traingle_Casification_class_1;

/**
 * Hello world!
 *
 */

enum Triangle_Types {
	equilateral, isosceles, Scalene, Nottriangle, ERROR

}

class TriangleClassifier {

	private static Triangle_Types triangle;

	public static void classifyTriangle(int a, int b, int c) {

		int T = 0;

		if (a == b) {
			T++;
		}
		if (b == c) {
			T++;
		}
		if (a == c) {
			T++;
		}

		if (T == 2) {
			triangle = Triangle_Types.ERROR;
		} else {

			if (!isTriangle(a, b, c)) {
				triangle = Triangle_Types.Nottriangle;
			} else if (isTriangle(a, b, c)) {
				if (isEquilateral(a, b, c)) {
					triangle = Triangle_Types.equilateral;
				} else if (isIsosceles(a, b, c)) {
					triangle = Triangle_Types.isosceles;
				} else
					triangle = Triangle_Types.Scalene;

			}
		}
	}

	private static boolean isTriangle(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a;
	}

	private static boolean isIsosceles(int a, int b, int c) {
		return a + b > c && b + c > b && b + c > a && a == b || b == c || a == c;
	}

	private static boolean isEquilateral(int a, int b, int c) {
		return a + b > c && a + c > b && b + c > a && (a == b) && (b == c) && (c == a); 
	}

	public static Triangle_Types get_type() {
		return triangle;
	}
}
