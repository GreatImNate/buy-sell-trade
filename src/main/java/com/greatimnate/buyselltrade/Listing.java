package com.greatimnate.buyselltrade;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Listing {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double price;

    @OneToMany
    private List<Item> items;

    private String listingType; // Enum type? [WTS, WTT, WTB, WTS or WTT]

    private String potentialTrades; // How to do a collection with JPA? Is a list of items what would be best?

    private String listingConditions; // Things like payment method, identification, etc

    private String status; // Available, Pending, Sold, others?

    /* LotListing? Should price be a property of the object? Value can exist on the object, or can be overridden on the listing?*/
}
