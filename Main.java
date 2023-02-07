import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // accepting input from the user
        int income = sc.nextInt();

        // checking whether the income category is eligible for loan or not
        if(Loan.isEligibleForLoan(income)) {
            System.out.println("Eligible");
        } else {
            System.out.println("Non-Eligible");
        }

        // closing resource
        sc.close();
    }
}
