package org.example;

public class AccountNumberNotFoundException extends Exception{
    @Override
    public String toString() {
        return "account number not found";
    }
}
