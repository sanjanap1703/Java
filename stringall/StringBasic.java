package stringall;

public class StringBasic {
    public static void main(String[] args) {
        String s3="sanjana";
        String s4="sanjana";
        String s=new String("sanjana");
        System.out.println(s3.equals(s));//trur
        String s2= new String("sanjana");
        System.out.println(s.equals(s2));//true
        System.out.println(s3==s);//false
        System.out.println(s==s2);//compares value of references output is false
        System.out.println(s3==s4);//true
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(" Pawar"));
        String c=s.concat(" Pawar");
        String c2="sanjana Pawar";
        String c3=new String("sanjana Pawar");
        System.out.println(c.equals(c3));
        System.out.println(c.equals(c2));
        System.out.println(s.repeat(5));
        System.out.println(s.indexOf('a'));
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.hashCode()==s2.hashCode());
        System.out.println(System.identityHashCode(s)==System.identityHashCode(s2));//with new code differnt objects
        System.out.println(System.identityHashCode(s3)==System.identityHashCode(s4));//referencing to same copy
    }
}
