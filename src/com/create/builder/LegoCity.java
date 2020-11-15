package com.create.builder;

import com.create.prototype.CityHabitant;

import java.util.ArrayList;

// This Builder is a Lego city Builder. This class' goal is to construct a City object. This city can have multiple
// shops, parks, institutions, restaurants, theaters. Once you construct an entity you can't deconstruct it from the city.

public class LegoCity {
    public static class Builder {
        private ArrayList<String> shops = new ArrayList<>();
        private ArrayList<String> parks = new ArrayList<>();
        private ArrayList<String> institutions = new ArrayList<>();
        private ArrayList<String> restaurants = new ArrayList<>();
        private ArrayList<String> theaters = new ArrayList<>();
        private ArrayList<CityHabitant> habitants = new ArrayList<>();
        
        public Builder() {

        }

        public LegoCity build() {
            return new LegoCity(this);
        }

        public Builder shops(String shop) {
            this.shops.add(shop);
            return this;
        }

        public Builder parks(String park) {
            this.parks.add(park);
            return this;
        }

        public Builder institutions(String institution) {
            this.institutions.add(institution);
            return this;
        }

        public Builder restaurants(String restaurant) {
            this.restaurants.add(restaurant);
            return this;
        }

        public Builder theaters(String theater) {
            this.theaters.add(theater);
            return this;
        }

        public Builder habitants(CityHabitant habitant) {
            this.habitants.add(habitant);
            return this;
        }
    }

    private final ArrayList<String> shops;

    private final ArrayList<String> parks;

    private final ArrayList<String> institutions;

    private final ArrayList<String> restaurants;

    private final ArrayList<String> theaters;

    private LegoCity(Builder builder) {
        this.shops = builder.shops;
        this.parks = builder.parks;
        this.institutions = builder.institutions;
        this.restaurants = builder.restaurants;
        this.theaters = builder.theaters;
    }

    public ArrayList<String> getShops() {
        return shops;
    }

    public ArrayList<String> getParks() {
        return parks;
    }

    public ArrayList<String> getInstitutions() {
        return institutions;
    }

    public ArrayList<String> getRestaurants() {
        return restaurants;
    }

    public ArrayList<String> getTheaters() {
        return theaters;
    }
}
