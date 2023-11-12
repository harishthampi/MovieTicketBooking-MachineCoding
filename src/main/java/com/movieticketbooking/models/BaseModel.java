package com.movieticketbooking.models;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

@MappedSuperclass
@Getter
@Setter
public class BaseModel {
    @Id //@Id denotes that this attribute is a primary key of the table
    @GeneratedValue(strategy = IDENTITY)
    private Long id;
}
