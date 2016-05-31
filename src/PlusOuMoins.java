import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by sam on 31.05.16.
 */
public class PlusOuMoins {
    public static void main(String[]args) {
        int nbr_secret;
        int nbr_user;
        Scanner scan = new Scanner(System.in);
        nbr_secret = (int) (Math.random() * 999)+1; //1-1000
        do {
            System.out.println("Ведите число  (1-999): ");
            nbr_user=scan.nextInt();
             if (nbr_user== nbr_secret){
                 System.out.println("Поздравляю за угад !!! ");
             } else if (nbr_user> nbr_secret){
                 System.out.println("ваше Число очень большое");
             }else {
                 System.out.println("Ваше число очень маленькое");
             }
        }while (nbr_user != nbr_secret);
    }
}

//