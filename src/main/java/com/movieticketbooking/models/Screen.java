package com.movieticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.awt.*;
import java.util.List;
@Getter
@Setter
@Entity
public class Screen extends BaseModel{
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    private List<Seat>seats;
    @ElementCollection
    @Enumerated(EnumType.STRING)
    private List<ScreenFeature>screenFeatures;
    @ManyToOne
    private Theater theater;
}
