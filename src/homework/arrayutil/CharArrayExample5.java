package homework.arrayutil;

public class CharArrayExample5 {
    public static void main(String[] args) {
        char[] charArray = new char[]{' ',' ','b','a','r','e','v',' ',' ' };
        String str = new String(charArray);
        String result="=";
        for (int i = 0; i < charArray.length ; i++) {
            if (i!= charArray.length-1)
                result+=charArray[i]+"";
            else
                result+=charArray[i]+"";

        }
        System.out.print(result);
    }
}
