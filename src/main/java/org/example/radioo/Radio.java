package org.example.radioo;

public class Radio {
    private int amountStation = 10;
    private int currentStation = 0;
    private int currentVolume = 0;

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > amountStation - 1) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void Next() {
        if (currentStation >= amountStation - 1) {
            currentStation = 0;
        } else {
            currentStation = currentStation + 1;
        }
    }

    public void Prev() {
        if (currentStation <= 0) {
            currentStation = amountStation - 1;
        } else {
            currentStation = currentStation - 1;
        }
    }

    public void IncreaseVolume() {
        if (currentVolume == 100) {
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
