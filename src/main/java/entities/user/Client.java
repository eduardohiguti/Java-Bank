package entities.user;

public class Client extends User{
    public Client(int accountId, String name, String password) {
        super(accountId, name, password);
        this.superUser = false;
        this.employee = false;
    }
}
