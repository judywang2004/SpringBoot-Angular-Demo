package com.mall.demo.common.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import jakarta.annotation.Generated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
@Table(name="ums_admin")
public class UmsAdmin {
    //define fields
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String username;
    private String email;
    //define constructors

    //define getter/setter

    //define toString

    
}
