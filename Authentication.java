import java.util.Scanner;

public class Authentication{
	public static void main(String[]args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your username:");
		String username=scanner.next();
		System.out.println("Enter your password:");
		String password=scanner.next();
		if(username.equals("YZL")&&password.equals("123456")){
			System.out.println("Welcome YZL");		
		}
		else{
			System.out.println("Invalid Username or Password");	
		}
		
	}

}