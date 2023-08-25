package oop.interfaceall.functional;

import java.util.function.Predicate;
//single result test
public class PredicateExample {
    public static void main(String[] args) {
        Predicate<String> checklen=str->str.length()>5;

        System.out.println(checklen.test("sanjana"));
        System.out.println(checklen.test("sa"));
    }
}
