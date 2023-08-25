package overview;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.nio.file.WatchEvent;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;

public class ClassInfo {
  final public void method1(){}
   static int method_cutsom(int a,int b, float c, char d){ return a;}
    public  static void main(String[] args) {
        ClassInfo o=new ClassInfo();
        //o.getClass();
        System.out.println("this is classname:"+o.getClass().getName());
        System.out.println("-----------------------------------------------------------");
        Class c=o.getClass();
        Method s[]=c.getDeclaredMethods();
        for(Method m: s)
        {
            System.out.println(m.getName());
            System.out.println(m.getDeclaringClass());
            System.out.println(m.getAnnotatedReturnType());
            System.out.println(m.getReturnType());
            System.out.println(m.getParameterCount());
            int  mod=m.getModifiers();//defined in java.lang.Executable
            System.out.println("count of modifiers "+mod);//returnns numerical value for enum Modifier
           /* Type t[]=m.getParameterTypes();
            for(Type i: t)
            {
                System.out.println(t.toString());
            }*/
            System.out.println("-----------------------------------------------------------");
        }
        //System.out.println(Arrays.toString(s));
        System.out.println("Modifier enum values");
        /*EnumMap<Modifier, String> stateMap = new EnumMap<Modifier, String>(Modifier.class);
        Iterator<Modifier> i=stateMap.keySet().iterator();
        while (i.hasNext())
        {
            Modifier currentState = i.next();
            System.out.println("key : " + currentState + " value : " + stateMap.get(currentState));
        }*/
        System.out.println("Static :"+Modifier.STATIC);
        System.out.println("Abstract  " +Modifier.ABSTRACT);
        System.out.println("Final :"+Modifier.FINAL);
        System.out.println("Public :"+Modifier.PUBLIC);

    }
}
//geclasss = to get class object which represents the object
//getname = method of class which tells fully qualified name of class
//Class is defined in java.lang : by default imported
//direct passing array to print prints object address hexadecimal
//// getDeclaredMethods : getting all methods in an array of Method objects