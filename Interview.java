import java.util.HashMap;
import java.util.Map;

public class Interview {
	
	static Character getSingleChar (String str)
	{
		if (str == null || str.length() == 0)
			return null;
		
		Map<Character, Integer> m = new HashMap<>();
		for (int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if (m.get(c) != null)
			{
				Integer n = m.get(c);
				m.put(c, n+1);
				
			}
			else
				m.put(c,  1);
		}
		
		for (int i=0; i<str.length(); i++)
		{
			char c = str.charAt(i);
			if (m.get(c) != null &&  m.get(c) == 1)
				return c;
		}
		
		return null;
		
	}
	
	public static void main(String[] args)
	{
		String s = "eeeeabc";
		
		if (getSingleChar(s) != null)
			System.out.println(getSingleChar(s));
	}

}
