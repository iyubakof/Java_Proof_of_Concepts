
public class Main {

	public static void main(String[] args) {
		//instance of Integer type
		Test <Integer> intObj = new Test<Integer>(15);
		System.out.print("This is the Integer object from Generic class: ");
		System.out.println(intObj.getObject());

		//instance of String type
		Test<String> strObj = new Test<String>("Yvonne Ubak");
		System.out.print("This is the String object from Generic class: ");
		System.out.println(strObj.getObject());

	}

}
