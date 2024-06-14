package entities.account;

import java.math.BigDecimal;

import entities.user.*;

public class Account {
    protected User user;
    protected BigDecimal balance;

    public Account(User user, BigDecimal balance) {
        this.user = user;
        this.balance = balance;
    }

    public void deposit(BigDecimal amount) {
        if (amount == null) {
            throw new IllegalArgumentException("O montante não pode ser nulo");
        }

        if (amount.compareTo(BigDecimal.ZERO) > 0) {
            balance = balance.add(amount);
        } else {
            throw new IllegalArgumentException("Valor de depósito inválido");
        }
    }

    public void withdraw(BigDecimal amount) {
        if (amount == null) {
            throw new IllegalArgumentException("O montante não pode ser nulo");
        }

        if (amount.compareTo(BigDecimal.ZERO) > 0 && balance.compareTo(amount) >= 0) {
            balance = balance.subtract(amount);
        } else {
            throw new IllegalArgumentException("Valor de saque inválido");
        }
    }

    public User getUser() {
        return user;
    }

    public BigDecimal getBalance() {
        return balance;
    }
}
