package consolebank;

abstract class Account {
    protected long accNo;
    protected String holderName;
    protected double balance;
    protected String account_type;
    protected String caller;

    public Account(long accNo, String holderName, double balance, Class<?> caller) {
        this.accNo = accNo;
        this.holderName = holderName;
        this.balance = balance;
        this.caller=caller.getSimpleName();
        		}

    public void deposit(double amount) {
        balance += amount;
    }

    public void deposit(int amount) {   // Method Overloading
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient balance");
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println(accNo + " , " + holderName + " , " + balance+" , "+caller);
    }

    public abstract void calculateInterest(); // Abstract Method
}
