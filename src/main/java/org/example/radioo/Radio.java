package org.example.radioo;

public class Radio {
    public int currentStation;

    public int currentVolume;
    public int getCurrentVolume() { return currentVolume; }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getToMaxStation() { return currentStation = 9; }

    public int getToMinStation() {
        return currentStation = 0;
    }

    public void Next(int newCurrentStation) {
        if (newCurrentStation > 9) {
            getToMinStation();
        } else {
            currentStation = newCurrentStation + 1;
        }
    }

    public void Prev(int newCurrentStation) {
        if (newCurrentStation < 0) {
            getToMaxStation();
        } else {
            currentStation = newCurrentStation - 1;
        }
    }
    public void increaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume + 1;
        }
    }

    public void decreaseVolume(int newCurrentVolume) {
        if (newCurrentVolume < 10) {
            currentVolume = newCurrentVolume - 1;
        } else {
            currentVolume = 0;
        }
    }

        public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }
}
