/**
 * Created by sam on 03.06.16.
 */
public class Lesson3Method {
    public static void main(String[]args){
        String[] arr1 = {"Sasha","Aliyona","Radion","Genia","Yulia","Kolya","Maksim","Nadia","Lena","Jdanov"};

        Contact Sasha = new Contact();
        Sasha.Name=arr1[0];
        Sasha.Phone="12345";
        Sasha.Email="sasha@yandex.ru";

        System.out.println("Name\tPhone\tEmail \n");
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);


        Contact Aliyona = new Contact();
        Aliyona.Name=arr1[1];
        Aliyona.Phone="67890";
        Aliyona.Email="aliyona@yandex.ru";
        System.out.println(Aliyona.Name+"\t"+Aliyona.Phone+"\t"+Aliyona.Email);

        Contact Radion=new Contact();
        Radion.Name=arr1[2];
        Radion.Phone="54321";
        Radion.Email="radion@yandex.ru";
        System.out.println(Radion.Name+"\t"+Radion.Phone+"\t"+Radion.Email);

        Contact Genia = new Contact();
        Genia.Name=arr1[3];
        Genia.Phone="09876";
        Genia.Email="genia@yandex.ru";
        System.out.println(Genia.Name+"\t"+Genia.Phone+"\t"+Genia.Email);

        Contact Yulia=new Contact();
        Yulia.Name=arr1[4];
        Yulia.Phone="23456";
        Yulia.Email="yuliya@yandex.ru";
        System.out.println(Yulia.Name+"\t"+Yulia.Phone+"\t"+Yulia.Email);

        Contact Kolya=new Contact();
        Kolya.Name=arr1[5];
        Kolya.Phone="78901";
        Kolya.Email="kolya@yandex.ru";
        System.out.println(Kolya.Name+"\t"+Kolya.Phone+"\t"+Kolya.Email);

        Contact Maksim = new Contact();
        Maksim.Name=arr1[6];
        Maksim.Phone="34567";
        Maksim.Email="maksim@yandex.ru";
        System.out.println(Maksim.Name+"\t"+Maksim.Phone+"\t"+Maksim.Email);

        Contact Nadia=new Contact();
        Nadia.Name=arr1[7];
        Nadia.Phone="89012";
        Nadia.Email="nadia@yandex.ru";
        System.out.println(Nadia.Name+"\t"+Nadia.Phone+"\t"+Nadia.Email);

        Contact Lena=new Contact();
        Lena.Name=arr1[8];
        Lena.Phone="45678";
        Lena.Email="lena@yandex.ru";
        System.out.println(Lena.Name+"\t"+Lena.Phone+"\t"+Lena.Email);

        Contact Jdanov =new Contact();
        Jdanov.Name=arr1[9];
        Jdanov.Phone="90123";
        Jdanov.Email="jdanov@yandex.ru";
        System.out.println(Jdanov.Name+"\t"+Jdanov.Phone+"\t"+Jdanov.Email);
        System.out.println();
//        for (int i= 0;i<arr1.length;i++) {
//            System.out.println(arr1[i]);
//        }
    }
}
