package by.epam.hometask.tsikl;

public class T07_12 {

	public static void main(String[] args) {
		System.out.println("Task07");
		t07();
		System.out.println("\nTask08");
		t08();
		System.out.println("\nTask09");
		t09();
		System.out.println("\nTask10");
		t10();
		System.out.println("\nTask11");
		t11();
		System.out.println("\nTask12");
		t12();

	}
	public static void t07() {
		double a=1;
		double b=8;
		double h=1.5;
		double y;
		while (a<=b) {
			if (a>2) {
				y=a;
			}else {
				y=-a;
			}
			System.out.println("При x="+a+" y="+y);
			a+=h;
		}
	}
	public static void t08() {
		double a=1;
		double b=17;
		double c=15;
		double h=1;
		double y;
		while (a<=b) {
			if (a==5) {
				y=(a+c)*2;
			}else {
				y=(a-c)+6;
			}
			System.out.println("При x="+a+" y="+y);
			a+=h;
		}
	}
	public static void t09() {
		int temp=0;
		for (int i=1;i<=100;i++) {
			temp+=i*i;
		}
		System.out.println(temp);
	}
	public static void t10() {
		//Найти произведение квадратов первых 200 чисел начиная от -5 с шагом 0,1
		double temp=1;
		int i=1;
		double n=-5;
		while (i<=200) {
			temp*=n*n;
			n+=0.1;
			i++;
			}
		System.out.println(temp);
	}
	public static void t11() {
		long temp=1;
		for (long i=1;i<=200;i++) {
			temp=temp-(i*i*i);
		}
		System.out.println(temp);
	}
	public static void t12() {
		int n=1;
		int a=1;
		while (n<11) {
			a=6+a;
			System.out.println(n+". a="+a);
			n++;
		}
	}

}
