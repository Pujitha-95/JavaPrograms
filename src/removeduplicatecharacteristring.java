
public class removeduplicatecharacteristring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "poojjitaha";
		char s1[]= s.toCharArray();
	
	
		int length=s1.length;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(s1[i]==s1[j])
				{
					continue;
				}
				
				System.out.print(s1[i] + "");
	            i = j;
			}

			 
			}
			
	}

}
