import java.util.*;
public class Sum {
    public static void main(String[] args) {
        // int ans = sum2();
        // System.out.println(ans);
        int ans = sum3(3,4);
        System.out.println(ans);
    }

    //pass the value of numbers when you are calling the method in main()
    static int sum3(int a ,int b){
        int sum = a+b;
        return sum;
    }

    // return the value
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        int a ,b;
        System.out.println("enter value of a: ");
        a = sc.nextInt();
        System.out.println("enter value of b: ");
        b = sc.nextInt();
        System.out.println("Sum is: ");
        return a+b;

    }

    static void sum(){
        Scanner sc = new Scanner(System.in);
        int a ,b, ans;
        System.out.println("enter value of a: ");
        a = sc.nextInt();
        System.out.println("enter value of b: ");
        b = sc.nextInt();

        ans= a+b;
        System.out.println("Sum is: "+ans);

    }
}
