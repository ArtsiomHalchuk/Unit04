package by.epam.hometask.vetvl;

public class T01_06 {

	public static void main(String[] args) {
		System.out.println(t01(4,2));
		System.out.println(t02(4,2));
		System.out.println(t03(2));
		System.out.println(t04(2,2));
		System.out.println(t05(2,8));
		System.out.println(t06(2,8));
	}
	public static int t01 (double x, double y) {
		if (x<y){
			return 7;
		}else {
			return 8;
		}
	}
	public static String t02 (double x, double y) {
		if (x<y){
			return "Yes";
		}else {
			return "No";
		}
	}
	public static String t03 (double x) {
		if (x<3){
			return "Yes";
		}else if (x==3) {
			return "Equals";
		}
		else {
			return "No";
		}
	}
	public static String t04 (double x, double y) {
		if (x==y) {
			return "Yes";
		}else {
			return "No";	
			}
	}
	public static double t05 (double x, double y) {
		if (x<y) {
			return x;
			}else {
			return y;
			}
	}
	public static double t06 (double x, double y) {
	if (x<y) {
		return y;
		}else {
		return x;
		}
	}
}
