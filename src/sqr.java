import java.util.Scanner;

/**
 * Created by sam on 18.05.16.
 */
public class sqr {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int i,j;
        System.out.print("Enter size of box: 4 ");
        int size = sc.nextInt();

        for (i=0; i < size; i++)
        {
            for (j=0; j < size; j++)
            {
                if ( (i == 0)    // First row
                        || (i == size-1)   // Last row
                        || (j == 0)    // First column
                        || (j == size-1) )     // Last column
                    System.out.print("*");  // Draw star
                else
                    System.out.print(" ");  // Draw space
            }
            System.out.println();
        }


    }
}
