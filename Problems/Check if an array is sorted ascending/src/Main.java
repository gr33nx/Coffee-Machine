import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
           arr[i] = scanner.nextInt();
        }
        int temp = 0;
        boolean ascending = true;
        for (int ele : arr) {
            if (ele < temp) {
                ascending = false;
                break;
            } else {
                temp = ele;
            }
        }

        System.out.println(ascending);
    }
}