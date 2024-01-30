package com.demo.aviation.records;

public record AircraftRecord(String registrationNumber, String type, String model, int seats, int enduranceInHours, int totalFlightTime, boolean multiEngine) {
}
