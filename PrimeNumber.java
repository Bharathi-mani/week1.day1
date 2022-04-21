package week1.day1;



public class PrimeNumber {
	public static void main(String[] args) {
		//Prime number = 7
		
		int num=17, r;
		boolean flag = true;
		
	
		for (int i = 2; i <=num/2; i++) {
			r=num%i;
			if (r==0) {
				flag= false;
			}
			
		}
		if(flag)
			System.out.println(num+" is prime number");
		else
			System.out.println(num+" is not a prime number");
	}

}
