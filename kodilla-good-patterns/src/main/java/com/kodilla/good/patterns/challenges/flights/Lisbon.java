package com.kodilla.good.patterns.challenges.flights;

import java.util.HashSet;
import java.util.Set;

public class Lisbon implements Airport{
    private final String name = "Lisbon";
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
        if (!(o instanceof Lisbon)) return false;

        Lisbon lisbon = (Lisbon) o;

        return name.equals(lisbon.name);
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
