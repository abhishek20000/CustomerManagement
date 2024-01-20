package com.customerManagement.CustomerManagement.Entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.NaturalId;

import java.io.Serializable;


@Data
@Entity
@Table(name = "Customers")
public class Customer implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String fullName;

    private String address;

    private String city;


    private String country;

    @NaturalId
    private String email;

    @NaturalId
    private String phoneNumber;


}
