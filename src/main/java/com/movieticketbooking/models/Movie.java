package com.movieticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import javax.security.auth.callback.LanguageCallback;
import java.util.List;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String name;
    private double rating;
    private int duration;

    /* one movie can be in many language
     one language can have many movies
     M:M
     */
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<Genre>genres;
    @ManyToMany
    /* one actor can have many movie
    and one movie can have many actors
    M:M
     */
    List<Actor>actors;

    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    List<Feature>movieFeatures;
}
