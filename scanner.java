import java.util.*;
public class scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);

			System.out.println("What is your Mark");
			int grade = scan.nextInt();
			
			double markDividedByTen = grade/10.0;
			int mark = (int) (markDividedByTen + 0.0);
			switch (mark) {
			        case 10:
			           System.out.println("Your Grade is D");
			            break;
			        case 9:
			        	System.out.println("Your Grade is D");
			            break;
			        case 8:
			        	System.out.println("Your Grade is D");
			            break;
			        case 7:
			        	System.out.println("Your Grade is C");
			            break;
			        case 6:
			        	System.out.println("You Grade is C");
			            break;
			        case 5:
			        	System.out.println("You Pass The Exam");
			            break;
			        case 4:
			        	System.out.println("You are Fail");
			            break;
			        case 3:
			        	System.out.println("You are Fail");
			            break;
			        case 2:
			        	System.out.println("You are Fail");
			            break;
			        case 1:
			        	System.out.println("You are Fail");
			            break;
			        case 0:
			        	System.out.println("You are Fail");
			            break;
			    }
		}
	}

