package com.edivan.userauthentication.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID )
    private String id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String password;
    private String email;
}
