package Fungsi_Rekursif;
import java.util.Scanner;

public class BilanganPrima {
    
    public static boolean bilPrima(int angka){
        if (angka <=1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(angka); i++)
            if (angka % i == 0){
                return false;
        }
    return true;
}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bilangan = input.nextInt();
        
        if (bilPrima(bilangan)){
            System.out.println(bilangan + " adalah bilangan prima");
        }else{
            System.out.println(bilangan + " bukan bilangan prima");
        }
    }
    
}
