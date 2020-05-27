import java.util.Scanner;

import static java.lang.System.exit;

class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        int input  = scanner.nextInt();
        int count = 1;
        int temp = 0;
        while(count <= input) {
            temp++;
            for(int i = 1; i <= temp; i++ ) {
                if (count < input){
                    System.out.print(temp + " ");
                    count++;
                } else if(count == input) {
                    System.out.print(temp);
                    count++;
                    exit(0);
                }


            }

        }
       /* if(count == input) {
            System.out.print(temp + 1);
        }*/
    }
}
