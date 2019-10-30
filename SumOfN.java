import java.util.Scanner;

public class SumOfN {
    
    SumOfN (){
        
    }
    
    public static void main(String[] args){
	System.out.println("");
        System.out.print("Enter first number: ");
        Scanner scan1 = new Scanner(System.in);
        int first = scan1.nextInt();
	System.out.print("Enter last number: ");
        Scanner scan2 = new Scanner(System.in);
        int last = scan2.nextInt();
        calculateSum(first, last);
        
    }

	public static void calculateSum(int firstNumber, int lastNumber){
		int totalFirstLast = (lastNumber - firstNumber) + 1;
		int sumN = (totalFirstLast * (totalFirstLast + 1)) / 2;
		System.out.println("");
		System.out.print("There are ");
		System.out.print(totalFirstLast);
		System.out.print(" numbers between ");
		System.out.print(firstNumber);
		System.out.print(" and ");
		System.out.print(lastNumber);
		System.out.println("");
		System.out.print("The sum of all numbers are ");
		System.out.print(sumN);
	System.out.println("");
	}  
}
