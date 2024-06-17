package main;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import entities.account.*;
import entities.user.*;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user1 = new Manager(0, "Gerente", "gerente123");
        User user2 = new Client(1, "Pedro", "senha123");

        Account account1 = new Account(user1, new BigDecimal("-1"));
        Account account2 = new Account(user2, new BigDecimal("500"));

        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);

        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        try {
            mapper.writeValue(new File("accounts.json"), accounts);
            System.out.println("Account created");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
