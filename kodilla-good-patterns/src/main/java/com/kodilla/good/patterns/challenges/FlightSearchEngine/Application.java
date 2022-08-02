package com.kodilla.good.patterns.challenges.FlightSearchEngine;

public class Application {
    public static void main(String[] args) {
        DataGenerator.generateDate();
        SearchFlightEngine engine = new SearchFlightEngine();

        System.out.println("Find all flights from the airport: KRAKOW");
        engine.findAllFlightsFromTheAirport(new Krakow());
        System.out.println();

        System.out.println("Find all airports with flight to: LISBON");
        engine.finnAllAirportsWithFlightTo(new Lisbon());
        System.out.println();

        engine.findConnectingFlights(new Krakow(), new Lisbon());
        System.out.println();

        engine.printMap();

    }
}
