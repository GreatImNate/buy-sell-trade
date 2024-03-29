package com.greatimnate.buyselltrade;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "accounts", path = "accounts")
public interface AccountsRepository extends CrudRepository<Account, Long> {

    List<Account> findAccountByUsername(@Param("username") String username);
}
