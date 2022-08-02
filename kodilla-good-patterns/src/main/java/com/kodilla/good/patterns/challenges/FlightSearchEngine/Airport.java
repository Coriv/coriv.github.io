package com.kodilla.good.patterns.challenges.FlightSearchEngine;

import java.util.Set;

public interface Airport {
    Set<Airport> getNetworkConnections();
    void setNetworkConnections(Set<Airport> networkConnections);
    String toString();
    boolean equals(Object other);
    int hashCode();

}
