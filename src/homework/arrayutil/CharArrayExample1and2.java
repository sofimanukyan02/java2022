package homework.arrayutil;

public class CharArrayExample1and2 {
    public static void main(String[] args) {
        char[] charArray = new char[]{'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e' };
        String str = new String(charArray);
        char c = str.charAt(5);
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            if (str.charAt(i) == 'o') {
                counter++;
            }

        }
        System.out.println(" c-փոփոխականի քանակը մեր մասիվի մեջ = " + counter);
        System.out.println(str.substring(3,5));

    }

}
