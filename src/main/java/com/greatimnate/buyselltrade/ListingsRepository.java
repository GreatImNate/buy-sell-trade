package com.greatimnate.buyselltrade;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;


@RepositoryRestResource(collectionResourceRel = "listings", path = "listings")
public interface ListingsRepository extends CrudRepository<Listing, Integer> {
    List<Listing> findById(@Param("listing_id") long listing_id);


}
