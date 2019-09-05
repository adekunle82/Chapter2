import java.util.Scanner;
public class BMI{
public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your body weight in kg");
	int bodyWeight= input.nextInt();
	System.out.print("Enter your height in metres ");
	int bodyHeight = input.nextInt();
	int bMI = bodyWeight/(bodyHeight * bodyHeight);
	System.out.printf("Your Body Mass Index (BMI) is %d%n",bMI);

	System.out.println ("BMI VALUES");
        System.out.println ("Underweight: less than 18.5");
        System.out.println ("Normal:      between 18.5 and 24.9");
        System.out.println ("Overweight:  between 25 and 29.9");
        System.out.println ("Obese:       30 or greater");
}



}