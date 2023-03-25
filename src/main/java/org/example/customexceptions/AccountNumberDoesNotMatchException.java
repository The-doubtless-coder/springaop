package org.example.customexceptions;

public class AccountNumberDoesNotMatchException extends Exception{
    @Override
    public String toString() {
        return "provided account number does not match with what we have for you";
    }
}
