/*
  Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.

 

Example 1:

Input: nums = [2,2,1]
Output: 1
Example 2:

Input: nums = [4,1,2,1,2]
Output: 4
 */

//Codes:

public class Single_Number {
	
	
	  static int singleNumber(int[] nums) {
		 	for(int i=0; i< nums.length ; i++)
		 	{
		 		int count =0;
		 		int value = nums[i];
		 		for(int j=0; j< nums.length ; j++)
		 		{
		 			if(value ==  nums[j])
		 			{
		 				count++;
		 			}
		 		}
		 		if(count!=2)
		 		{
		 			return nums[i];
		 		}
		 	}
		 return 0;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1,2,3,4,1,2,3};
		//singleNumber(array);
		System.out.println(singleNumber(array));
		
		
		

	
	}
}
