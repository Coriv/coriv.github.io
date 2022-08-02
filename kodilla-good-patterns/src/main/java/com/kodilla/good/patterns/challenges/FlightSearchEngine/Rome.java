package com.kodilla.good.patterns.challenges.FlightSearchEngine;

import java.util.Set;

public class Rome implements Airport{
    private final String name = "Rome";
    private static Set<Airport> networkConnections;

    @Override
    public Set<Airport> getNetworkConnections() {
        return this.networkConnections;
    }
    @Override
    public void setNetworkConnections(Set<Airport> networkConnections) {
        this.networkConnections = networkConnections;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rome)) return false;

        Rome rome = (Rome) o;

        return name.equals(rome.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
