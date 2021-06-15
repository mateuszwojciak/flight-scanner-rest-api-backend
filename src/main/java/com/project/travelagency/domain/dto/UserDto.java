package com.project.travelagency.domain.dto;

import com.project.travelagency.domain.Travel;
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
    private String email;
    private List<Travel> travel;

    public UserDto(Long userId, String firstName, String lastName, String personalId, String email, List<Travel> travel) {
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
