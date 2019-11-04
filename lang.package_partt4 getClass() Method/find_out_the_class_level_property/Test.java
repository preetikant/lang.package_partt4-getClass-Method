import java.lang.reflect.*;

class Test{

public static void main(String args[]){

	int count=0;
	Object o=new String("Durga");
	Class c= o.getClass();
	System.out.println("Fully qualified class Name is: "+c.getName());
	Method m[] = c.getDeclaredMethods();
	System.out.println("Method Information: ");
	for(Method m1:m){
		count++;
		System.out.println(m1.getName());
	}
	System.out.println("The numeber of Method is: "+count);
}
}