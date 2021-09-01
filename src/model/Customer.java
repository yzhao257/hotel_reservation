package model;

import java.util.regex.Pattern;

public class Customer {

    private String firstName;
    private String lastName;
    private String email;
    private final String emailRegex = "^(.+)@(.+).com$";
    private final Pattern emailPattern = Pattern.compile(emailRegex);

    public Customer(String firstName, String lastName, String email){
        if (!emailPattern.matcher(email).matches()){
            throw new IllegalArgumentException("The email has to follow the format of 'name@domain.com'.");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "First name: "+firstName+"; last name: "+lastName+"; email: "+email+".";
    }
}
