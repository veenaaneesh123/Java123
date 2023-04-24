package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EgCollection {
	public static void main(String arg[])
	{
		//List<String> list =new ArrayList<String>();
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		//newchangein git
	//new edit for pull

	arrlist.add(123);
	arrlist.add(123);
	arrlist.add(456);
	arrlist.add(234);
	Iterator<Integer> itr=arrlist.iterator();  
	while(itr.hasNext())
	{  
	System.out.println(itr.next());  
	}
	//System.out.println("List"+arrlist);
	
	
	ArrayList<String> list=new ArrayList<String>();
	list.add("Rafgb"); 
	list.add("Vifgg");  
	list.add("Rafff");  
	list.add("Ahfffff");
	
	Iterator<String> itr1=list.iterator();  
	while(itr1.hasNext())
	{  
	System.out.println(itr1.next());  
	}
	//System.out.println(list);
	//System.out.println(arrlist.);
	}
	
}

