import java.util.Scanner;

public class TournamentGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of people: ");
        int numPeople = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        String[] people = new String[numPeople];
        for (int i = 0; i < numPeople; i++) {
            System.out.print("Enter the name of person " + (i + 1) + ": ");
            people[i] = scanner.nextLine();
        }

        System.out.println("Tournament schedule:");
        for (int i = 0; i < numPeople - 1; i++) {
            System.out.println("\nRound " + (i + 1) + ":");
            for (int j = 0; j < numPeople / 2; j++) {
                int person1Index = j;
                int person2Index = numPeople - 1 - j;
                System.out.println(people[person1Index] + " vs " + people[person2Index]);
            }

            // Rotate the array of people for the next round
            String temp = people[numPeople - 1];
            for (int j = numPeople - 1; j > 1; j--) {
                people[j] = people[j - 1];
            }
            people[1] = temp;
        }

        scanner.close();
    }
}
