package com.jakubsky.recipe.sharing.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Ingredient {
    @Id
    @GeneratedValue
    @EqualsAndHashCode.Exclude
    private Long id;

    private String name;
    private String quantity;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @JsonBackReference
    private Recipe recipe;
}
