package entities.account;

import entities.user.User;

import java.math.BigDecimal;

public class EmployeeAccount extends Account {
    public EmployeeAccount(User user, BigDecimal balance) {
        super(user, balance);
    }
}
