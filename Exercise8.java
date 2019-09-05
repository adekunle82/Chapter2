import java.util.Scanner;
public class Exercise8{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the first integer");
	int number1 = input.nextInt();
	System.out.print("Enter the second integer");
	int number2 = input.nextInt();
	int remainder = number1 % number2;
	if(remainder == 0){
	System.out.printf("%d is a multiple of %d%n", number1, number2);
}
   	if(remainder != 0){
	System.out.printf("%d is not a multiple of %d%n", number1, number2);
}

}




}