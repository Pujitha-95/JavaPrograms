import java.util.HashSet;

public class Removeduplicatecharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1, 4,1,5,0,2,7,1,2, 9,0};
		int length=a.length;
		int count=0;
	//	HashSet<Integer> hset= new HashSet<Integer>();
		
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					a[j]=-1;
				}
			}

				if(count>1 &&  a[i]!=-1)
				{
					
					System.out.println(a[i]);
				}
			}
			
		
	
	
	
	
	
	
		
	}
}


