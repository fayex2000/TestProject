import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotationTest {
	private static String[] words = {
	         "ptolemaic",
	         "retrograde",
	         "supplant",
	         "undulate",
	         "xenoepist",
	         "zoo",
	         "asymptote",  // <-- rotates here!
	         "babka",
	         "banoffee",
	         "engender",
	         "karpatka",
	         "othellolagkage" };
	     

	public static int findRotationIndex(List<String> lst)
	{
		//use binary search
		int i = 0;
		
		while (i < lst.size()-1)
		{
			String str1 = lst.get(i);
			String str2 = lst.get(i+1);
			
			if (str1.compareToIgnoreCase(str2) > 0)
				return i+1;
			
			i++;
		}
		
		return -1;
		
	}
	
	public static int findBRotationIndex(String[] arr)
	{
		//use binary search
		int fIndex = 0;
		int cIndex = arr.length -1;
		
		while (fIndex < cIndex)
		{
			int gIndex = fIndex + (cIndex - fIndex)/2 ; 
			
			String str1 = arr[fIndex];
			String str2 = arr[gIndex];
			
			if (str1.compareToIgnoreCase(str2) >= 0)
			{
				//ceiling index moves to guess index
				cIndex = gIndex;
				
			}
			else
			{
				//floor index moves to guess index
				fIndex = gIndex;
			}
		}	
		
		return fIndex + 1;
		
	}
	
	public static void main(String[] args)
	{
		List<String> lst = Arrays.asList(words);
		
		System.out.println("Get turning point: "+findRotationIndex(lst));
		
		System.out.println("Get turning point by binary search: "+findBRotationIndex(words));
	
		
	}
}
