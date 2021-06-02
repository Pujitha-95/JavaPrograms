import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceOfword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "puji test puji test test";
		String s1[] = s.split(" ");
		HashMap<String, Integer> hmap= new HashMap<String, Integer>();
		for(int i=0;i<s1.length;i++)
		{
		
			System.out.println(s1[i]);
		if(hmap.containsKey(s1[i]))
		{
			hmap.put(s1[i], hmap.get(s1[i])+1);
		}
		
		else hmap.put(s1[i], 1);
		}
		
		for(Entry<String, Integer> entry :hmap.entrySet())
		{
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		Iterator<Entry<String,Integer>> it = hmap.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry<String,Integer> entry =(Map.Entry<String,Integer>) it.next();
			
			System.out.println(entry.getKey()+ " " +entry.getValue());
		}
		
		
		
	}

}
