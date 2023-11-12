package com.movieticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private String seatNumber;
    private int row;
    private int column;

    @Enumerated(EnumType.ORDINAL)
    private SeatType seatType;
}
