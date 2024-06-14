package entities.account;

import java.math.BigDecimal;

import entities.user.*;

public class CheckingAccount extends Account{
    public CheckingAccount(User user, BigDecimal balance) {
        super(user, balance);
    }

    public void calculateIncomes() {
        final BigDecimal ANNUAL_INTEREST_RATE = new BigDecimal("0.05");
        BigDecimal interest = getBalance().multiply(ANNUAL_INTEREST_RATE);
        balance = balance.add(interest);
    }
}
