import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int element = scanner.nextInt();
        boolean contains = false;

        for (int x : arr) {
            if (x == element) {
                contains = true;
            }
        }

        System.out.println(contains);
    }
}
