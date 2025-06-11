package com.jakubsky.recipe.sharing.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@EqualsAndHashCode
public class Recipe {

    @Id
    @GeneratedValue
    @EqualsAndHashCode.Exclude
    private Long id;

    private String title;
    private String description;
    private int preparationTime;
    private String difficulty;

    @ManyToOne
    @EqualsAndHashCode.Exclude
    @JsonBackReference
    private User author;

    @OneToMany(mappedBy = "recipe", cascade = CascadeType.ALL)
    @EqualsAndHashCode.Exclude
    @JsonManagedReference
    private List<Ingredient> ingredients = new ArrayList<>();
}
