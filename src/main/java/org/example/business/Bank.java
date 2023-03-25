package org.example;

public interface Bank {
    public int depositMonies(String accountNo, int amount) throws AccountNumberNotFoundException;
    public String findBalance(String accountNo);
    public String moveFunds(String accountFrom, String AccountTo);
}
