package patternregex;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatchingRegex {
    public static void main(String args[])
    {
        Scanner scanner=new Scanner(System.in);
        Pattern pattern = Pattern.compile("[A-Z].*\\.");
        System.out.print("Enter the string:");
        String input=scanner.nextLine();
        Matcher match = pattern.matcher(input);
        if(match.matches())
        {
            System.out.println("The input "+input+" starts with capital letter and ends with period");
        }
        else
        {
            System.out.println("The input "+input+" doesn't start with capital letter and/or doesn't end with period");
        }
    }
}
