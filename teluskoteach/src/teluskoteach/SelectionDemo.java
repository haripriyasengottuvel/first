package teluskoteach;

public class SelectionDemo {

	public static void main(String[] args)
	{
		int n=0;
		if(n==0)
			System.out.println("neither even nor odd");		
		else if(n%2==0)
			System.out.println("even");
		else
			System.out.println("odd"); 
		 int a=2;
		 switch(a)//switch does not allow the double value it allows string,char etc
		 {
		 case 1:
			 System.out.println("one");
			 break;
		 case 2:
			 System.out.println("rwo");
			 break;
		 default:
			 System.out.println("none");
		
		 }
		//Ternary operator ?:
		 n=a>6?2:5;
		 System.out.println(n);
			
			
		
		

	}

}
