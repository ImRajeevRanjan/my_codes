// trial file is edited
// again file edited
import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to check it is palindrom or not:");
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		// 321 reverse is 123 so it is not palinrome number :
		int y=x;
		int r,num=0;
		while(x>0)
		{
			r= x%10;
			num=num*10 + r;
			x = x/10;
			
		}
		//System.out.println(num);
		
		if(num==y)
			System.out.println("Yes it is Palindrome");
		else
			System.out.println("No it is not palindrome");
		
		
	}

}
