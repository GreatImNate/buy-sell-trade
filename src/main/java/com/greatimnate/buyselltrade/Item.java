package com.greatimnate.buyselltrade;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Item {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double value;

    private long quantity; // default of 1

    private String name;

    private String manufacturer; // MFG Table?

    private String model;

    private String modelDesignation; // MPN, SKU, etc

    private String serialNumber;

    private String condition; // New, LNIB, excellent, good, poor, what else?

    private String description;

    private String imagePath;

    @ManyToOne
    private Item parent;

    @OneToMany(mappedBy = "parent")
    private List<Item> subItems;

    @ElementCollection
    private List<String> properties;

}
