package week1.day1;

public class Factorial {
	public static void main(String[] args) {
		int factorialNum = 5 , factorialValue=1;
		// factorial value - 5! = 5*4*3*2*1 = 120
		for (int i = 1; i <=factorialNum; i++) {
			factorialValue = factorialValue * i;			
		}
		System.out.println(factorialValue);
			}

}
 