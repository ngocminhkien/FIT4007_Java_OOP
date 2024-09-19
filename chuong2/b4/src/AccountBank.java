public class AccountBank {
    private long accountNumber;
    private String accountName;
    private double balance;
    public static final double INTEREST_RATE = 0.035;

    public AccountBank() {
        accountNumber = 0;
        accountName = "";
        balance = 50.0;
    }

    public AccountBank(long accountNumber, String accountName, double balance) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;

    }

    public double deposit(double amount){// nap
        if(amount > 0){
            balance += amount;
        }else{
            System.out.println("Incorrect entry!");
        }
        return balance;
    }

    public double withdrawals(){//rut
        if (balance > 0 &&  > 0){
            balance -= ;
        }else{
            System.out.println("Incorrect entry!");
        }
        return balance;
    }

    public double accrueInterest(){//dao hoan
        return balance = balance * INTEREST_RATE;
    }

    public double transfer(){//chuyen
        if(balance > 0 && transfer() > 0) {
            balance = balance - transfer();
        }else{
            System.out.println("Incorrect entry!");
        }
        return balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "AccountBank{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", balance=" + balance +
                ", deposit=" + deposit() +
                ", transfer=" + transfer() +
                ", accrueInterest=" + accrueInterest() +
                '}';
    }
}

