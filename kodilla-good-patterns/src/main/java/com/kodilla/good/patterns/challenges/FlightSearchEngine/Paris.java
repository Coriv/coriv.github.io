package com.kodilla.good.patterns.challenges.FlightSearchEngine;

import java.util.HashSet;
import java.util.Set;

public class Paris implements Airport {
    private final String name = "Paris";
    private static Set<Airport> networkConnections = new HashSet<>();

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
        if (!(o instanceof Paris)) return false;

        Paris paris = (Paris) o;

        return name.equals(paris.name);
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
