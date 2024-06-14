package entities.user;

public class User {
    protected boolean superUser;
    protected boolean employee;
    protected int accountId;
    protected String name;
    protected String password;

    public User(int accountId, String name, String password) {
        this.superUser = false;
        this.employee = false;
        this.accountId = accountId;
        this.name = name;
        setPassword(password);
    }

    public boolean isSuperUser() {
        return superUser;
    }

    public boolean isEmployee() {
        return employee;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password){
        this.password = password;
    }
}