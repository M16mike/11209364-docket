import java.util.Scanner;

public class CreationWeek {
    public static void main(String[] args) {
     
        String[] creationWeek = {
            "Day 1: Light (Genesis 1:1-5)",
            "Day 2: Sky and Waters (Genesis 1:6-8)",
            "Day 3: Land, Seas, Vegetation (Genesis 1:9-13)",
            "Day 4: Sun, Moon, Stars (Genesis 1:14-19)",
            "Day 5: Birds and Sea Creatures (Genesis 1:20-23)",
            "Day 6: Animals and Mankind (Genesis 1:24-31)",
            "Day 7: Rest (Genesis 2:1-3)"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a day of the creation week (1 to 7): ");
        int day = scanner.nextInt();

        if (day >= 1 && day <= 7) {

            System.out.println(creationWeek[day - 1]);
        } else {
            
            System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }

        scanner.close();
    }
}


