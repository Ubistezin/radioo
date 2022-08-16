package org.example.radioo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentStationUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOneStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(8);
        radio.Next();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseOneStation2() {
        Radio radio = new Radio();

        radio.setCurrentStation(9);
        radio.Next();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseOneStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(0);
        radio.Prev();

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseStation() {
        Radio radio = new Radio();

        radio.setCurrentStation(1);
        radio.Prev();

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurrentVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetCurrentVolumeAboveMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(11);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNotSetCurrentVolumeAboveMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(10);
        radio.IncreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(9);
        radio.IncreaseVolume();

        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolumemin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.DecreaseVolume();

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(2);
        radio.DecreaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}


