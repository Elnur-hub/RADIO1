package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int maxStation = 9;
    private int minStation;

    private int currentVolume;
    private int maxVolume = 10;
    private int minVolume;


    public Radio(int currentStation,
                 int maxStation,
                 int minStation,
                 int currentVolume,
                 int maxVolume,
                 int minVolume) {
        this.currentStation = currentStation;
        this.maxStation = maxStation;
        this.minStation = minStation;
        this.currentVolume = currentVolume;
        this.maxVolume = maxVolume;
        this.minVolume = minVolume;

    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            return;
        }
        if (currentStation < minStation) {
            return;
        }
        this.currentStation = currentStation;
    }


    public void nextStation() {
        if (currentStation >= maxStation) {
            currentStation = minStation;
        } else {
            this.currentStation = currentStation + 1;
        }
    }

    public void previousStation() {
        if (currentStation <= minStation) {
            currentStation = maxStation;
        } else {
            this.currentStation = currentStation - 1;
        }
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {

        this.currentVolume = currentVolume;
    }

    public void turnUpVolume() {
        if (currentVolume >= maxVolume) {
            return;
        } else {
            this.currentVolume = currentVolume + 1;
        }
    }

    public void turnDownVolume() {
        if (currentVolume <= minVolume) {
            return;
        } else {
            this.currentVolume = currentVolume - 1;
        }
    }

    public int getMaxStation() {
        return maxStation;
    }

    public void setMaxStation(int maxStation) {
        this.maxStation = maxStation;

    }

    public int getMinStation() {
        return minStation;
    }

    public void setMinStation(int minStation) {
        this.minStation = minStation;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setMaxVolume(int maxVolume) {
        this.maxVolume = maxVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public void setMinVolume(int minVolume) {
        this.minVolume = minVolume;
    }
}
