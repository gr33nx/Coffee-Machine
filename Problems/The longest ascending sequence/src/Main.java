import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int seq = 0;
        int temp = arr[0];
        int max = 0;
        for (int i = 1; i < size; i++) {
            if (temp < arr[i]) {
                seq++;
                if (seq > max) {
                    max = seq;
                }

            } else {
                seq = 0;
            }

            temp = arr[i];
        }


        System.out.println(++max);

    }
}