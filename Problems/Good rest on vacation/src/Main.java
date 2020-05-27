import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int duration = scanner.nextInt();
        int foodPerDay =  scanner.nextInt();
        int flightPerWay = scanner.nextInt();
        int hotelPerNight = scanner.nextInt();

        System.out.println(foodPerDay * duration + flightPerWay * 2 + hotelPerNight * (duration - 1));
    }

}