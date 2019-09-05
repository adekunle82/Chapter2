import java.util.Scanner;
public class Exercise2{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	System.out.println("collect the fisrt number");
	int number1 = input.nextInt();
	
   	System.out.println("collect the second number");
	int number2 = input.nextInt();
	int sum =  number1 + number2;
	System.out.printf("sum is %d%n", sum);
	int product = number1 * number2;
	System.out.printf("product is %d%n", product);
	int difference = number1 - number2;
	System.out.printf("difference is %d%n", difference);
	int quotient = number1 / number2;
	System.out.printf("quotient is %d%n", quotient);

}





}