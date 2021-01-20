package com.company.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class UndergroundSystem {
    private Map<Integer, Journey> journeysInTransit = new HashMap<>();
    private Map<String, ArrayList<Journey>> completedJourneys = new HashMap<>();

    public UndergroundSystem() {
    }

    public void checkIn(int id, String stationName, int t) {
        journeysInTransit.put(id, new Journey(id, stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {
        Journey completed = journeysInTransit.remove(id);
        completed.endJourney(stationName, t);
        String startStation = completed.getStartStation();

        ArrayList<Journey> journeyList = completedJourneys
            .getOrDefault(startStation, new ArrayList<>());

        journeyList.add(completed);
        completedJourneys.put(startStation, journeyList);
    }

    public double getAverageTime(String startStation, String endStation) {
        double totalTravelTime = 0.0;
        double totalTransits = 0.0;
        for (Journey journey : completedJourneys.get(startStation)) {
            if (journey.getEndStation().equals(endStation)) {
                totalTravelTime += journey.getEndTime() - journey.getStartTime();
                totalTransits ++;
            }
        }

        return totalTravelTime / totalTransits;
    }
}
