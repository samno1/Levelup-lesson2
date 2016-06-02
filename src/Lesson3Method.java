/**
 * Created by sam on 03.06.16.
 */
public class Lesson3Method {
    public static void main(String[]args){
        String[] arr1 = {"Sasha","Aliyona","Radion","Genia","Yulia","Kolya","Maksim","Nadia","Nina","Jdanov"};

        Contact Sasha = new Contact();
        Sasha.Name="Sasha";
        Sasha.Phone="12345";
        Sasha.Email="sasha@yandex.ru";

        System.out.println("Name\tPhone\tEmail \n");
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Aliyona = Sasha;
        Aliyona.Name="Aliyona";
        Aliyona.Phone="67890";
        Aliyona.Email="aliyona@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Radion=Aliyona;
        Radion.Name="Radion";
        Radion.Phone="54321";
        Radion.Email="radion@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Genia = Radion;
        Genia.Name="Genia";
        Genia.Phone="09876";
        Genia.Email="genia@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Yulia=Genia;
        Yulia.Name="Yulia";
        Yulia.Phone="23456";
        Yulia.Email="yuliya@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Kolya=Yulia;
        Kolya.Name="Kolya";
        Kolya.Phone="78901";
        Kolya.Email="kolya@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Maksim = Kolya;
        Maksim.Name="Maksim";
        Maksim.Phone="34567";
        Maksim.Email="maksim@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Nadia=Maksim;
        Nadia.Name="Nadia";
        Nadia.Phone="89012";
        Nadia.Email="nadia@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Nina=Nadia;
        Nina.Name="Nina";
        Nina.Phone="45678";
        Nina.Email="Vladiminr@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);

        Contact Jdanov =Nina;
        Jdanov.Name="Jdanov";
        Jdanov.Phone="90123";
        Jdanov.Email="jdanov@yandex.ru";
        System.out.println(Sasha.Name+"\t"+Sasha.Phone+"\t"+Sasha.Email);
        System.out.println();
        for (int i= 0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }
    }
}
