
/*
Given a string s, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.

 

Example 1:

Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.
Example 2:

Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

*/
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
