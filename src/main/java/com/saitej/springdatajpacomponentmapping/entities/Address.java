package com.saitej.springdatajpacomponentmapping.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Embeddable
public class Address {

    private String streetaddress;
    private  String city;
    private String state;
    private  String zipcode;
    private String country;
}
