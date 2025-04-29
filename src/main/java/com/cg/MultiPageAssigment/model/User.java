package com.cg.MultiPageAssigment.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String city;
    private String country;
}

