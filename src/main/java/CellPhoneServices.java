/*
CellPhoneService
In a file called CellPhoneService.java, create an application that prompts the user for the max monthly amount they need for talking minutes, text messages and gigabytes of data.
Display a recommendation of the best plan for the users needs.
A user who needs less than 500 minutes, and no text messages or data should buy (Plan A at R150 per month).
A user who needs less than 500 minutes and any text messages should buy (Plan B at R210 per month).
A user who needs 500 or more minutes and no data should buy either (Plan C for up to 100 text messages at R90 per month) or (Plan D for 100 text messages or more at R115 per month).
A use who needs any data should buy (Plan E for up to 3 gigabytes at R 150 per month) or (Plan F for 3 gigabytes or more at R230 per month).
 */

import java.util.Scanner;

public class CellPhoneServices {

    public static void main(String[] args) {
        int minutes;
        boolean hasTextMessages;

        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                            Choices:
                            1. Minutes only
                            2. Minutes & Text Messages
                            3. Data""");
        System.out.print("Choice: ");
        int choice = scanner.nextInt();


        switch (choice) {

//          Minutes
            case 1:
                System.out.print("Minutes: ");
                minutes = scanner.nextInt();
                // A user who needs less than 500 minutes
                if (minutes < 500) {
                    System.out.println("""
                            Recommendation:
                            Plan A at R150 per month""");
                }
                // A user who needs 500 or more minutes and no data should buy either
                else {
                System.out.println("""
                            Recommendation:
                            Plan C for up to 100 text messages at R90 per month
                            Plan D for 100 text messages or more at R115 per month""");
                }
                break;

//          Minutes & Text Messages
            case 2:
                System.out.print("Minutes: ");
                minutes = scanner.nextInt();
                System.out.print("Text Messages: ");
                hasTextMessages = scanner.hasNext();
                if (minutes < 500 && hasTextMessages) {
                    System.out.println("""
                            Recommendation:
                            Plan B at R210 per month""");
                }
                break;

//          Data
            case 3:
                System.out.println("""
                        Recommendation:
                        Plan E for up to 3 gigabytes at R 150 per month
                        Plan F for 3 gigabytes or more at R230 per month""");
                break;
        }

        scanner.close();
    }
}
