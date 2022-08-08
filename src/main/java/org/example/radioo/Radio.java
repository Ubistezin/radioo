package org.example.radioo;

public class Radio {
    int currentStation;

    int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setToMaxStation() {
        currentStation = 9;
    }

    public void setToMinStation() {
        currentStation = 0;
    }

    public void Next(int newCurrentStation) {
        if (newCurrentStation > 9) {
            setToMinStation();
        } else {
            currentStation = newCurrentStation + 1;
        }
    }

    public void Prev(int newCurrentStation) {
        if (newCurrentStation < 0) {
            setToMaxStation();
        } else {
            currentStation = newCurrentStation - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
    }

    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume - 1;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
