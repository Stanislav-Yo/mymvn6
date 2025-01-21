package ru.netology;

public class Radio {
    private final int startingStation = 0;
    private final int lastStation;
    private final int numberOfStations;
    private int currentRadioStationNumber;

    private final int minVolume = 0;
    private final int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio() {
        this.numberOfStations = 10;
        this.lastStation = numberOfStations - 1;
        this.currentRadioStationNumber = startingStation;
    }

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.lastStation = numberOfStations - 1;
        this.currentRadioStationNumber = startingStation;
    }

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public int getStartingStation() {
        return startingStation;
    }

    public int getLastStation() {
        return lastStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < startingStation) {
            currentRadioStationNumber = lastStation;
        } else if (newCurrentRadioStationNumber >= numberOfStations) {
            currentRadioStationNumber = startingStation;
        } else {
            currentRadioStationNumber = newCurrentRadioStationNumber;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            currentVolume = minVolume;
        } else if (newCurrentVolume > maxVolume) {
            currentVolume = maxVolume;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void nextRadioStation() {
        setCurrentRadioStationNumber(currentRadioStationNumber + 1);
    }

    public void prevRadioStation() {
        setCurrentRadioStationNumber(currentRadioStationNumber - 1);
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume++;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume--;
        }
    }

    public void setToMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setToMinVolume() {
        currentVolume = minVolume;
    }
}
