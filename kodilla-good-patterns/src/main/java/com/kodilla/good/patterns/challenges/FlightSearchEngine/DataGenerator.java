package com.kodilla.good.patterns.challenges.FlightSearchEngine;


import java.util.*;

public class DataGenerator {
    static List<Airport> listOfAirport;
     static void listOfAirportGenerator() {
        Amsterdam amsterdam = new Amsterdam();
        Barcelona barcelona = new Barcelona();
        Krakow krakow = new Krakow();
        Lisbon lisbon = new Lisbon();
        London london = new London();
        Paris paris = new Paris();
        Rome rome = new Rome();

        listOfAirport = Arrays.asList(amsterdam, barcelona, krakow, lisbon, london, paris, rome);
    }
     static Set<Airport> prepareRandomSet() {
        HashSet<Airport> randomAirportSet = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            Airport randomAirport = listOfAirport.get(new Random().nextInt(listOfAirport.size()));
            randomAirportSet.add(randomAirport);
        }
        return randomAirportSet;
    }
    public static void generateDate() {
        listOfAirportGenerator();
        for(Airport airport : listOfAirport) {
            Set<Airport> randomSet = prepareRandomSet();
            if(randomSet.contains(airport)) {
                randomSet.remove(airport);
            }
            airport.setNetworkConnections(randomSet);
            generateMapOfFlight();
        }
    }
    static void generateMapOfFlight() {
        Database database = Database.getInstance();
        for(Airport airport : listOfAirport) {
            database.addAirportConnections(airport);
        }
    }
}
