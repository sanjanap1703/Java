package collectionframework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Arraylistex {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(5);
        a.add(6);
        a.add(78);
        a.add(89);
        System.out.println(a);
        System.out.println("Ways of traversing");
        for(Integer e: a)
        {
            System.out.print(e+" ");
        }
        System.out.print("\n");
        for (int i=0;i<a.size();i++)
        {
            System.out.print(a.get(i)+" ");
        }
        System.out.print("\n");
        Iterator<Integer> i=a.iterator();
        while ((i.hasNext()))
        {
            System.out.print(i.next()+" ");
        }
        System.out.print("\n");
        a.forEach(d-> System.out.print(d+" "));
        System.out.print("\n");
        a.forEach(e->e=e+10);
        System.out.println(a);
        System.out.println(a.isEmpty());
        System.out.println(a.stream().max((d,e)->d-e));
        a.sort(Comparator.reverseOrder());
        System.out.println(a);
        a.add(5);
        a.removeAll(List.of(5,17,6));
        System.out.println(a);
        a.set(a.size()-1,45);
        System.out.println(a);
        for (int s=0;s<10;s++)
        {
            a.add(s+15);
        }
        System.out.println(a);
        List<Integer> s=a.subList(2,a.size()-1);
        System.out.println(s);
        a.trimToSize();
        System.out.println(a);
        a.add(4560);
        System.out.println(a);
        System.out.println(a.containsAll(List.of(16,17,18,19,25)));
        System.out.println(a.contains(10));
        System.out.println(a);
        a.remove(5);
        System.out.println(a);
        a.add(5,15);
        System.out.println(a);
        System.out.println("first index of 15 : "+a.indexOf(15));
        System.out.println("last index of 15 : "+a.lastIndexOf(15));
        a.remove(new Integer(15));
        System.out.println(a);
        a.ensureCapacity(30);
        /*Integer[] ar=a.toArray();*///error
        Integer[] ar=new Integer[a.size()];
        a.toArray(ar);
        for (int m=0;m<a.size();m++)
        {
            System.out.print(ar[m]+" ");
        }
        System.out.println("");
       /* a.retainAll(List.of(15,16,17,18,19,20,1,21,22));
        System.out.println(a);*///only retains specified elements
        a.add(15);
        System.out.println(a);
        a.removeAll(List.of(15));
        System.out.println(a);
        a.removeIf(w->w%2==1);
        System.out.println(a);
    }
}
