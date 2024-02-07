package com.greatimnate.buyselltrade;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Account {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String username;

    private long reputation;

    @OneToMany
    private List<Listing> listings;

    @OneToMany
    private List<Item> items;

}
