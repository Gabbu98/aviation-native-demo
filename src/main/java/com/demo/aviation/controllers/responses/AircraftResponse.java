package com.demo.aviation.controllers.responses;

import java.util.Objects;


public class AircraftResponse {

    private String registrationNumber;

    private String type;

    private String model;

    private int seats;

    private int enduranceInHours;

    private int totalFlightTime;

    private boolean multiEngine;

    public AircraftResponse() {
    }

    public AircraftResponse(String registrationNumber, String type, String model, int seats, int enduranceInHours, int totalFlightTime, boolean multiEngine) {
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

    public AircraftResponse setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    public String getType() {
        return type;
    }

    public AircraftResponse setType(String type) {
        this.type = type;
        return this;
    }

    public String getModel() {
        return model;
    }

    public AircraftResponse setModel(String model) {
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
        AircraftResponse aircraft = (AircraftResponse) o;
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
        return "AircraftResponse{" +
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
