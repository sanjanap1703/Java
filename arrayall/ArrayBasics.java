package arrayall;
import java.util.*;
public class ArrayBasics {
    public static void main(String[] args) {
        Integer [] a1={1,2,3};
        Integer []  a2= a1.clone();//deepcopy
        for (int i: a2)
        {
            System.out.println(i);
        }
        a2[0]=5;
        System.out.println(Arrays.deepEquals(a1,a2));
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        a1=a2;//shallowcopy
        System.out.println(a1[0]);
        System.out.println(Arrays.deepEquals(a1,a2));
    }
}
