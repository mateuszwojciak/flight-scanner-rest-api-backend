package com.project.travelagency.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class UserDto {
    private Long userId;
    private String firstName;
    private String lastName;
    private String personalId;
    private Integer age;
}
