package com.project.travelagency.domain;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
public class UserDto {
    private Long userId;
    private String firstName;
    private String lastName;
    private String personalId;
    private Integer age;
    private List<Travel> travel;

    public UserDto(Long userId, String firstName, String lastName, String personalId, Integer age, List<Travel> travel) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.personalId = personalId;
        this.age = age;
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

    public Integer getAge() {
        return age;
    }

    public List<Travel> getTravel() {
        return travel;
    }
}
