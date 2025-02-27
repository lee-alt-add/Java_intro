/*
ShadyRestRoom
In a file called ShadyRestRoom.java create an application that determines the price for a room.
Ask the user to choose 1 for a queen bed, 2 for a king bed or 3 for a king bed and pullout couch.
The output must reflect the input and the price of the room: R500 for a queen bed, R700 for king bed and R900 for a king bed and a pullout couch.
If the user inputs an invalid choice display a corresponding message and set the price to R0.
Now ask the user to specify 1 for a lake view or 2 for a park view, but only ask them if the bed size entry is valid.
Add R100 to the price of any room with a lake view.
If the input value for view is invalid display a corresponding message and set the price of the room as lake view.

 */


import java.util.Scanner;


public class ShadyRestRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bed;
        int bed_choice;
        int price = 0;



        do {
            System.out.println("choose 1 for a queen bed, 2 for a king bed or 3 for a king bed and pullout couch");
            System.out.print("Choice: ");
            bed_choice = scanner.nextInt();

            switch (bed_choice) {
                case 1:
                    bed = "queen";
                    price += 500 + add_view_price(scanner);
                    System.out.printf("%s%d", "You've chosen " + bed + ", cost R", price);
                    break;
                case 2:
                    bed = "king";
                    price += 700 + add_view_price(scanner);
                    System.out.printf("%s%d", "You've chosen " + bed + ", cost R", price);
                    break;
                case 3:
                    bed = "king with pullout couch";
                    price += 900 + add_view_price(scanner);
                    System.out.printf("%s%d", "You've chosen " + bed + ", cost R", price);
                    break;
                default:
                    System.out.println("Invalid choice, try again!");
            }
        } while (1 > bed_choice || bed_choice > 3);
    }

    public static int add_view_price(Scanner scanner) {

        System.out.println("specify 1 for a lake view or 2 for a park view");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();

        if (choice != 2) {
            return  100;
        }
        return 0;
    }
}
