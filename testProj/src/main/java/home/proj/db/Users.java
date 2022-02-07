package home.proj.db;

import javax.persistence.*;

@Entity
@Table(name ="TBL_USERS")
public class Users {

    @Id
    @GeneratedValue
    @Column(name="id", nullable = false)
    private Long id;

    @Column(name="first_name", nullable = false)
    private Long firstName;

    @Column(name="last_name", nullable = false)
    private Long lastName;

    @Column(name="email")
    private Long email;

    /**
     * Конструткор
     */
    public  Users(){

    }

    public Long getId() {
        return id;
    }

    public Long getFirstName() {
        return firstName;
    }

    public Long getLastName() {
        return lastName;
    }

    public Long getEmail() {
        return email;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(Long firstName) {
        this.firstName = firstName;
    }

    public void setLastName(Long lastName) {
        this.lastName = lastName;
    }

    public void setEmail(Long email) {
        this.email = email;
    }
}
