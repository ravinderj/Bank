/**
 * Account
 */
public class Account {
  private final int accountNumber;
  private final String name;
  private float balance;
  Account(int accountNumber, String name, float balance){
    this.accountNumber = accountNumber;
    this.name = name;
    this.balance = balance;
  }
  public int getAccountNumber(){
    return accountNumber;
  }
  public String getHolderName(){
    return name;
  }
  public float getBalance(){
    return balance;
  }
  public static void main(String[] args) {
    Account account = new Account(1, "Ravinder", 100);
    System.out.println(account.getAccountNumber());
  }
}
