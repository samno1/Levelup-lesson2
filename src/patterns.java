import java.util.Scanner;

/**
 * Created by sam on 30.05.16.
 */
public class patterns {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int rows=5,i,j,max=1,num;
        for(i=1;i<=rows;i++){
            System.out.println();
            for(j=1;j<=max;j++){
                System.out.print("*");
            }
            max++;
        }
        for(i=1;i<=rows;i++) {   //loop1
            System.out.println();
            num=1;
            for (j = 1; j <= max; j++) {   //lop2
                System.out.print(num);
             num++;
            }
            max++;
        }

        }


    }

