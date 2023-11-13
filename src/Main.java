import java.util.Random;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        int[] dataPoints;
        dataPoints = new int[100];
        int sum = 0;
        int count = 0;
        boolean foundVariable = false;
        int min = 100;
        int max = 0;

        for(int x = 0; x < dataPoints.length; x++)
            dataPoints[x] = rnd.nextInt(100) + 1;

        for(int x = 0; x < dataPoints.length; x++)
            System.out.print(dataPoints[x] + " | ");

        for(int x = 0; x < dataPoints.length; x++)
            System.out.print(dataPoints[x] + " | ");

        for(int x = 0; x < dataPoints.length; x++)
            sum += dataPoints[x];

        System.out.println();
        System.out.println("The sum of the random array dataPoints is: " + sum);
        System.out.println("The average of the random array dataPoints is: " + (sum/100));
        int userNumber = SafeInput.getRangedInt(in, "Enter a number", 1, 100);

        for(int x = 0; x < dataPoints.length; x++)
        {
            if (dataPoints[x] == userNumber)
                count += 1;
        }
        System.out.println(userNumber + " appears in the list " + count + " times!");
        int userNumber2 = SafeInput.getRangedInt(in, "Enter another number", 1, 100);
        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] == userNumber2)
            {
                System.out.println("Value " + userNumber2 + " is first found at array index " + x);
                foundVariable = true;
                break;
            }
        }
        if (!foundVariable)
            System.out.println("Value " + userNumber2 + " is not found in the list.");

        for(int x = 0; x < dataPoints.length; x++)
        {
            if(dataPoints[x] > max)
                max = dataPoints[x];
            if(dataPoints[x] < min)
                min = dataPoints[x];
        }
        System.out.println("The max value is " + max);
        System.out.println("The min value is " + min);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));
    }
    public static double getAverage(int values[])
    {
        int sumOfArray = 0;
        for (int x = 0; x < values.length; x++)
            sumOfArray += values[x];
        return (sumOfArray / (values.length));
    }
}
