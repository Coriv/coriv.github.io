package com.kodilla.good.patterns.challenges.flights;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class London implements Airport{
    private final String name = "London";
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
        if (!(o instanceof London)) return false;

        London london = (London) o;

        return name.equals(london.name);
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
