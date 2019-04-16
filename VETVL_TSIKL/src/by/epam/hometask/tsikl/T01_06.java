package by.epam.hometask.tsikl;

public class T01_06 {

	public static void main(String[] args) {
		System.out.println("Task01");
		t01();
		System.out.println("\nTask02");
		t02();
		System.out.println("\nTask03");
		t03();
		System.out.println("\nTask04");
		t04();
		System.out.println("\nTask05");
		t05();
		System.out.println("\nTask06");
		t06();

	}
	public static void t01 () {
		for (int i=1;i<6;i++) {
			System.out.println(i);
		}
	}
	public static void t02() {
		for (int i=5;i>0;i=i-1) {
			System.out.println(i);
		}
	}
	public static void t03() {
	for (int i=0;i<11;i++) {
		System.out.println(i+" умножить на 3 будет "+(i*3));
		}
	}
	public static void t04() {
		int i=2;
		while (i<=100) {
			System.out.println(i);
			i+=2;
		}
	}
	public static void t05() {
		int i=1;
		int s=0;
		while (i<=99) {
			s+=i;
			i+=2;
		}
		System.out.println(s);
	}
	public static void t06() {
		int a=15;
		int i=1;
		int s=0;
		while (i<=a) {
			s=s+i;
			i++;
		}
		System.out.println("Сумма всех чисел от 1 до "+a+" равна "+s);
	}

}
