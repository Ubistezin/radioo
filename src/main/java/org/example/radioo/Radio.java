package org.example.radioo;

public class Radio {
    private int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void Next() {
        if (currentStation >= 9) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void Prev() {
        if (currentStation <= 0) {
            currentStation = 9;
        } else {
            currentStation = currentStation - 1;
        }
    }

    private int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void IncreaseVolume() {
        if (currentVolume == 10) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void DecreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}



