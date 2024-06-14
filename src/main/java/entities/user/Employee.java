package entities.user;

public class Employee extends User {
    public Employee(int accountId, String name, String password) {
        super(accountId, name, password);
        this.superUser = false;
        this.employee = true;
    }
}
