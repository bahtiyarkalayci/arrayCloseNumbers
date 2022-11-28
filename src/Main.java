import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       /* Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
        Dizi : {15,12,788,1,-1,-778,2,0}
        Girilen Sayı : 5
        Girilen sayıdan küçük en yakın sayı : 2
        Girilen sayıdan büyük en yakın sayı : 12

       */




        int[] list = {15,12,788,1,-1,-778,2,0};

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter a number");
        int number=scanner.nextInt();
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        int min=list[0];
        int max=list[7];


        for(int i:list){
            if (i>min && i<number){
                min=i;


            }
            if (i<max && i>number){
                max=i;

            }


        }
        System.out.println("en yakın min değer="+min);
        System.out.println("en yakın max değer="+max);

    }
}