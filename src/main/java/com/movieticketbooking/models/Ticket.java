package com.movieticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Entity
public class Ticket extends BaseModel{
    @ManyToOne
    /*
      Ticket   User
        1        1
        M        1
     */
    private User bookedBy;
    @ManyToOne
    /*
        Ticket  Show
         1       1
         M       1
     */
    private Show show;
    @ManyToMany
    /*
        Ticket  showSeat
         1       M -->can many showSeats belong to one ticket >yes
         1       1 --> can one showSeat belongs to many tickets ? yes (if cancellation)
         M       1 -->can one active showSeat belongs to many tickets ? no
     */
    private List<ShowSeat>showSeats;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
