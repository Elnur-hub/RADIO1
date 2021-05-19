package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetAmountOfStations() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(10, Radio.getMaxStation());
    }

    @Test
    void shouldInitRadioStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(4, Radio.getCurrentStation());
    }

    @Test
    void turnOnNextStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        Radio.nextStation();
        assertEquals(5, Radio.getCurrentStation());
    }

    @Test
    void turnOnPreviousStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        Radio.previousStation();
        assertEquals(3, Radio.getCurrentStation());
    }

    @Test
    void turnUpOverMaxStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(0, Radio.getMinStation());

    }

    @Test
    void turnOnNextAfterMaxStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(0, Radio.getMinStation());
    }

    @Test
    void turnDownFromMinStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(10, Radio.getMaxStation());

    }

    @Test
    void turnDownBelowMinStation() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(0, Radio.getMinStation());
    }

    @Test
    void turnUpVolumeForValidRange() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        Radio.turnUpVolume();
        assertEquals(21, Radio.getCurrentVolume());
    }

    @Test
    void turnDownVolumeForValidRange() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        Radio.turnDownVolume();
        assertEquals(19,Radio.getCurrentVolume());
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(20, Radio.getCurrentVolume());
    }

    @Test
    void turnDownVolumeBelowMinimum() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(0, Radio.getMinVolume());

    }

    @Test
    void turnUpVolumeOverMaximum() {
        Radio Radio = new Radio(4, 10, 0, 20, 100, 0);
        assertEquals(100, Radio.getMaxVolume());
    }


}