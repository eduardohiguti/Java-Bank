package entities.account;

import java.math.BigDecimal;
import java.util.Scanner;

import entities.user.*;

public class ManagerAccount extends Account {
    private Scanner sc;

    public ManagerAccount(User user, BigDecimal balance) {
        super(user, balance);
        sc = new Scanner(System.in);

    }

    public void createClientAccount() {
    }
}
