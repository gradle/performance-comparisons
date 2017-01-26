package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12433 {
    private final Productionnull_12433 production = new Productionnull_12433("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}