package com.demo.aviation.persistence.models;

import org.springframework.context.annotation.Primary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;

@Document(collection = "aircrafts")
public class AircraftModel {

    @Id
    private String registrationNumber;

    private String type;

    private String model;

    private int seats;

    private int enduranceInHours;

    private int totalFlightTime;

    private boolean multiEngine;

    private AircraftModel() {
    }

    public AircraftModel(String registrationNumber, String type, String model, int seats, int enduranceInHours, int totalFlightTime, boolean multiEngine) {
        this.registrationNumber = registrationNumber;
        this.type = type;
        this.model = model;
        this.seats = seats;
        this.enduranceInHours = enduranceInHours;
        this.totalFlightTime = totalFlightTime;
        this.multiEngine = multiEngine;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getEnduranceInHours() {
        return enduranceInHours;
    }

    public void setEnduranceInHours(int enduranceInHours) {
        this.enduranceInHours = enduranceInHours;
    }

    public int getTotalFlightTime() {
        return totalFlightTime;
    }

    public void setTotalFlightTime(int totalFlightTime) {
        this.totalFlightTime = totalFlightTime;
    }

    public boolean isMultiEngine() {
        return multiEngine;
    }

    public void setMultiEngine(boolean multiEngine) {
        this.multiEngine = multiEngine;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public AircraftModel setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    public String getType() {
        return type;
    }

    public AircraftModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AircraftModel setModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AircraftModel aircraft = (AircraftModel) o;
        return seats == aircraft.seats && enduranceInHours == aircraft.enduranceInHours && totalFlightTime == aircraft.totalFlightTime && multiEngine == aircraft.multiEngine && Objects.equals(
                registrationNumber, aircraft.registrationNumber) && Objects.equals(type, aircraft.type) && Objects.equals(model,
                aircraft.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registrationNumber, type, model, seats, enduranceInHours, totalFlightTime, multiEngine);
    }

    @Override
    public String toString() {
        return "AircraftModel{" +
                "registrationNumber='" + registrationNumber + '\'' +
                ", type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", seats=" + seats +
                ", enduranceInHours=" + enduranceInHours +
                ", totalFlightTime=" + totalFlightTime +
                ", multiEngine=" + multiEngine +
                '}';
    }
}
