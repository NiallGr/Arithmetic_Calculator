import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
//		Getting Numbers From User
		System.out.println("Enter first and second number:");
		Scanner input= new Scanner(System.in);
        int firstNum,secondNum;
        firstNum = input.nextInt();
        secondNum = input.nextInt();
        
// 		User Selection '+' '-' '*' '\'
        String line = 
        "Enter your selection:\n"
        + " 1 for Addition: \n"
        + " 2 for substraction: \n"
        + " 3 for Multiplication: \n"
        + " 4 for division:\n";
        System.out.println(line);
        
        int choose;
        choose = input.nextInt();
        switch (choose){
        case 1:
            System.out.println("Your Answer is: " + add( firstNum,secondNum));
            break;
        case 2:
            System.out.println("Your Answer is: " + sub( firstNum,secondNum));
            break;      
        case 3:
            System.out.println("Your Answer is: " + mult( firstNum,secondNum));
            break;
        case 4:
            System.out.println("Your Answer is: " + div( firstNum,secondNum));
            break;
            default:
                System.out.println("Not a Operation");
              
        }

    }
//	'+' '-' '*' '/'  Calculations and Returns 
    public static int add(int x, int y)
    {
        int result = x + y;
        return result;
    }
    public static int sub(int x, int y)
    {
        int result = x-y;
        return result;
    }
    public static int mult(int x, int y)
    {
        int result = x*y;
        return result;
    }
    public static int div(int x, int y)
    {
        int result = x/y;
        return result;
    }

	}


