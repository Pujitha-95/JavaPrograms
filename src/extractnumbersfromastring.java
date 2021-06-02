
public class extractnumbersfromastring {
 public static int sum(String s)
 {
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			
			char ch= s.charAt(i);
			if(Character.isDigit(ch))
			{
			
				sum=sum+(ch-48);
				
			}	
			
			
		
		}
		return sum;
		
	}


public static void main(String[] args) {
	// TODO Auto-generated method stub

	String s= "234 puji 29 mm";
	System.out.println(sum(s));
	
	
}
}
