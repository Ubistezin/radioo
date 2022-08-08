package org.example.radioo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.getCurrentStation();

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveMax() {
        Radio radio = new Radio();

        radio.setToMaxStation();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationUnderMin() {
        Radio radio = new Radio();

        radio.setToMinStation();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOneStation() {
        Radio radio = new Radio();

        radio.Next(10);

        int expected = 0;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseOneStation() {
        Radio radio = new Radio();

        radio.Prev(-1);

        int expected = 9;
        int actual = radio.currentStation;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.getCurrentVolume();

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOneVolume() {
        Radio radio = new Radio();

        radio.increaseVolume(7);

        int expected = 8;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseOneVolume() {
        Radio radio = new Radio();

        radio.decreaseVolume(7);

        int expected = 6;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldLimitValuesVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.currentVolume;

        Assertions.assertEquals(expected, actual);
    }
}

