import java.util.*;
// is prime or not

public class Question {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n =sc.nextInt();
        // boolean ans =isPrime(n);
        // System.out.println(ans);
        // System.out.println(isArmstrong(n));
        for (int i=100; i<1000;i++){
            if(isArmstrong(i)){
                System.out.print(i+ " ");
            }
        }
    }

    // print all three gigit arstrong numbers
    static boolean isArmstrong(int n){
        int original= n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n= n/10;
            sum = sum +rem*rem*rem;
        }
        return original==sum;
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if(n%i==0){
                return false;
            }
            
        }
        return true;

    }
}
