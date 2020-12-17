package jpa.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Member {
    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime createdDate;

    private LocalDateTime modifiedDate;

    private Integer age;

    private String email;

    private String password;

    protected Member() {
    }

    Member(
            final LocalDateTime createdDate, final LocalDateTime modifiedDate, final Integer age,
            final String email, final String password
    ) {
        this.createdDate = createdDate;
        this.modifiedDate = modifiedDate;
        this.age = age;
        this.email = email;
        this.password = password;
    }

    public Member(final Integer age, final String email, final String password) {
        this(LocalDateTime.now(), null, age, email, password);
    }

    public void updateMember(final Member member) {
        this.modifiedDate = LocalDateTime.now();
        this.age = member.age;
        this.email = member.email;
        this.password = member.password;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedDate() {
        return createdDate;
    }

    public LocalDateTime getModifiedDate() {
        return modifiedDate;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}