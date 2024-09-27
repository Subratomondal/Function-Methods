public class Scope {
    public static void main(String[] args) {
        int a =10; //  declaration as well as initialisation
        int b =20;
        String name = "Subrato";
        {
//          int a =34; //already initialised outside the block in the same method, hence you cannot initialize it again
            a=100; // we can reassign the original ref value to some other value (updation)
            int c = 99;
            name = "Anshu";
            System.out.println(a);

        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block


    }

    static void random(int marks){
        int num = 67;
        System.out.println(num);
//        System.out.println(a);    // it will not be able t0 access the value of a outisde the main method
    }
}

