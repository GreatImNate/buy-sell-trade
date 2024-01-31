package com.greatimnate.buyselltrade;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public record Listing(@Id @GeneratedValue(strategy = GenerationType.AUTO) long id, String content) {
}
