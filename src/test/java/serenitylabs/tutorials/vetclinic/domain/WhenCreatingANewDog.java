package serenitylabs.tutorials.vetclinic.domain;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;

public class WhenCreatingANewDog {

    @Test
    public void it_should_have_a_name() {
        LocalDateTime birthday = LocalDateTime.now();

        Dog fido = DogBreeder.aLargeDog()
                .called("Fido")
                .ofColour("black") //mandatory field because of interface
                .withFavouriteFood("pizza") //optional field
                .withFavouriteToy("plastic bone")
                .bornOn(birthday);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirth());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
        Assert.assertEquals("black", fido.getColour());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_food() throws Exception {

        LocalDateTime birthday = LocalDateTime.now();

        Dog fido = DogBreeder.aSmallDog()
                .called("Spot")
                .ofColour("brown") //mandatory field because of interface
                .withFavouriteFood("pizza") //optional field
                .bornOn(birthday);

        Assert.assertEquals("Spot", fido.getName());
        Assert.assertEquals("Poodle", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirth());
        Assert.assertEquals("pizza", fido.getFavouriteFood());
    }

    @Test
    public void a_dog_can_have_an_optional_favourite_toy() throws Exception {

        LocalDateTime birthday = LocalDateTime.now();

        Dog fido = DogBreeder.aDog()
                .called("Fido")
                .ofBreed("Labrador") //mandatory field because of the interface
                .ofColour("black") // as above
                .withFavouriteToy("plastic bone")
                .bornOn(birthday);

        Assert.assertEquals("Fido", fido.getName());
        Assert.assertEquals("Labrador", fido.getBreed());
        Assert.assertEquals(birthday, fido.getDateOfBirth());
        Assert.assertEquals("plastic bone", fido.getFavouriteToy());
    }
}
