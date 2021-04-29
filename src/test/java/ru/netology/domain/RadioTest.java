package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void turnOnStation() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentStation());
        Radio.setCurrentStation(3);
        assertEquals(3, Radio.getCurrentStation());
    }

    @Test
    void turnOnNextStation() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentStation());
        Radio.nextStation();
        assertEquals(1, Radio.getCurrentStation());
    }

    @Test
    void turnOnPreviousStation() {
        Radio Radio = new Radio();
        Radio.setCurrentStation(3);
        assertEquals(3, Radio.getCurrentStation());
        Radio.previousStation();
        assertEquals(2, Radio.getCurrentStation());
    }

    @Test
    void turnUpOverMaxStation() {
        Radio Radio = new Radio();
        Radio.setCurrentStation(14);
        assertEquals(0, Radio.getCurrentStation());
        Radio.setCurrentStation(14);
        assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    void turnOnNextAfterMaxStation() {
        Radio Radio = new Radio();
        Radio.setCurrentStation(9);
        assertEquals(9, Radio.getCurrentStation());
        Radio.nextStation();
        assertEquals(0, Radio.getCurrentStation());
    }
    @Test
    void turnDownFromMinStation() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentStation());
        Radio.previousStation();
        assertEquals(9, Radio.getCurrentStation());
    }

    @Test
    void turnDownBelowMinStation() {
        Radio Radio = new Radio();
        Radio.setCurrentStation(-2);
        assertEquals(0, Radio.getCurrentStation());
        Radio.setCurrentStation(-2);
        assertEquals(0, Radio.getCurrentStation());
    }

    @Test
    void turnUpVolumeForValidRange() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentVolume());
        Radio.turnUpVolume();
        assertEquals(1, Radio.getCurrentVolume());
    }

    @Test
    void turnDownVolumeForValidRange() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(3);
        assertEquals(3, Radio.getCurrentVolume());
        Radio.turnDownVolume();
        assertEquals(2, Radio.getCurrentVolume());
    }

    @Test
    void turnDownVolumeBelowMinimum() {
        Radio Radio = new Radio();
        assertEquals(0, Radio.getCurrentVolume());
        Radio.turnDownVolume();
        assertEquals(0, Radio.getCurrentVolume());
    }

    @Test
    void turnUpVolumeOverMaximum() {
        Radio Radio = new Radio();
        Radio.setCurrentVolume(10);
        assertEquals(10, Radio.getCurrentVolume());
        Radio.turnUpVolume();
        assertEquals(10, Radio.getCurrentVolume());
    }


}
