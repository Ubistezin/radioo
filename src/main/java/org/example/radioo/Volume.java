package org.example.radioo;

public class Volume {
        private int maxVolume = 100;
        private int minVolume = 0;
        private int currentVolume = minVolume;

        public Volume(int currentVolume) {
            this.currentVolume = currentVolume;
        }

        public int getCurrentVolume() {
            return currentVolume;
        }

        public int getToMaxVolume() {
            return maxVolume;
        }

        public int getToMinVolume() {
            return minVolume;
        }

        public int increaseVolume(int newCurrentVolume) {
            if (newCurrentVolume <= 100) {
                currentVolume = newCurrentVolume + 1;
            } else {
                currentVolume = 0;
            }
            return currentVolume;
        }

        public int decreaseVolume(int newCurrentVolume) {
            if (newCurrentVolume <= 100) {
                currentVolume = newCurrentVolume - 1;
            } else {
                currentVolume = 0;
            }
            return currentVolume;
        }

        public int setCurrentVolume(int newCurrentVolume) {
            if (newCurrentVolume < 0) {
                return getToMinVolume();
            }
            if (newCurrentVolume > 100) {
                return getToMaxVolume();
            }
            return newCurrentVolume;
        }


    }
