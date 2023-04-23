package machine;

import java.util.Scanner;

public class CoffeeMachine {
    int water;
    int milk;
    int coffeeBean;
    int disposableCups;
    int money;

    public CoffeeMachine(int water, int milk, int coffeeBean, int disposableCups, int money) {
        this.coffeeBean = coffeeBean;
        this.milk = milk;
        this.water = water;
        this.disposableCups = disposableCups;
        this.money = money;
    }

    public void getStatus() {
        System.out.println("\nThe coffee machine has:\n" +
                this.water + " ml of water\n" +
                this.milk + " ml of milk\n" +
                this.coffeeBean + " g of coffee beans\n" +
                this.disposableCups + " disposable cups\n" +
                "$" + this.money + " of money\n");
    }

    public void buy(String option) {

        switch (option) {
            case "1": {
                if(this.water - 250  >= 0) {
                    this.water -= 250 ;
                }else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if(this.coffeeBean - 16  >= 0) {
                    this.coffeeBean -= 16 ;
                }else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if(this.disposableCups - 1 >= 0) {
                    this.disposableCups--;
                }else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                this.money += 4;
                break;
            }
            case "2": {
                if(this.water - 350 >= 0) {
                    this.water -= 350;
                }else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if(this.milk - 75 >= 0) {
                    this.milk -= 75;
                }else {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if(this.coffeeBean - 20 >= 0) {
                    this.coffeeBean -= 20;
                }else {
                    System.out.println("Sorry, not enough coffee!");
                    break;
                }
                if(this.disposableCups - 1 >= 0) {
                    this.disposableCups--;
                }else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                this.money += 7;
                break;
            }
            case "3": {
                if(this.water - 200  >= 0) {
                    this.water -= 200 ;
                }else {
                    System.out.println("Sorry, not enough water!");
                    break;
                }
                if(this.milk - 100  >= 0) {
                    this.milk -= 100 ;
                }else {
                    System.out.println("Sorry, not enough milk!");
                    break;
                }
                if(this.coffeeBean - 12  >= 0) {
                    this.coffeeBean -= 12 ;
                }else {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                }
                if(this.disposableCups - 1 >= 0) {
                    this.disposableCups--;
                }else {
                    System.out.println("Sorry, not enough disposable cups!");
                    break;
                }
                System.out.println("I have enough resources, making you a coffee!");
                this.money += 6;
                break;
            }
            case "back":{
                break;
            }
        }
//        getStatus();
    }
    public void fill(int water, int milk, int coffeeBean, int cups){

        this.water += water;

        this.milk += milk;

        this.coffeeBean += coffeeBean;

        this.disposableCups += cups;
//        getStatus();
    }
    public void take(){
        System.out.println("I gave you "+"$"+this.money);
        this.money = 0;
        String str;
//        getStatus();
    }
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(400,540,120,9,550);
        Scanner scanner = new Scanner(System.in);
//        coffeeMachine.getStatus();
        label:
        while(true){
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            String option = scanner.next();
            switch (option) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:, back- to main menu:");
                    String buyOption = scanner.next();
                    coffeeMachine.buy(buyOption);
                    break;
                case "fill":
                    System.out.println("Write how many ml of water you want to add: ");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeBean = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add: ");
                    int cups = scanner.nextInt();
                    coffeeMachine.fill(water,milk,coffeeBean,cups);
                    break;
                case "take":
                    coffeeMachine.take();
                    break;
                case "remaining":
                    coffeeMachine.getStatus();
                    break;
                case "exit":
                    break label;
            }
        }

//        System.out.println("Write how many ml of water the coffee machine has:");
//        water = scanner.nextInt();
//        System.out.println("Write how many ml of milk the coffee machine has:");
//        milk = scanner.nextInt();
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        coffeeBean = scanner.nextInt();
//        System.out.println("Write how many cups of coffee you will need:");
//        int cups = scanner.nextInt();
//        int minCup = water / 200;
//        minCup = minCup < milk / 50 ? minCup : milk / 50;
//        minCup = minCup < coffeeBean / 15 ? minCup : coffeeBean / 15;
//        if (minCup == cups) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if (minCup > cups) {
//            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)\n", minCup - cups);
//        } else if (minCup < cups) {
//            System.out.printf("No, I can make only %d cup(s) of coffee", minCup);
//        }
    }
}
