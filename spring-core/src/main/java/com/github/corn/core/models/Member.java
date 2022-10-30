package com.github.corn.core.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String Username;
    private String Password;
}
