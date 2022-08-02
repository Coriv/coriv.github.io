package com.kodilla.good.patterns.challenges.FlightSearchEngine;

public class Application {
    public static void main(String[] args) {
        DataGenerator.generateDate();
        SearchFlightEngine engine = new SearchFlightEngine();

        engine.findAllFlightsFromTheAirport(new Krakow());
        engine.finnAllAirportsWithFlightTo(new Lisbon());
        engine.findConnectingFlights(new Krakow(), new Lisbon());

        engine.printMap();

    }
}
