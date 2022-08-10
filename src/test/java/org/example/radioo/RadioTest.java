package org.example.radioo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void test() {
        Radio radio = new Radio();

        Assertions.assertEquals(10, radio.getToAmountStation());
        Assertions.assertEquals(9, radio.getToMaxStation());
        Assertions.assertEquals(0, radio.getToMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.Next(10));
        Assertions.assertEquals(8, radio.Next(7));
        Assertions.assertEquals(7, radio.Prev(8));
        Assertions.assertEquals(0, radio.Prev(10));
        Assertions.assertEquals(9, radio.setCurrentStation(-1));
        Assertions.assertEquals(0, radio.setCurrentStation(10));
        Assertions.assertEquals(5, radio.setCurrentStation(5));
    }
        @Test
        public void test2() {
            Radio radio = new Radio(15);

        Assertions.assertEquals(15, radio.getToAmountStation());
        Assertions.assertEquals(14, radio.getToMaxStation());
        Assertions.assertEquals(0, radio.getToMinStation());
        Assertions.assertEquals(0, radio.getCurrentStation());
        Assertions.assertEquals(0, radio.Next(15));
        Assertions.assertEquals(8, radio.Next(7));
        Assertions.assertEquals(0, radio.Prev(16));
        Assertions.assertEquals(6, radio.Prev(7));
        Assertions.assertEquals(14, radio.setCurrentStation(-1));
        Assertions.assertEquals(0, radio.setCurrentStation(15));
        Assertions.assertEquals(5, radio.setCurrentStation(5));
    }


}
