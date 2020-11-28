package com.paul.springboot7.vo;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
@NoArgsConstructor
public class User implements Serializable {

    @Id
    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String role;
}
