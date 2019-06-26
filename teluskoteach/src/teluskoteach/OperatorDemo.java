package teluskoteach;

public class OperatorDemo {	

	public static void main(String[] args)
	{
		int n1=8, n2=6;
		int a1=n1+n2;//12
		int a2=n1-n2;//4
		int a3=n1*n2;//32
		double a4=(double)n1/n2;//2
		int a5=n1%n2;
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		System.out.println(a4);
		System.out.println(a5);
		int a=5;
		int b=3;
		int c=0;
		b=++a;//post increment
		b=a++;
	   	System.out.println(b);
	   	System.out.println(a);
	}

}
