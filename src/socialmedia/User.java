package socialmedia;

import java.util.Objects;

public class User extends Person {

    private String email;

    public User(int id, String name, String email) {
        super(id, name);
        this.email = email;
    }

    @Override
    public String getRole() {
        return "User";
    }

    public String getEmail() {
        return email;
    }

    public void displayInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "User{id=" + id + ", name='" + name + "', email='" + email + "'}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return id == user.id && email.equals(user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, email);
    }
}
