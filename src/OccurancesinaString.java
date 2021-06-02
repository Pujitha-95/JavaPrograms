import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class OccurancesinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "pujeisthpaahijjtesjt";
		HashMap<Character,Integer> hmap= new HashMap<Character,Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			if(hmap.containsKey(s.charAt(i)))
			{
				hmap.put(s.charAt(i), hmap.get(s.charAt(i))+1);
			}
			else 
				hmap.put(s.charAt(i), 1);
				
		}
		
		for(Entry<Character, Integer> entry :hmap.entrySet())
			
		{
			
			
			System.out.println(entry.getKey()+ "  "+ entry.getValue());
			
		}
		
		Iterator<Entry<Character, Integer>> it =hmap.entrySet().iterator();
		while(it.hasNext())
		{
	Map.Entry<Character,Integer>	entry= (Map.Entry<Character,Integer>)it.next();
	System.out.println(entry.getKey()+ "  "+ entry.getValue());
			
		}
		
	
	}

}
