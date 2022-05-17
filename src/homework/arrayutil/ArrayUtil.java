package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {15, 25, 98, 85, 64, 35, 74, 4, 9, 67,};
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }
        System.out.println("մասիվի ամենամեծ թիվը=" + max);
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }

        }
        System.out.println("մասիվի ամենափոքր թիվը=" + min);
        double sum = 0;
        double mean = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            mean = sum / array.length;

        }
        System.out.println("մասիվի բոլոր թվերի գումարը=" + sum);
        System.out.println("մասիվի էլեմենտների միջին թվաբանականը=" + mean);
        int evenCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenCount++;

            }
        }
        System.out.println("Մասիվի զույգերի քանակը = " + evenCount);
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }

        }
        System.out.println("Մասիվի կենտերի քանակը = " + oddCount);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");/*մասիվի զույգ թվերը*/
            }
        }
        System.out.println();
        for (int i = 0; i < array.length; i++) {/*մասիվի կենտ թվերը*/
            if (array[i] % 2 != 0)

                System.out.print(array[i] + " ");

        }
    }
}





