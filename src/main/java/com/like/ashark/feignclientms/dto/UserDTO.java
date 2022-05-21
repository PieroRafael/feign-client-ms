package com.like.ashark.feignclientms.dto;

import lombok.Data;

@Data
public class UserDTO {
    private Integer id;
    private String name;
    private String username;
    private String email;
    private String avatar;
}
