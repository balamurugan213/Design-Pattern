package oops;

public class Account {
    private float balance;

    public  void setBalance(float bal){
        if(bal>0)
                this.balance=bal;
    }
    public float getBalance(){
        return this.balance;
    }
}
