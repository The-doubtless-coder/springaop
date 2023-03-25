package org.example.business;

import org.example.customexceptions.AccountNumberDoesNotMatchException;
import org.example.customexceptions.AccountNumberNotFoundException;

public interface Bank {
    public int depositMonies(String accountNo, int amount) throws AccountNumberNotFoundException;
    public int findBalance(String accountNo) throws AccountNumberDoesNotMatchException;
    public String moveFunds(String accountFrom, String AccountTo);
}
