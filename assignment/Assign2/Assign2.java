import java.util.Scanner;
class Assign2
{
	//time complexity:O(n) and space complexity:O(1)
	public  static boolean isPangram(String inputString)
	{
		if(inputString.chars().filter(i -> i >= 'a' && i <='z').distinct().count()==26)
		{
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter the string to check if all a-z alphabets are present:");
		String inputString = scanner.nextLine();
		if(isPangram(inputString.toLowerCase()))
			System.out.println("The entered string "+inputString+" is a pangram");
		else
			System.out.println("The entered string "+inputString+" is not a pangram");
	}
}
