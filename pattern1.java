package MyProject;

import java.util.Scanner;

public class pattern1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:\n");

        int rows = scanner.nextInt();
        System.out.println("Printing the pattern ");
        
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=rows; j++)
            {
                if(i ==1 || i == rows   || j == 1 || j == rows )
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}