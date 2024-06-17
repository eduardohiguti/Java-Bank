package entities.account;

import java.math.BigDecimal;

import entities.user.*;

public class ClientSavingsAccount extends Account {
    public ClientSavingsAccount(User user, BigDecimal balance) {
        super(user, balance);
    }

    public void calculateIncomes() {
        final BigDecimal MONTHLY_INTEREST_RATE = new BigDecimal("0.01");
        BigDecimal interest = getBalance().multiply(MONTHLY_INTEREST_RATE);
        balance = balance.add(interest);
    }
}
