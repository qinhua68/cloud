package com.adq.cloud.admin.entities;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String userName;
    private Integer age;
    private String email;
}
