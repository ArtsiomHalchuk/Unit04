package by.epam.hometask.vetvl;

public class T07_12 {

	public static void main(String[] args) {
	System.out.println(t07(1,2,3,4));
	System.out.println(t08(2,4));
	System.out.println(t09(2,3,2));
	System.out.println(t10(2,8));//аргументы - радиусы кругов
	System.out.println(t11(2,3,4,5));// аргументы - параметры в след порядке: сторона первого треугольника, высота к ней, сторона второго треугольника, высота к ней
	System.out.println(t12(2,0,-4));
	}
	
	public static double t07(double a,double b,double c,double x) {
		return Math.abs(a*x*x+b*x+c);
	}
	public static double t08(double a,double b) {
		if (a*a<b*b) {
			return a*a;
		}else {
			return b*b;
		}
	}
	public static String t09(double a,double b,double c) {
		if (a==b&&b==c) {
			return "Yes";
		}else {
			return "No";
		}
	}
	public static String t10(double a,double b) {
		if ((a*a*Math.PI)>(b*b*Math.PI)) {
			return "Площадь первого круга больше";
		}else if((a*a*Math.PI)==(b*b*Math.PI)) {
			return "Площади кругов равны";
		}else {
			return "Площадь второго круга больше";
		}
	}
	public static String t11(double a1,double h1,double a2, double h2) {
		double S1=a1*h1*0.5;
		double S2=a2*h2*0.5;
		if (S1>S2) {
			return "Площадь первого треугольника больше";
		}else if (S1==S2) {
			return "Треугольники равны по площади";
		}else {
			return "Площадь второго треугольника больше";
		}
				
	}
	public static String t12(double a,double b, double c) {
		if (a>=0) {
			a=a*a;
		}else {
			a=a*a*a*a;
		}
		if (b>=0) {
			b=b*b;
		}else {
			b=b*b*b*b;
		}
		if (c>=0) {
			c=c*c;
		}else {
			c=c*c*c*c;
		}
		return a+" "+b+" "+c;
		} 
}
