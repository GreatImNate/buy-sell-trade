package com.greatimnate.buyselltrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ManualTestController {

    private final ItemRepository itemRepository;
    private final ListingsRepository listingsRepository;
    private final AccountsRepository accountsRepository;

    public ManualTestController(@Autowired ItemRepository itemRepository,
                                @Autowired ListingsRepository listingsRepository,
                                @Autowired AccountsRepository accountsRepository) {
        this.itemRepository = itemRepository;
        this.listingsRepository = listingsRepository;
        this.accountsRepository = accountsRepository;
    }

    @GetMapping("/manualTest")
    public Account manualTest() {
        final Account account = new Account();
        account.setUsername("thestatuspoe");


        final Item individualItem = new Item.ItemBuilder()
                .manufacturer("Manufacturer 1")
                .model("Model 1")
                .build();

        final Item componentItem1 = new Item.ItemBuilder().manufacturer("Manufacturer 2").model("Model 2").build();
        final Item componentItem2 = new Item.ItemBuilder().manufacturer("Manufacturer 3").build();
        final Item componentItem3 = new Item.ItemBuilder().manufacturer("Manufacturer 4").model("Model 3").build();

        final Item compositeItem = new Item.ItemBuilder()
                .subItems(List.of(componentItem2, componentItem1, componentItem3))
                .build();
        itemRepository.saveAll(List.of(
                individualItem,
                componentItem1,
                componentItem3,
                componentItem2,
                compositeItem));
        final Listing individualListing = new Listing();
        individualListing.setItems(List.of(individualItem));
        individualListing.setListingType("WTS");
        individualListing.setStatus("Available");

        final Listing compositeListing = new Listing();
        compositeListing.setItems(List.of(compositeItem));
        compositeListing.setListingType("WTS/WTT");
        compositeListing.setPrice(700);

        listingsRepository.saveAll(List.of(individualListing, compositeListing));

        account.setListings(List.of(individualListing, compositeListing));
        account.setItems(List.of(individualItem, componentItem1, componentItem3, componentItem2, compositeItem));
        accountsRepository.save(account);


        return account;
    }

}
