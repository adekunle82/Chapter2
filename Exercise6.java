import java.util.Scanner;
public class Exercise6{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	int largest = 0;
	int smallest = 0;

	System.out.print("Enter first number");
	int number1 = input.nextInt();
	System.out.print("Enter the second number");
	int number2 = input.nextInt();
	System.out.print("Enter the third number");
	int number3 = input.nextInt();
	System.out.print("Enter the fourth number");
	int number4 = input.nextInt();
	System.out.print("Enter the fiveth number");
	int number5 = input.nextInt();
	
	if(number1>largest){
	largest = number1;
}
	if(number2>largest){
	largest = number2;
}
	if(number3>largest){
	largest = number3;
}	
	if(number4>largest){
	largest = number4;
}	
	if(number5>largest){
	largest = number5;
}	
	if(number1<number2){
	smallest = number1;
}
	if(number2<number1){
	smallest = number2;
}
	if(smallest>number3){
	smallest = number3;
}
	if(smallest<number3){
	smallest = smallest;
}
	if(smallest>number4){
	smallest = number4;
}
	if(smallest<number4){
	smallest = smallest;
}	
	if(smallest>number5){
	smallest = number5;
}
	if(smallest<number5){
	smallest = smallest;
}
	System.out.printf("The largest of five integers is %d, and smallest of five integers is %d%n", largest, smallest);
}


}