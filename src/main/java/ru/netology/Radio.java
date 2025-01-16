package ru.netology;

public class Radio {
    private int currentRadioStationNumber;
    private int currentVolume;

    public int getCurrentRadioStationNumber() {
        return currentRadioStationNumber;
    }

    public void setCurrentRadioStationNumber(int newCurrentRadioStationNumber) {
        if (newCurrentRadioStationNumber < 0) {
            newCurrentRadioStationNumber = 9;
        }
        if (newCurrentRadioStationNumber > 9) {
            newCurrentRadioStationNumber = 0;
        }
        currentRadioStationNumber = newCurrentRadioStationNumber;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
        }
        if (newCurrentVolume < 0) {
            newCurrentVolume = 0;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseSetToMaxVolume() {
        currentVolume = 100;
    }

    public void decreaseSetToMinVolume() {
        currentVolume = 0;
    }

    public void nextRadioStation() {
        int nextStation = currentRadioStationNumber + 1;
        setCurrentRadioStationNumber(nextStation);
    }

    public void prevRadioStation() {
        int prevStation = currentRadioStationNumber - 1;
        setCurrentRadioStationNumber(prevStation);
    }

    public void plusVolume() {
        int moreVol = currentVolume + 1;
        setCurrentVolume(moreVol);
    }

    public void minusVolume() {
        int lessVol = currentVolume - 1;
        setCurrentVolume(lessVol);
    }
}
