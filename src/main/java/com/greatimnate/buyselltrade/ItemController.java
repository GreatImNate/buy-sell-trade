package com.greatimnate.buyselltrade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {
    private final ItemRepository itemRepository;
    public ItemController(@Autowired ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    public Iterable<Item> index() {
        return itemRepository.findAll();
    }

    @GetMapping("/itemCreate")
    public Item newItem() {
        final Item item = new Item();
        item.setName("16\" LW BBL");
        item.setManufacturer("Daniel Defense");
        item.setCondition("LNIB");
        item.setValue(280);
        itemRepository.save(item);
        return item;
    }

}
