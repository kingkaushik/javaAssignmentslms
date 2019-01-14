package threeInterfaces_Solution3;

public class Arithmetic extends ModuloDivision implements  Division{

    @Override
    public int sumOfTwoVariables(int number1, int number2) {
        return number1+number2;
    }

    @Override
    public int sumOfThreeVariables(int number1, int number2, int number3) {
        return number1+number2+number3;
    }

    @Override
    public int divisionOfPositiveNumbers(int number1, int number2) {
        try {
            return number1 / number2;
        }
        catch (ArithmeticException divisionByZeroException)
        {
            System.out.println("number 2 cannot be zero");
            divisionByZeroException.printStackTrace();
            return -1;
        }
    }

    @Override
    public int multiplyTwoVariables(int number1, int number2) {
        return number1*number2;
    }

    @Override
    public int multiplyThreeVariables(int number1, int number2, int number3) {
        return number1*number2*number3;
    }

    @Override
    public int subtractTwoNumbers(int number1, int number2) {
        return number1-number2;
    }

    @Override
    public int subtractThreeNumbers(int number1, int number2, int number3) {
        return number1-number2-number3;
    }
    public void divide(Division division)
    {
        int number1=25;
        int number2=5;
        int quotient=division.divisionOfPositiveNumbers(number1,number2);
        if(quotient!=-1)
        {
            System.out.println(number1+"/"+number2+"="+quotient);
        }
    }
    public void add(Addition addition)
    {
        int number1=25;
        int number2=5;
        int number3=10;
        int resultOfSumOfTwoNumbers=addition.sumOfTwoVariables(number1,number2);
        int resultOfSumOfThreeNumbers=addition.sumOfThreeVariables(number1,number2,number3);
        System.out.println(number1+"+"+number2+"="+resultOfSumOfTwoNumbers);
        System.out.println(number1+"+"+number2+"+"+number3+"="+resultOfSumOfThreeNumbers);
    }
    public void subtract(Subtract subtraction)
    {
        int number1=25;
        int number2=5;
        int number3=10;
        int resultOfDiffernceOfTwoNumbers=subtraction.subtractTwoNumbers(number1,number2);
        int resultOfDiffernceOfThreeNumbers=subtraction.subtractThreeNumbers(number1,number2,number3);
        System.out.println(number1+"-"+number2+"="+resultOfDiffernceOfTwoNumbers);
        System.out.println(number1+"-"+number2+"-"+number3+"="+resultOfDiffernceOfThreeNumbers);
    }
    public void multiply(Multiplication multiplication)
    {
        int number1=25;
        int number2=5;
        int number3=10;
        int resultOfProductOfTwoNumbers=multiplication.multiplyTwoVariables(number1,number2);
        int resultOfProductOfThreeNumbers=multiplication.multiplyThreeVariables(number1,number2,number3);
        System.out.println(number1+"*"+number2+"="+resultOfProductOfTwoNumbers);
        System.out.println(number1+"*"+number2+"*"+number3+"="+resultOfProductOfThreeNumbers);
    }
    public static void main(String[] args) {
        Arithmetic arithmetic=new Arithmetic();
        arithmetic.divide(arithmetic);
        arithmetic.add(arithmetic);
        arithmetic.subtract(arithmetic);
        arithmetic.multiply(arithmetic);
    }
}
