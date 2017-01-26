package org.gradle.test.performancenull_207;

import static org.junit.Assert.*;

public class Testnull_20690 {
    private final Productionnull_20690 production = new Productionnull_20690("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}