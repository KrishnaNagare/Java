import java.util.*;
public class ternaryoperatore {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entewr Frist Number:");
        int a = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
        System.out.println("The greater number is :" + max);
    }

    
}
