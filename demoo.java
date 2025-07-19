import java.util.*;
public class demoo {
    public static void main (String agrs []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your row:");
        int row = sc.nextInt();

        System.out.println("Enter your colum:");
        int colum = sc.nextInt();

       

        for(int i = 1; i < colum; i ++){
            for ( int j = 1 ; j < row ; j ++){
                System.out.print("*");
            }
            System.out.println("*");

        }

        
    }
    
}
