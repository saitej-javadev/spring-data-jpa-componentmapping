package com.saitej.springdatajpacomponentmapping.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
public class Employee {
    @Id
    private int id;
    private String name;
    @Embedded
    private Address address;
}
