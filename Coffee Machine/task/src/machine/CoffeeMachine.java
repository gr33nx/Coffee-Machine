package machine;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CoffeeMachine {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {




    /*  System.out.println("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");*/

    /*
        System.out.println("Write how many cups of coffee you will need:");
        int cups = scanner.nextInt();

        int water = 200;
        int milk = 50;
        int beans = 15;
        System.out.println("For "+ cups +" cups of coffee you will need:");
        System.out.println(water * cups + " ml of water");
        System.out.println(milk * cups + " ml of milk");
        System.out.println(beans * cups + " g of coffee beans");*/

    /*
        System.out.println("Write how many ml of water the coffee machine has: ");
        int waterRemaining = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milkRemaining = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int beansRemaining = scanner.nextInt();

        System.out.println("Write how many cups of coffee you will need: ");
        int cupsRequested = scanner.nextInt();

        int waterRequired = cupsRequested * waterRemaining;
        int milkRequired = cupsRequested * milkRemaining;
        int beansRequired = cupsRequested * beansRemaining;

        boolean isEnough = true;
        if (waterRequired > waterRemaining || milkRequired > milkRemaining || beansRequired > beansRemaining) {
            isEnough = false;
        }

        int cupsPossible = 0;
        while (waterRemaining >= 200 && milkRemaining >= 50 && beansRemaining >= 15) {
            cupsPossible++;
            waterRemaining -= 200;
            milkRemaining -= 50;
            beansRemaining -= 15;
        }

        if (cupsRequested == cupsPossible) {
            System.out.println("Yes, I can make that amount of coffee");

        } else if (cupsRequested < cupsPossible) {
            System.out.println("Yes, I can make that amount of coffee (and even "+ (cupsPossible - cupsRequested)+" more than that)");
        }else {
            System.out.println("No, I can make only "+ cupsPossible +" cup(s) of coffee");
        }*/

        AtomicInteger water = new AtomicInteger(400);
        AtomicInteger milk = new AtomicInteger(540);
        AtomicInteger beans = new AtomicInteger(120);
        AtomicInteger disCups = new AtomicInteger(9);
        AtomicInteger money = new AtomicInteger(550);

        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of beans\n" +
                disCups + " of disposable cups\n" +
                money + " of money"
        );
        System.out.println("Write action (buy, fill, take):");
        String action = scanner.next();

        switch (action) {
            case "buy":
                buy(water,  milk,  beans,  disCups,  money);
                break;
            case "fill":
                fill(water,  milk,  beans,  disCups);
                break;
            case "take":
                take(money);
                break;
            default:
                break;
        }

        System.out.println("The coffee machine has:\n" +
                water + " of water\n" +
                milk + " of milk\n" +
                beans + " of beans\n" +
                disCups + " of disposable cups\n" +
                money + " of money"
        );
    }

    private static void take(AtomicInteger money) {
        System.out.println("I gave you $" + money);
        money.set(0);
    }
    private static void fill(AtomicInteger water, AtomicInteger milk, AtomicInteger beans, AtomicInteger disCups) {
        System.out.println("Write how many ml of water do you want to add:");
        water.set(water.get() + scanner.nextInt());
        milk.set(milk.get() + scanner.nextInt());
        beans.set(beans.get() + scanner.nextInt());
        disCups.set(disCups.get() + scanner.nextInt());
    }

    public static void buy(AtomicInteger water, AtomicInteger milk, AtomicInteger beans, AtomicInteger disCups, AtomicInteger money) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        int buyOption = scanner.nextInt();
        if (buyOption == 1) {
            water.set(water.get()-250);
            beans.set(beans.get()-16);
            money.set(money.get()+4);
            disCups.set(disCups.get()-1);
        } else if (buyOption == 2) {
            water.set(water.get()-350);
            milk.set(milk.get()-75);
            beans.set(beans.get()-20);
            money.set(money.get()+7);
            disCups.set(disCups.get()-1);

        } else if (buyOption == 3) {
            water.set(water.get()-200);
            milk.set(milk.get()-100);
            beans.set(beans.get()-12);
            money.set(money.get()+6);
            disCups.set(disCups.get()-1);
        }
    }

}

    


