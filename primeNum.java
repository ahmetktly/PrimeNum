import java.util.Scanner;

public class primeNum{

    public static void main(String[] args) {
        
        int i  ;

        Scanner inp=new Scanner(System.in);

        System.out.println("sınır sayısı giriniz");

        int a=inp.nextInt();

        for(i = 1 ; i <=a ; i++ ){

            int counter=0;
            
            for(int k = i ; k >= 1 ; k--){

                int num=(i % k);

                if ( num == 0){

                    counter++;

                }
            }
                if ( counter == 2){

                    System.out.print(i+ " , ");
                
            }
   
        }
    }

}