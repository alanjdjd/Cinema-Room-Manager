import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    public static void Tickets(){

        final int NORMAL_TICKET = 10;
        final int BACK_TICKET = 8;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows:");
        int amountOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int seatsPerRow = scanner.nextInt();

        char[][] cinemaSeats = new char[amountOfRows][seatsPerRow];

        int purchasedTickets = 0;
        int currentIncome = 0;

        for(int i = 0; i < cinemaSeats.length; i++){
            Arrays.fill(cinemaSeats[i], 'S');
        }

        int choice = 1;
        while(choice != 0){
            System.out.println("\n1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");
            choice = scanner.nextInt();
            if(choice == 1){
                System.out.print("\nCinema:\n  ");
                for(int seatNum = 0; seatNum < seatsPerRow; seatNum++){
                    System.out.printf("%d ", seatNum + 1);
                }
                System.out.println();
                for(int row = 0; row < amountOfRows; row++){
                    System.out.printf("%d ", row + 1);
                    for(int seat = 0; seat < seatsPerRow; seat++){
                        System.out.printf("%s ", cinemaSeats[row][seat]);
                    }
                    System.out.println();
                }
            }
            if(choice == 2){
                boolean availableSeat = false;
                int customerRow = 0;
                int customerSeat = 0;
                while(!availableSeat){
                    System.out.println("\nEnter a row number:");
                    customerRow = scanner.nextInt() - 1;
                    System.out.println("Enter a seat number in that row:");
                    customerSeat = scanner.nextInt() - 1;
                    if(customerSeat >= cinemaSeats[1].length || customerRow >= cinemaSeats.length){
                        System.out.println("\nWrong input!");
                    }else{
                        if(cinemaSeats[customerRow][customerSeat] == 'S'){
                            purchasedTickets++;
                            availableSeat = true;
                        }else{
                            System.out.println("\nThat ticket has already been purchased!");
                        }
                    }
                }

                int amountOfSeats = amountOfRows * seatsPerRow;

                int ticket = NORMAL_TICKET;
                if(amountOfSeats > 60){
                    System.out.println("jes!(@#()!@#*)(!@#()@!*()!@#*)(@!*#)(*!#()*!@()#*()!@#*()!@*");
                    System.out.println("jes!(@#()!@#*)(!@#()@!*()!@#*)(@!*#)(*!#()*!@()#*()!@#*()!@*");
                    System.out.println("jes!(@#()!@#*)(!@#()@!*()!@#*)(@!*#)(*!#()*!@()#*()!@#*()!@*");
                    System.out.println("jes!(@#()!@#*)(!@#()@!*()!@#*)(@!*#)(*!#()*!@()#*()!@#*()!@*");
                    System.out.println("jes!(@#()!@#*)(!@#()@!*()!@#*)(@!*#)(*!#()*!@()#*()!@#*()!@*");
                    System.out.println("jes!(@#()!@#*)(!@#()@!*()!@#*)(@!*#)(*!#()*!@()#*()!@#*()!@*");
                    int frontSeats = (amountOfRows / 2) * seatsPerRow;
                    System.out.println(frontSeats / seatsPerRow);
                    int backSeats = (amountOfRows - amountOfRows / 2) * seatsPerRow;
                    System.out.println(backSeats / seatsPerRow);
                    if(customerRow + 1 > amountOfRows / 2){
                        ticket = BACK_TICKET;
                    }
                }

                System.out.printf("Ticket price: $%d\n\n", ticket);
                currentIncome += ticket;
                cinemaSeats[customerRow][customerSeat] = 'B';
            }
            if(choice == 3){
                //number of purchased tickets
                //number of purchased tickets as percentage
                //current income
                //total income if all are full
                int totalIncome = 0;
                int amountOfSeats = seatsPerRow * amountOfRows;
                if(amountOfSeats <= 60){
                    totalIncome = amountOfSeats * 10;
                }
                if(amountOfSeats > 60){
                    int frontSeats = (amountOfRows / 2) * seatsPerRow;
                    int backSeats = (amountOfRows - amountOfRows / 2) * seatsPerRow;
                    totalIncome = frontSeats * NORMAL_TICKET + backSeats * BACK_TICKET;
                }
                System.out.printf("\nNumber of purchased tickets: %d\n", purchasedTickets);
                double percentageBought = (double) purchasedTickets / amountOfSeats * 100;
                System.out.printf("Percentage: %,.2f%%\n", percentageBought);
                System.out.printf("Current income: $%d\n", currentIncome);
                System.out.printf("Total income: $%d\n", totalIncome);
            }
        }
    }

    public static void Sold(){
        //ask for number of rows and seats in each row
        //if total number of seats is less or equal to 60 then ticket is 10 dollars

        //if there are more than 60 seats then half of front row is 10 dollars and rest is 8 dollars
        // if odd then the first 4 are 10 and rest is 8
        Scanner scanner = new Scanner(System.in);

        final int NORMAL_TICKET = 10;
        final int BACK_TICKET = 8;

        System.out.println("Enter the number of rows:");
        int amountOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int amountOfSeatsPerRow = scanner.nextInt();
        int amountOfSeats = amountOfSeatsPerRow * amountOfRows;
        System.out.println(amountOfSeats);

    }
}
