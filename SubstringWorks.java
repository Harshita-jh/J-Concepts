
public class SubstringWorks {

	public static void main(String[] args) {
		
		String str = "We are learning Java programming";
		
		System.out.println(str.substring(0, 6));
		System.out.println(str.substring(7 , 12));
		//end index always excluded or end index is optional
		System.out.println(str.substring(8));
	}

}
