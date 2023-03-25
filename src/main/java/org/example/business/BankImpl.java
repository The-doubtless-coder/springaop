package org.example.business;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.customexceptions.AccountNumberDoesNotMatchException;
import org.example.customexceptions.AccountNumberNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("bank")
public class BankImpl implements Bank {
    private int amount = 5000;
    private String accountNumber = "kcb123";

    public BankImpl(int amount, String accountNumber) {
        this.amount = amount;
        this.accountNumber = accountNumber;
    }

    public int depositMonies(String accountNo, int amount) throws AccountNumberNotFoundException {
//        Log log = LogFactory.getLog(this.getClass());
//        log.info("this is the deposit method::");
        if (this.accountNumber.equalsIgnoreCase(accountNo)) {

            this.amount = this.amount +  amount;
            return this.amount;
        }
        throw new AccountNumberNotFoundException();
    }
    @Override
    public int findBalance(String accountNo) throws AccountNumberDoesNotMatchException {
        if(this.accountNumber.equalsIgnoreCase(accountNo)){
            return this.amount;
        }
        throw new AccountNumberDoesNotMatchException();
    }

    public String moveFunds(String accountFrom, String AccountTo) {
        return null;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
