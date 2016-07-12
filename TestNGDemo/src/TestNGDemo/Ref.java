package TestNGDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

class a {
	
	void display(){
		System.out.println("Display one ");
	}
	
	void display2(){
		System.out.println("Display two ");
	}
}
class b {
	
	void Monitor(){
		System.out.println("Monitor 1");
		
	}
	void Monitor_2(){
		System.out.println("Monitor 2");
	}
}

public class Ref {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		 List<String> al=new LinkedList<String>();
//List<String> al=new ArrayList<String>();//creating arraylist    
al.add("bharathi");
al.add("bharathi");
al.add("4bharathi");
al.add("5harathi");
Iterator x = ((LinkedList<String>) al).descendingIterator();


al.add(2,"0bharathi");
al.remove(3);



for (int i=0; i< al.size(); i ++){
	
	System.out.println(al.get(i));
	
}


Set<String> als=new LinkedHashSet<String>();
als.add("bharathi_hashset567 ");
als.add("sdfsdfsdf_hashset");
als.add("sdfsdfsdf_hashset");
als.add("bharathi_hashset ");

Iterator<String> it = als.iterator();
while (it.hasNext()){
	System.out.println(it.next());
}


//List<String> al=new LinkedList<String>();
List<String> al1=new ArrayList<String>();//creating arraylist    
al1.add("1bharathi");
al1.add("3bharathi");
al1.add("4bharathi");
al1.add("5harathi");

al1.add(2,"0bharathi");

al1.remove(3);


for (int i=0; i< al1.size(); i ++){

System.out.println(al1.get(i));

}



	}

}
