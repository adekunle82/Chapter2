import java.util.Scanner;
public class Largest{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer");
	int int1 = input.nextInt();
	System.out.print("Enter second integer");
	int int2 = input.nextInt();	
	System.out.print("Enter third integer");
	int int3 = input.nextInt();
	int largest = 0;
	if(int1 > int2){
	largest = int1;
}
        if(int1 < int2){
	largest = int2;
}
	if(largest < int3){
	largest = int3;
}
	if(largest > int3){
	largest = largest;
	System.out.printf("%d", largest);
}
}
}