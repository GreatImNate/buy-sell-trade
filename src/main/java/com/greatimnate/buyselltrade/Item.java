package com.greatimnate.buyselltrade;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public record Item(@Id long id, String manufacturer, String model, String condition, String description) {
}
