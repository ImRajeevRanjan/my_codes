/* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9. 
X can be placed before L (50) and C (100) to make 40 and 90. 
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer.

*/

public class Roman_To_Integer {
	

	 static class Solution {
		

		 int value(char ch)
		{
			if(ch == 'M') return 1000;
			if(ch == 'D') return 500;
			if(ch == 'C') return 100;
			if(ch == 'L') return 50;
			if(ch == 'X') return 10;
			if(ch == 'V') return 5;
			if(ch == 'I') return 1;
			return -1;
		}
	    public int romanToInt(String s) {
	    	
	    	int number=0;
	    	int v1=0;
	    	int v2=0;
	    	for(int i=0;i < s.length(); i++)
	    	{
	    		 v1 = value(s.charAt(i));
	    		if((i+1) < s.length())
	    		{
	    			
	    		 v2 = value(s.charAt(i+1));
	            }
	    		else
	    		{
	    			v2 = 0;
	    		}
	    		
	    		if(v1 >= v2){
					number+=v1;
	    		}
	    		else {
	    			number = number + (v2-v1);
	    			i = i+1;
	    		//	i++;
	    		}
	    		
	    	}
	    	
	    	return number;
	        
	    }
	}
	
	public static void main(String [] args)
	{
		Solution x = new Solution();
		int y = x.romanToInt("MDCXCV");
		System.out.println(y);
		
		
	}
}
