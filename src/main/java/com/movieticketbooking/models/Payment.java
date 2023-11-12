package com.movieticketbooking.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Payment extends BaseModel{
    private double amount;
    private Date dateOfPayment;
    private String refferenceId;
    @ManyToOne
    /*
    Payment   Ticket
    1           1 --> One payment for one ticket
    M           1 --> Many payment(Split paymemt) for one ticket
     */
    private Ticket ticket;
    @ElementCollection
    @Enumerated(EnumType.ORDINAL)
    private List<PaymentMode>paymentModes;

    @Enumerated(EnumType.ORDINAL)
    private PaymentStatus paymentStatus;
}
