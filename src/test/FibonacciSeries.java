package test;

public class FibonacciSeries {

    public static void main(String[] args) {

        int firstNumber=0;
        int secondNumber=1;
        int sum=0;

        for(int i =1; i<=10; i++)
        {
            sum=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=sum;
            System.out.println(sum);
        }
    }
}
