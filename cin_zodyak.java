import java.util.Scanner;

public class cin_zodyak {

    public static void main(String[] args) {
        
        int dogumyılı , kalan ;
        Scanner input = new Scanner(System.in);
        System.out.print("DOĞUM YILINIZI GİRİNİZ : ");
      
        dogumyılı = input.nextInt(); 
        

        kalan = (dogumyılı %12);

        if(kalan == 0){
            System.out.print("MAYMUN");
        }
        else if (kalan == 1){
            System.out.print("HOROZ");
            
        }
        else if ( kalan == 2){
            System.out.print("KÖPEK");
        
        }

        else if ( kalan == 3){
            System.out.print("DOMUZ");
        
        }
        else if (kalan == 4 ){
            System.out.print("FARE");
        }
        
        else if (kalan == 5){
            System.out.print("ÖKÜZ");
        }

        else if ( kalan == 6){
            System.out.print("KAPLAN");
        }
        else if ( kalan == 7 ){
            System.out.print("TAVŞAN");
        }
        else if (kalan == 8) {
            System.out.print("EJDERHA");
            
        }
        else if ( kalan == 9){

            System.out.print("YILAN ");

        }

        else if (kalan == 10){
            System.out.println("AT");
        }

        else if(kalan == 11) {
            System.out.println("KOYUN");
        }
        
        
        else {
            System.out.println("EKSİK VEYA HATALI TUŞLAMA YAPTINIZ ");
        }





    }
    
}