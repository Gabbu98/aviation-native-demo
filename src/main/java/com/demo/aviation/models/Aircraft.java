package com.demo.aviation.models;

import java.util.Objects;


public class Aircraft {

    private String registrationNumber;

    private String type;

    private String model;

    private Aircraft() {
    }

    public Aircraft(String registrationNumber, String type, String model) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public Aircraft setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    public String getType() {
        return type;
    }

    public Aircraft setType(String type) {
        this.type = type;
        return this;
    }

    public String getModel() {
        return model;
    }

    public Aircraft setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aircraft aircraft = (Aircraft) o;
        return Objects.equals(registrationNumber, aircraft.registrationNumber) && Objects.equals(type, aircraft.type) && Objects.equals(model, aircraft.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, type, model);
    }

    @Override
    public String toString() {
        return "Aircraft{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
