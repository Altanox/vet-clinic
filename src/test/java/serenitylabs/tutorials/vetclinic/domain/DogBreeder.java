package serenitylabs.tutorials.vetclinic.domain;

import java.time.LocalDateTime;

public class DogBreeder implements WithBreed, OfColour {

    private String name;
    private String breed;
    private String favouriteFood;
    private String colour;
    private String favouriteToy;

    public DogBreeder() {
    }

    public DogBreeder ofBreed(String breed) {
        this.breed = breed;
        return this;
    }

    public DogBreeder ofColour(String colour) {
        this.colour = colour;
        return this;
    }

    public Dog bornOn(LocalDateTime birthday) {
        return new Dog(name, breed, birthday, favouriteFood, colour, favouriteToy);
    }

    public DogBreeder withFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
        return this;
    }

    public DogBreeder withFavouriteToy(String favouriteToy) {
        this.favouriteToy = favouriteToy;
        return this;
    }

    public static DogBreeder aDog() {
        return new DogBreeder();
    }

    public DogBreeder called(String name) {
        this.name = name;
        return this;
    }

    public static DogBreeder aLargeDog() {
        return aDog().ofBreed("Labrador");
    }

    public static DogBreeder aSmallDog() {
        return aDog().ofBreed("Poodle");
    }
}