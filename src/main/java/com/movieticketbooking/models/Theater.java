package com.movieticketbooking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseModel{
    private String name;
    private City city;
    @OneToMany(mappedBy = "theater",fetch = FetchType.EAGER)
    private List<Screen>screens;

}
