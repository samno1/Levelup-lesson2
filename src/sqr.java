import java.util.Scanner;

/**
 * Created by sam on 18.05.16.
 */
public class sqr {
    public static void main(String[] args)
    {
        System.out.println("wanna continue?( yes or no) : ");
        Scanner input = new Scanner(System.in);
        String  s1= input.next();

        if (s1.equals("no")) {
            System.out.println("sorry but there was something interesting for you");
        }
        else if (s1.equals("yes")) {
            System.out.println("cool let's start \n");
            System.out.println("");
            for (int i = 10; i<100; i++){
               // for(int j=10;j<11;j++){
                    System.out.print(" ");
                    System.out.print(i);
               // }

            }
        }
        else System.out.println("haha, that's not yes or no !");

    }
}
