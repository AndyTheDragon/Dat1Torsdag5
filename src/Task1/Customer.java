package Task1;

public class Customer {
    private String firstName;
    private String lastName;
    private String username;
    private int id;
    private static int counter;

    Customer(String firstName, String lastName, String userName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = userName;
        this.id = counter;
        counter++;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Navn: " + firstName + " " + lastName +
                ", Brugernavn: " + username +
                ", id: " + id ;
    }
}

