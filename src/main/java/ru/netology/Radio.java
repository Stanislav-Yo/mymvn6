package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int startingStation = 0;
    private int lastStation= 9;
    private int numberOfStations = 10;
    private int currentRadioStationNumber = startingStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume = minVolume;

    public Radio(int numberOfStations) {
        this.numberOfStations = numberOfStations;
        this.lastStation = numberOfStations - 1;
    }

    public void nextRadioStation() {
        if (currentRadioStationNumber < lastStation) {
            currentRadioStationNumber++;
        } else {
            currentRadioStationNumber = startingStation;
        }
    }

    public void prevRadioStation() {
        if (currentRadioStationNumber > startingStation) {
            currentRadioStationNumber--;
        } else {
            currentRadioStationNumber = lastStation;
        }
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

    public void setMaxVolume() {
        currentVolume = maxVolume;
    }

    public void setMinVolume() {
        currentVolume = minVolume;
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
}


