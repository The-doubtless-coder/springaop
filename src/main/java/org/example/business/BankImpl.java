package org.example;

import org.springframework.stereotype.Component;

@Component("bank")
public class BankImpl implements Bank{
    private int amount=5000;
    private String accountNumber= "kcb1234";

    public BankImpl(int amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    @Override
    public int depositMonies(String accountNo, int amount) throws AccountNumberNotFoundException {
        if(accountNumber.equalsIgnoreCase(this.accountNumber)){
            this.amount = this.amount + amount;
            return this.amount;
        }
        throw new AccountNumberNotFoundException();
    }

    public String findBalance(String accountNo){

        return null;
    }
    public String moveFunds(String accountFrom, String AccountTo){
        return null;
    }
}
