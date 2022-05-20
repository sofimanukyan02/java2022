package homework.arrayutil;

public class CharArrayExample3 {
    public static void main(String[] args) {
        char[] charArray = new char[]{'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y' };

        String str = new String(charArray);
        boolean var = str.endsWith("ly");
        System.out.println("str ends with 'l;y'=: " + var);
    }

}
