import java.util.HashSet;

public class Firstrepititiveoccurance {

	public static char getOcuurance(String str)
	{
		
	
		
		HashSet<Character> hset = new HashSet<Character>();
		for(int i=0;i<str.length();i++)
		{
			if(hset.contains(str.charAt(i)))
			{
				return str.charAt(i);
			}
			else 
				hset.add(str.charAt(i));
			
		
		}
		return '\0';
	}

public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	String str= "Pujitha";
	
	System.out.println(getOcuurance(str));
}
}
