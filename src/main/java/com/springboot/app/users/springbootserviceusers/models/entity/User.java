package com.springboot.app.users.springbootserviceusers.models.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
public class User implements Serializable {


    public static final long serialVersionUID = 4002221912401133394L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
