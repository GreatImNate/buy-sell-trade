package com.greatimnate.buyselltrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ListingsController {

    @Autowired
    private ListingsRepository listingRepository;

    @GetMapping("/listings")
    public Iterable<Listing> index() {
        return listingRepository.findAll();
    }

}
