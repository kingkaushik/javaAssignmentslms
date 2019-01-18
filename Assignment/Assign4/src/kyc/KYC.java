package kyc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class KYC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTestCases=sc.nextInt();
        for(int i=0 ; i<noOfTestCases;i++) {
            String formSignUpDateInString = sc.next();
            String presentDateInString = sc.next();
            DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
            LocalDate formSignUpDateObject = LocalDate.parse(formSignUpDateInString,dateTimeFormatter);
            LocalDate presentDateObject = LocalDate.parse(presentDateInString,dateTimeFormatter);
            long elapsedTimeInDaysAfterSignUp= ChronoUnit.DAYS.between(formSignUpDateObject,presentDateObject);
            if(elapsedTimeInDaysAfterSignUp<335)
            {
                System.out.println("No Range");
            }
            else
            {
                long elapsedTimeInYearsAfterSignUp=ChronoUnit.YEARS.between(formSignUpDateObject,presentDateObject);
                LocalDate currentYearAnniversaryDate = formSignUpDateObject.plusYears(elapsedTimeInYearsAfterSignUp);
                LocalDate startDateOfAnniversary = currentYearAnniversaryDate.minusDays(30);
                LocalDate endDateOfAnniversary = currentYearAnniversaryDate.plusDays(30);
                if(ChronoUnit.DAYS.between(startDateOfAnniversary,presentDateObject)<0)
                {
                    startDateOfAnniversary=startDateOfAnniversary.minusYears(1);
                    endDateOfAnniversary=endDateOfAnniversary.minusYears(1);
                }
                else if(ChronoUnit.DAYS.between(endDateOfAnniversary,presentDateObject)<0)
                {
                    endDateOfAnniversary=presentDateObject.plusDays(0);
                }

                System.out.println(startDateOfAnniversary.format(dateTimeFormatter)+" "+endDateOfAnniversary.format(dateTimeFormatter));
            }
        }
    }
}

