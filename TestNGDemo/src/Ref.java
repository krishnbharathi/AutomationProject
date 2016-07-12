

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

Class c= Class.forName("a");	
System.out.println(c.getSimpleName());
Class[] d= c.getClasses();


	}

}
