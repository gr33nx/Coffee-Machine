import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            if (scanner.nextInt() == 0) {
                break;
            } else {
                count++;
            }
        }
        System.out.println(count);
    }
}