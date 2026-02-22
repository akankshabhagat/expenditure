package com.example.foodexpensetracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;

@Entity
@Getter
@Setter
public class Expense  {

    @Id
    private Long id;

    LocalDate date;
    String app;
    Double priceofitem;
    String item;
    String comments;

}
