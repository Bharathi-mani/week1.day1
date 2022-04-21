package week1.day1;

public class Fibonacci {
	public static void main(String[] args) {
		int range=8, firstNumber=0, secondNumber=1, sum;
		System.out.println("Fibanocci Series:\n"+firstNumber+"\n"+secondNumber);
		for(int i =1; i<range-1 ; i++)
		{
			sum=firstNumber+secondNumber;
			firstNumber = secondNumber;
			secondNumber = sum;
			System.out.println(sum);
			
		}
		
		
	}

}
