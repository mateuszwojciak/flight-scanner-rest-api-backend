package com.project.travelagency.domain;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Setter
@Entity(name = "user")
public class User {
    @Id
    @GeneratedValue
    private Long userId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String personalId;

    @Column
    private String email;

    @OneToMany(
            targetEntity = Travel.class,
            mappedBy = "user",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    private List<Travel> travel;

    public User(Long userId, String firstName, String lastName, String personalId, String email, List<Travel> travel) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.email = email;
        this.travel = travel;
    }

    public Long getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPersonalId() {
        return personalId;
    }

    public String getEmail() {
        return email;
    }

    public List<Travel> getTravel() {
        return travel;
    }
}
