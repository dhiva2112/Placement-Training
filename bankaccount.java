public class bankaccount{
    String accountholder;
    int accountnumber;
    double accountbalance;
    void createAccount(String accountholder,int accountnumber,double accountbalance){
        this.accountholder=accountholder;
        this.accountnumber=accountnumber;
        this.accountbalance=accountbalance;
    }
    void deposit(double amount){
        accountbalance+=amount;
        System.out.println("Deposited :"+amount);
        System.out.println("");
        
    }
    void withdraw(double amount){
        if(accountbalance>amount){
            accountbalance-=amount;
            System.out.println("Withdrawn :"+amount);
            System.out.println("");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    void displaybalance(){
        System.out.println("Account Holder Name :"+accountholder);
        System.out.println("Account Number :"+accountnumber);
        System.out.println("Account Balance :"+accountbalance);
        System.out.println("");
        System.out.println("--------------------------------");
    }
    public static void main(String[] args){
        bankaccount myAccount=new bankaccount();
        myAccount.createAccount("Dhivakaran Dhinakaran",123000123,1000.0);
        myAccount.deposit(500);
        myAccount.displaybalance();
        myAccount.withdraw(400);
        myAccount.displaybalance();
    }
}