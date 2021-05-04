

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
