package WrapperClass;

public class CharacterWrap {
    public static void main(String[] args) {
        Character c=new Character('A');
        System.out.println("Is it digit: "+Character.isDigit(c));
        System.out.println(" Is 5 is digit "+ Character.isDigit(5));//returns false because ascii gets considered
        System.out.println("Is '5' is digit "+Character.isDigit('5'));//true
        System.out.println("Is object c is lowercase "+Character.isLowerCase(c));
        System.out.println("is char A is lowecase " +Character.isDigit('A'));
        System.out.println("Is object c is Uppercase "+Character.isUpperCase(c));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isLetter(c));
        Character.toLowerCase(c);
        System.out.println(c);//changes made using toLowercase are immutable
        System.out.println(Character.toLowerCase(c));
        System.out.println(Character.toUpperCase('k'));
        System.out.println(Character.isLetterOrDigit('5'));
        System.out.println(Character.isLetterOrDigit('a'));
        System.out.println(Character.isLetterOrDigit('@'));
        Character t=Character.valueOf('@');
        System.out.println(Character.isJavaIdentifierPart(t));
    }
}
