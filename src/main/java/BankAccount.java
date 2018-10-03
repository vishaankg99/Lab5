import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 5.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/5/">Lab 5 Description</a>
 */
public class BankAccount extends Bank {

    /**
     * You may want to use this to distinguish between different kinds of accounts.
     */
    public enum BankAccountType {
        /**
        * Test.
        */
        CHECKINGS,
        /**
        * Test.
        */
        SAVINGS,
        /**
        * Test.
        */
        STUDENT,
        /**
        * Test.
        */
        WORKPLACE
    }

    /**
     * number generator.
     */
    private Random random = new Random();

    /**
     * total account.
     */
    private static int totalAccounts = 0;


    /**
     * The account number.
     */
    private int accountNumber;
    /**
    *The account number.
    */
    private BankAccountType accountType;
    /**
     *The bank and account type.
     */
    private double accountBalance;
    /**
     *The account balance.
     */
    private String ownerName;
    /**
     *The owner name.
     */
    private double interestRate;
    /**
     *The interest rate.
     */
    private double interestEarned;

    /**
     * the interest earned.
     * @param name the name.
     * @param accountCategory the account category.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        totalAccounts++;
        this.accountNumber = random.nextInt();

    }

    /**
     * get the account number.
     * @return accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * get the account type.
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return accountType;
    }

    /**
     * get the account balance.
     * @return accountBalance the try.
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * get owner name.
     * @return ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * get interest name.
     * @return interestRate
     */
    public double getInterestRate() {
        return interestRate;
    }

    /**
     * get interest earned.
     * @return interestEarned
     */
    public double getInterestEarned() {
        return interestEarned;
    }
}
