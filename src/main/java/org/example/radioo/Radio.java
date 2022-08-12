package org.example.radioo;

public class Radio {
    private int currentStation;
    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        currentStation = newCurrentStation;
    }

    public  void setMaxStation() { currentStation = 9; }

    public void setMinStation() {
        currentStation = 0;
    }

    public void Next(int newCurrentStation) {
        if (newCurrentStation > 9) {
            setMinStation();
        } else {
            currentStation = newCurrentStation + 1;
        }
    }

    public void Prev(int newCurrentStation) {
        if (newCurrentStation < 0) {
            setMaxStation();
        } else {
            currentStation = newCurrentStation - 1;
        }
    }

    private int currentVolume;
    public int getCurrentVolume() { return currentVolume; }
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
