package org.example.customexceptions;

public class AccountNumberNotFoundException extends Exception{
    @Override
    public String toString() {
        return "account number not found";
    }
}
