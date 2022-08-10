package org.example.radioo;

public class Radio {
    private int amountStation = 10;
    private int maxStation = amountStation - 1;
    private int minStation = 0;
    private int currentStation = minStation;

    public Radio(int amountStation) {
        this.amountStation = amountStation;

        this.maxStation = amountStation - 1;
    }

    public Radio() {
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getToMaxStation() {
        return maxStation;
    }

    public int getToMinStation() {
        return minStation;
    }

    public int getToAmountStation() {
        return amountStation;
    }


    public int Next(int newCurrentStation) {
        if (newCurrentStation <= maxStation) {
            currentStation = newCurrentStation + 1;
        } else {
            currentStation = 0;
        }
        return currentStation;
    }

    public int Prev(int newCurrentStation) {
        if (newCurrentStation <= maxStation) {
            currentStation = newCurrentStation -1;
        } else {
            currentStation = 0;
        }
        return currentStation ;
    }

    public int setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return getToMaxStation();
        }
        if (newCurrentStation > maxStation) {
            return getToMinStation();
        }

        return newCurrentStation;
    }
}
