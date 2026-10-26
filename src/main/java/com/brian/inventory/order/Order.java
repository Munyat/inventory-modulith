package com.brian.inventory.order;

import com.brian.inventory.inventory.Inventory;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;
import java.time.Instant;
import java.util.Collection;

/**
 * @author : Brian Cheruiyot
 * @code @created : 05 May, 2026
 */

@Getter
@Setter
@ToString
@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String orderId;
    private String customerName;

    private String customerEmail;

    private Timestamp orderDate = Timestamp.from(Instant.now());

    @OneToMany(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE }, fetch = FetchType.EAGER)
    @JoinColumn(name = "orders")
    @ToString.Exclude
    private Collection<Inventory> inventories;
}