public class Loan {
    public static boolean isEligibleForLoan(int income) {
        if(income > 40000) {
            return true;
        } else {
            return false;
        }
    }
}
