package com.company.leetcode;

public class Journey {
    private int id;
    private String startStation;
    private int startTime;
    private String endStation;
    private int endTime;

    public Journey(int id, String startStation, int startTime) {
        this.id = id;
        this.startStation = startStation;
        this.startTime = startTime;
    }

    public void endJourney(String endStation, int endTime) {
        this.endStation = endStation;
        this.endTime = endTime;
    }

    public String getStartStation() {
        return startStation;
    }

    public int getStartTime() {
        return startTime;
    }

    public String getEndStation() {
        return endStation;
    }

    public int getEndTime() {
        return endTime;
    }

}
