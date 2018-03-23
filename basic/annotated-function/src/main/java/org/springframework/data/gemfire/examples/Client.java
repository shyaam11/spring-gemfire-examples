package tesstt;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class trriaa {

	public static void main(String[] args) {/*
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enterr value");
		String original=scan.nextLine();
		String reverse="";
		for (int i=0;i<original.length();i++)
		{
			reverse=reverse+original.charAt(i);
		}
		if(reverse.equals(original))
		{
			System.out.println("hi");
		}
	*/
		
	List<Student> list=new ArrayList<Student>();
	list.add(new Student(1,2));
	list.add(new Student(2,3));
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		Student ss=(Student)it.next();
		System.out.println("array it-->"+ss.getGrade());
	}
	for(Student s:list)
	{
		System.out.println("array for-->"+s.getGrade());

	}
	
	Map<String,Student> hash=new HashMap<String,Student>();
	
	hash.put("1", new Student(1,1));
	hash.put("2", new Student(2,1));
	Iterator it_hash=hash.entrySet().iterator();
	while(it_hash.hasNext())
	{
	Map.Entry entry	=(	Map.Entry)it_hash.next();
	Student sss1=(Student)entry.getValue();
	System.out.println("hashmap iter-->"+sss1.getMark());
	}
for(Map.Entry entry1:hash.entrySet())
{Student sss1=(Student)entry1.getValue();
System.out.println("hashmap for each-->"+sss1.getMark());
	
}


Set<Student> set=new HashSet<Student>();
set.add(new Student(1,1));
Iterator it_set=set.iterator();
while(it_set.hasNext())
{
Student entry_sett	=(Student)it_set.next();
System.out.println("set iter-->"+entry_sett.getMark());
}
for(Student sss:set)
{
System.out.println("set for eac-->"+sss.getMark());

}

Hashtable<String,Student> hastablee=new Hashtable<String,Student>();
hastablee.put("1", new Student(1,2));
Enumeration balance = null;
Iterator it_ha_table=hastablee.entrySet().iterator();

while(it_ha_table.hasNext())
{
	Map.Entry sss1=(Map.Entry)it_ha_table.next();
	Student ss2=(Student)sss1.getValue();
	System.out.println("table iter-->"+ss2.getMark());
	
}
for(Map.Entry eee: hastablee.entrySet())
{
Student ssss=(Student)eee.getValue();	
System.out.println("table for each-->"+ssss.getMark());

}
balance=hastablee.keys();
while(balance.hasMoreElements())
{
	String key=(String)balance.nextElement();
Student ff=hastablee.get(key);
System.out.println(ff.getMark());
}
	}
}
