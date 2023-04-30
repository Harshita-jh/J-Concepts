
public class FindSolution {

	public static void main(String[] args) {
		
		short x = 10;
		//compile error
		//x = x*5;
		x = (short) (x*5);
		System.out.println(x);
		}

}
