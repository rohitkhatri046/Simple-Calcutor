import java.util.Scanner;
class Sum
{
	public int add(int a, int b){
		int ans = a + b;
		return ans;
	}
}
class Subtract
{
	public  int sub(int a, int b){
		int ans = b - a;
		return ans;
	}
}

public class Calcutor{
	public static void main(String[] args){
		Sum obj1 = new Sum();
		Subtract obj2 = new Subtract();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First No:");
		int a = sc.nextInt();
		System.out.println("Enter the Secound No:");
		int b = sc.nextInt();
		
		System.out.println("Addtion:" + obj1.add(a, b));
		System.out.println("Subraction:" + obj2.sub(a, b));
		
		
	}
}