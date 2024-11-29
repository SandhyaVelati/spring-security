package com.northcoders.SecurityPlayground.model;

import jakarta.persistence.*;

@Entity

@Table(name = "auth_user")
public class UserEntity {
    @Column
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "user_name")
    private String userName;
    @Column(name = "gitHubUserName")
    private String gitHubUserName;

    public UserEntity(String userName, String gitHubUserName) {
        this.userName = userName;
        this.gitHubUserName = gitHubUserName;
    }

    public UserEntity() {

    }
}
