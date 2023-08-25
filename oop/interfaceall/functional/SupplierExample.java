package oop.interfaceall.functional;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Integer> s=()->5510;
        System.out.println(s.get());
        //get method given

    }
}
