import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int num = scanner.nextInt();
        int tmp = ++num;
        while (true) {
            if (tmp % 2 == 0) {
                System.out.println(tmp);
                break;
            } else {
                tmp++;
            }
        }
    }
}
