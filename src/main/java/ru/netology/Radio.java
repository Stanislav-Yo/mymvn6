package ru.netology;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int startingStation;
    private int lastStation;
    private int numberOfStations;
    private int currentRadioStationNumber;

    private int minVolume;
    private int maxVolume;
    private int currentVolume;

}
