import java.util.Scanner;

public class Main {

    public static boolean isComposite(long number) {
        boolean isCompo = false;
        if (number == 1 || number == 2) {
            return  false;
        } else {
            int i = 2;
            while (i < number) {
                if ((number % i) == 0) {
                    isCompo = true;
                    break;
                }
                i++;
            }
        }

        return  isCompo;

    }


    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final long number = scanner.nextLong();
        System.out.println(isComposite(number));
    }
}