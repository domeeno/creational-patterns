package com.create.builder;

import org.xml.sax.ext.LexicalHandler;

import java.util.ArrayList;

public class LegoCity {
    public static class Builder {
        private ArrayList<String> shops;
        private ArrayList<String> parks;
        private ArrayList<String> institutions;
        private ArrayList<String> restaurants;
        private ArrayList<String> theaters;

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
