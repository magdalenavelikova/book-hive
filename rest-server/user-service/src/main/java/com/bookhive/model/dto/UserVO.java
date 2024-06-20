package com.bookhive.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class UserVO {

    private Long id;
    private String username;
    private String password;
    private String role;
}
