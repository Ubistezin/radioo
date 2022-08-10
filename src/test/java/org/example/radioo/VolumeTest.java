package org.example.radioo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VolumeTest {

    @Test
    public void test3() {
        Volume volume = new Volume(1);
        Assertions.assertEquals(1, volume.getCurrentVolume());
        Assertions.assertEquals(100, volume.getToMaxVolume());
        Assertions.assertEquals(0, volume.getToMinVolume());
        Assertions.assertEquals(15, volume.increaseVolume(14));
        Assertions.assertEquals(0, volume.increaseVolume(101));
        Assertions.assertEquals(44, volume.decreaseVolume(45));
        Assertions.assertEquals(0, volume.decreaseVolume(101));
        Assertions.assertEquals(100, volume.setCurrentVolume(101));
        Assertions.assertEquals(0, volume.setCurrentVolume(-1));
        Assertions.assertEquals(14, volume.setCurrentVolume(14));



    }
}
