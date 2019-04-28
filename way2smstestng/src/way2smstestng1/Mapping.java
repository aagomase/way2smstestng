package way2smstestng1;

import java.util.HashMap;
import java.util.Map;

public class Mapping {

	public static void main(String[] args) 
	{
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		
		mp.put(1,"jhon");
		mp.put(2, "Ram");
		mp.put(1,"satya");
		mp.put(3," ");
		
		for(Map.Entry<Integer,String>m:mp.entrySet())
		{
			//m.getKey();
			System.out.print(m.getKey());
			System.out.println(" "+m.getValue());
			
		}
		
	}

}
