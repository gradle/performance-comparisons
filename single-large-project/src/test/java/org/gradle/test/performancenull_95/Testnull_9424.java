package org.gradle.test.performancenull_95;

import static org.junit.Assert.*;

public class Testnull_9424 {
    private final Productionnull_9424 production = new Productionnull_9424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}