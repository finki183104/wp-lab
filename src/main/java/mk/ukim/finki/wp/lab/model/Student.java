package mk.ukim.finki.wp.lab.model;

import lombok.Data;

@Data
public class Student {
    String username;
    String password;
    String name;
    String surname;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
