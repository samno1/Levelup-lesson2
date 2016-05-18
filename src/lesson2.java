 import jdk.internal.util.xml.impl.Input;
 import java.util.Scanner;
/**
 * Created by sam on 17.05.16.
 */

public class lesson2 {
    public static void main(String[] args) {
//        char t=2;
//        switch (t) {
//            case 1: frame();
//            case 2: Equation();
//                break;
//            default: break;
        //    }
        frame();
        Equation();
        exercice();
    }
    public static void frame(){
        Scanner sc = new Scanner(System.in);
        int i, j;
        System.out.print("Enter size of box (10 would be better !!):  ");
        int size = sc.nextInt();

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if ((i == 0) || (i == 1)  //First 2 row
                        || (i == size - 1) || (i == size - 2)  //last 2 row
                        || (j == 0) || (j == 1)      // First 2 column
                        || (j == size - 1) || (j == size - 2))  // last 2 column
                    System.out.print("#"); // draw ramka
                else
                    System.out.print(" "); // make space

            }

            System.out.println();
        }
    }
    public static void Equation(){
        Math.random();
        Scanner scan= new Scanner(System.in);
        System.out.println("Inter equation parameters ax*x+bx+c=0 :");
        System.out.print("a = ");
        double a =scan.nextDouble();
        System.out.print("b = ");
        double b = scan.nextDouble();
        System.out.print("c = ");
        double c = scan.nextDouble();
        double D, x1,x2;
        System.out.println("D= b*b-4*a*c");
        D = b*b-4*a*c;
        x1= (-b-Math.sqrt((b*b+4*a*c)))/2*a;
        x2= (-b-Math.sqrt((b*b-4*a*c)))/2*a;
        if(D<0) {
            System.out.println("Nyet distivitilsnih kornyei");
        } else if(D==0){
            System.out.println("Odin koreny X1=x1="+x1);
        }else  if(D>0){
            System.out.println("Dva kornyi \nx1= "+x1 );
            System.out.println("x2= "+x2);
        }

    }
    public static void exercice(){
        System.out.println("wanna continue?( yes or no) : ");
        Scanner input = new Scanner(System.in);
        String  s1= input.next();

        if (s1.equals("no")) {
            System.out.println("sorry but there was something interesting for you");
        }
        else if (s1.equals("yes")){
            System.out.println("cool let's start ");
            for (int i=0;i<=5; i++){
                System.out.println("one day");
            }
        }

    }
}


