package StreamApi;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>();
        a.add(45);
        a.add(78);
        a.add(789);
        System.out.println("minimum element using min function "+a.stream().min((r,q)->r-q).orElse(0));
        System.out.println("average  function "+a.stream().mapToInt((x)->x).average());
        a.stream().forEach(y->System.out.println(y+10));
        a.stream().filter(y->y%2==0).forEach(y->System.out.println(y));
        System.out.println("use of map");
        a.stream().map(x->x-100).forEach(x-> System.out.println(x));
        List<Integer> b=a.stream().map(y->y-100).collect(Collectors.toList());
        int ar[]=a.stream().mapToInt(y->y-100).toArray();
        System.out.println("array");
        for (int s: ar)
        {
            System.out.println(s);
        }
        System.out.println(b);
        b.add(45);
        System.out.println(b);
        ArrayList<Integer> o=new ArrayList<Integer>();
        o.add(15);
        o.add(79);
        o.add(78);
        o.add(14);
        o.add(16);
        o.add(14);
        System.out.println("show if any element match or not "+o.stream().anyMatch(y->y==71));
        System.out.println("Count of even"+o.stream().filter(x->x%2==0).count());
        System.out.println("Count of even distinct"+o.stream().filter(x->x%2==0).distinct().count());
        IntSummaryStatistics i=o.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println(" Minimum "+i.getMin());
        System.out.println("Max "+i.getMax());
       /*o.stream().peek(e->e).forEach(e-> System.out.println(e));*/
        System.out.println(i.getSum());
        System.out.println(o.stream().map((x)->x).reduce(0,(t,y)->t+y));//sum of all elements
        System.out.println(Integer.sum(4,5
        ));
    }
}
