import java.util.Scanner;
  public class Exercise3{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
	System.out.print("Enter the first integer");
	int integer1 = input.nextInt();
	System.out.print("Enter the second integer");
	int integer2 = input.nextInt();
        if(integer1>integer2){
  	System.out.printf("%d is large", integer1);
}
	if(integer1<integer2){
	System.out.printf("%d is large", integer2);
}
        if(integer1==integer2){
	System.out.print("These numbers are equal");
}


}





}