package by.epam.hometask.vetvl;

public class T13_20 {

	public static void main(String[] args) {
		System.out.println(t13(1,1,2,2));//параметры - x1, y1, x2, y2
		System.out.println(t14(90,91));
		System.out.println(t15(2,1));
		System.out.println(t16(2,-2));
		System.out.println(t17(2,1));
		System.out.println(t18(2,-1,-1));
		System.out.println(t19(2,1,1));
		System.out.println(t20(7,4,6,2));

	}
	public static String t13(double x1, double y1, double x2, double y2) {
		double z1=Math.sqrt(x1*x1+y1*y1);
		double z2=Math.sqrt(x2*x2+y2+y2);
		if (z1<z2) {
			return "Первая точка ближе";
		}else if (z1==z2) {
				return "Точки равноудалены от начала координат";
			}else {
				return "Вторая точка ближе";
			}
		}
	public static String t14(double x, double y) {
		if(x+y>=180) {
			return "Такого треугольника не существует";
		}else if (x==90||y==90||(x+y)==90) {
			return "Такой треугольник существует и он прямоугольный";
		}else {
			return "Такой треугольник существует, но он не прямоугольный";
		}
	}
	public static String t15(double x, double y) {
		double a=(x+y)/2;
		double b=x*y*2;
		if (x<y) {
			x=a;
			y=b;
		}else {
			x=b;
			y=a;
		}
		return "x="+x+" y="+y;
	}
	public static String t16(double x, double y) {
		//Лежит ли точка на оси
		if (x==0&&y==0) {
			return "Точка является началом координат";
		}else if(x==0&&y!=0) {
			return "Точка на оси X";
		}else if (y==0&&x!=0) {
			return "Точка на оси Y";
		//В какой четверти лежит точка
		}else {
			if (x>0) {
				if (y>0){
					return "1й координатный угол"; //x>0,y>0
				}else {
					return "4й координатный угол";//x>0,y<0
				}
			}else {
				if (y>0) {
					return "2й координатный угол";//x<0,y>0
				}else {
					return "3й координатный угол";//x<0,y<0
				}
			}
		}
	}
	public static String t17(double m, double n) {
		if (m==n) {
			m=0;
			n=0;
		}else if (m>n) {
			n=m;
		}else {
			m=n;
		}
		return "m="+m+", n="+n;
	}
	public static String t18(double a, double b, double c) {
		int i=0;
		if (a<0) {
			i++;
		}
		if (b<0) {
			i++;
		}
		if (c<0) {
			i++;
		}
		return "среди чисел "+i+" отрицательных";
	}
	public static String t19(double a, double b, double c) {
		int i=0;
		if (a>0) {
			i++;
		}
		if (b>0) {
			i++;
		}
		if (c>0) {
			i++;
		}
		return "среди чисел "+i+" положительных";
	}
	public static String t20(double a, double b, double c, double k) {
		String temp1;
		String temp2;
		String temp3;
		if (a%k==0) {
			temp1=""+a;
		}else {
			temp1="";
		}
		if (b%k==0) {
			temp2=""+b;
		}else {
			temp2="";
		}
		if (c%k==0) {
			temp3=""+c;
		}else {
			temp3="";
		}
		return "Число "+k+" является делителем чисел "+temp1+" "+temp2+" "+temp3;
	}
}
