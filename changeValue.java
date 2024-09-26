import java.util.*;
public class changeValue {
    public static void main(String[] args) {
        int[] arr={1,2,4,3,5,6,7};
        change(arr);
        System.out.println(Arrays.toString(arr)); 
    }
    // here the value will be changed because it will not create any new object ,it is pointing to the same object of arr . So any changes will you make inside this the orginal value will also be changed automatically
    static void change(int[] nums){
        nums[0]=11;
    }
}
