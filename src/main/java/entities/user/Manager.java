package entities.user;

public class Manager extends User{
    public Manager(int accountId, String name, String password) {
        super(accountId, name, password);
        this.superUser = true;
        this.employee = true;
    }
}
