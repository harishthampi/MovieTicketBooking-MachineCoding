package com.movieticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Setter
@Getter
@Entity
public class Ticket extends BaseModel{
    private  double totalAmount;
    /*
      Ticket   User
        1        1
        M        1
     */
    @ManyToOne
    private User bookedBy;
    /*
        Ticket  Show
         1       1
         M       1
     */
    @ManyToOne
    private Show show;
    /*
        Ticket  showSeat
         1       M -->can many showSeats belong to one ticket >yes
         1       1 --> can one showSeat belongs to many tickets ? yes (if cancellation)
         M       1 -->can one active showSeat belongs to many tickets ? no
     */
    @ManyToMany
    private List<ShowSeat>showSeats;
    @Enumerated(EnumType.ORDINAL)
    private TicketStatus ticketStatus;
    @OneToMany(mappedBy = "tickets")
    private List<Payment> payments;
}
