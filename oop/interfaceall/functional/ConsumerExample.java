package oop.interfaceall.functional;

import java.util.function.Consumer;

class Person
{
    String name;
    public String getName()
    {
        return name;
    }
    public  void setName(String s)
    {
        name=s;
    }
}
public class ConsumerExample {
    public static void main(String[] args) {
        Person p=new Person();
        Consumer<Person> setName=t->t.setName("sanjana bipin pawar");
        setName.accept(p);
        System.out.println(p.getName());
    }
}
