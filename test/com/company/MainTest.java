package com.company;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void getData() {
        ArrayList<String> b = new ArrayList<>();
        b.add("test");
        assertFalse(b.isEmpty());
    }
}