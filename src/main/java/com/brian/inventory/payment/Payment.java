package com.brian.inventory.payment;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.Instant;

/**
 * @author : Brian Cheruiyot
 * @code @created : 05 May, 2026
 */

@Getter
@Setter
@ToString
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    private long amount;
    private Timestamp paymentDate = Timestamp.from(Instant.now());
}