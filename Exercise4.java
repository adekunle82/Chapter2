import java.util.Scanner;
public class Exercise4{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter first integer");
	int int1 = input.nextInt();
	System.out.print("Enter second integer");
	int int2 = input.nextInt();	
	System.out.print("Enter third integer");
	int int3 = input.nextInt();
	int sum = (int1 + int2 + int3);
	System.out.printf("The sum is %d%n", sum);
        int product = (int1 * int2 * int3);
	int average = (sum/3);
	System.out.printf("The average is %d%n", average);
	System.out.printf("The product is %d%n", product);
	
	int smallest = 0;
	int largest = 0;
	if (int1>int2){
	   smallest = int2;
}
     	if(int1<int2){
        smallest = int1;
}
	if(smallest>int3){
   	smallest = int3;
}
	if (smallest<int3){
	smallest = smallest;
	
}

	if(int1 > largest){
	largest = int1;
}
        if(int2 > largest){
	largest = int2;
}
	if(int3> largest){
	largest = int3;
	System.out.printf("The largest integer is %d, smallest integer is %d", largest, smallest);
}
	     


}











}