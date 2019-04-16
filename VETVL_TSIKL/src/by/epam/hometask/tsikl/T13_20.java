package by.epam.hometask.tsikl;

public class T13_20 {

	public static void main(String[] args) {
		System.out.println("\nTask13");
		t13();
		System.out.println("\nTask14");
		t14();
		System.out.println("\nTask15");
		t15();
		System.out.println("\nTask16");
		t16();
		System.out.println("\nTask17");
		t17();
		System.out.println("\nTask18");
		t18();
		System.out.println("\nTask19");
		t19();
		System.out.println("\nTask20");
		t20();

	}
	public static void t13 () {
		double a=-5;
		double b=5;
		double h=0.5;
		double y;
		for (double i=a;i<=b;i+=h) {
			y = 5 - (i * i) / 2.0;
			System.out.println("При х = " + i + " у = " + y);
		}
	}
	public static void t14() {
		int n=18;
		double temp=0;
		for (int i=1;i<=n;i++) {
			temp+=1/i;
		}
		System.out.println("Сумма выражения равна "+temp);
	}
	public static void t15() {
		int temp=0;
		for (int i=1;i<=10;i++) {
			temp+=Math.pow(2, i);
		}
		System.out.println("Сумма выражения равна "+temp);
	}
	public static void t16() {
		int sum=1;
		long temp=1;
		for (int i=2;i<=10;i++) {
			sum+=i;
			temp*=sum;
		}
		System.out.println("Произведение равно "+temp);
	}
	public static void t17() {
		double a=8;
		int n=5;
		double temp=1;
		for (int i=1;i<n;i++) {
			temp*=(a+i);
		}
		System.out.println("Произведение равно "+temp);
	}
	public static void t18() {
		double e=0.1;
		double aN;
		double temp=0;
		//n примем равным 10
		for (int i=1;i<=10;i++) {
			aN = (Math.pow(-1, i - 1)) / i;
			if (Math.abs(aN) >= e ){
                temp += aN;
			}
		}
		System.out.println("Сумма равна "+temp);
	}
	public static void t19() {
		double e=0.1;
		double aN;
		double temp=0;
		//n примем равным 10
		for (int i=0;i<=10;i++) {
			 aN = 1 / Math.pow(2, i) + 1 / Math.pow(3, i);
	         if (Math.abs(aN) >= e ){
	             temp += aN;
	         }
	     }
		System.out.println("Сумма равна "+temp);
	}
	public static void t20() {
		double e=0.1;
		double aN;
		double temp=0;
		//n примем равным 10
		for (int i=0;i<=10;i++) {
			aN = 1.0 / ((3 * i - 2) * (3 * i + 1));
            if (Math.abs(aN) >= e ){
                temp += aN;
            	}
		}
		System.out.println("Сумма равна "+temp);
	}

}
