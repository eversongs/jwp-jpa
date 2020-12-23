package jpa.member;

import com.sun.xml.bind.v2.model.core.ID;
import jpa.core.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
public class Member extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int age;

    private String email;

    @Column(name = "password")
    private String password;

    public Member() {
    }

    public Member(String email, String password, int age) {
        this.email = email;
        this.password = password;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}