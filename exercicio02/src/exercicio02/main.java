package exercicio02;

public class main {
	public static void main(String[] args) {
		
		int finalValue = power(2,6);
		int[] array = new int[] {65,2,41,53,8,2,9,7,9};
		
		//printAll(array,array.length);
		printAllReverse(array,array.length);
	}

	private static int power(int x, int n) {
		if (n == 0)
			return 1;
		else if (n % 2 == 0)
			return power(x, n / 2) * power(x, n / 2);
		else
			return x * power(x, n / 2) * power(x, n / 2);
	}
	
	private static void printAll(int[] array, int n){
		if(n==1)
			System.out.println(array[n-1]);
		else{
			printAll(array, n-1);
			System.out.println(array[n-1]);
		}
	}
	
	private static void printAllReverse(int[] array, int n){
		if(n==1)
			System.out.println(array[n-1]);
		else{
			System.out.println(array[n-1]);
			printAllReverse(array, n-1);
		}
	}
	
	private static int sumAll(int[] array, int n){
		if(n==1)
			return array[n-1];
		else{
			//return printAllReverse(array, n-1);
		}
	}

}
