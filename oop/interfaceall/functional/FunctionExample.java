package oop.interfaceall.functional;

import java.util.function.Function;

public class FunctionExample {
    public static void main(String[] args) {
        Function<Integer,Integer> f=i->i*10;
        System.out.println(f.apply(40));
        //second is return type
        //applymethod
    }
}
