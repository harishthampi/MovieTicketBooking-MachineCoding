package com.movieticketbooking.models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class ShowSeat extends BaseModel{
    /* ShowSeat     Show
         1           1  --> A showSeat is only available for a particular Show
         M            1 --> A single show will have many showSeats
     */
    @ManyToOne
    private Show show;
    /* ShowSeat    Seat
         1          1 --> A showSeat can be a single Seat
         M          1 ---> A Seat can be set as a showSeat many number of times
     */
     @ManyToOne
    private Seat seat;
     @Enumerated(EnumType.STRING)
     private ShowSeatStatus showSeatStatus;
}
