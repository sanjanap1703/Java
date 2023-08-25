package collectionframework;

import java.util.Collections;
import java.util.Stack;

public class Stackex {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<>();
        s.add(15);
        s.add(78);
        System.out.println(s);
        s.push(79);
        System.out.println(s);
        s.pop();
        System.out.println(s);
        s.push(15);
        s.remove(new Integer(15));
        System.out.println(s);
        s.add(5);
        System.out.println(s);
        System.out.println(s.stream().min((e,t)->e-t).orElse(new Integer(-1)));
        System.out.println(s);
        s.remove(1);
        System.out.println(s);
        s.add(1,5);
        System.out.println(s);
        System.out.println(Collections.min(s));
    }
}
