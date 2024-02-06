package com.greatimnate.buyselltrade;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Listing {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double price;

    @OneToOne
    private Item item;


}
