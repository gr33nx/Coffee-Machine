import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();

        if (n1 != n2 && n2 != n3 && n1 != n3){
            System.out.println("true");
        } else System.out.println("false");
    }
}