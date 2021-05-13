
public class Palindrome {
	 public static boolean isPalindrome(String s) {
	     
		 
		 int start = 0;
		 int end = s.length()-1;
		 
		 while(start < end)
		 {
			 while(!Character.isLetterOrDigit(s.charAt(start)) && start < end)
				 start++;
			 
			 while(!Character.isLetterOrDigit(s.charAt(end)) && start < end)
				 end--;
			 
			 if(Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end)))
			 {
				return false; 
			 }
			 start++;
			 end--;
			 
		 }
		 return true;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(isPalindrome("raj,j,a;r"));
		
	}
}
