package com.greatimnate.buyselltrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ListingsController {

    @Autowired
    private ListingRepository listingRepository;

    @GetMapping("/listings")
    public Listing index() {
        return new Listing(1, "ListingsController: This is where the listings will go ");
    }

//    @PostMapping("/listings")
//    public Listing create() {
//        return new Listing(1, "CreateNewListing");
//    }
}
