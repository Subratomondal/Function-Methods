public class Swap {

    public static void main(String[] args) {
        int a= 10;
        int b =20;

        int temp =a ;
        a=b;
        b=temp;
        System.out.println(a+" "+b);
        // swap(a,b);
        // System.out.println(a+" "+b);
    }
    // here in this case value will not be changed 
    static void swap(int num1, int num2){
        int temp = num1; // this will create another object and these cahnged values can accessible inside this scope only
        num1= num2;
        num2 =temp;
    }
    
}
