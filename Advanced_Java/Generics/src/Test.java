//simple program for generic in java
//< > for parameter type-----> reference ONLY no primitives
public class Test <T>{
	T obj; 		//Test object	

	//constructor
	Test(T obj){
		this.obj = obj;
	}
	
	//method to get object value
	public T getObject() {
		return this.obj;
	}
	
}
