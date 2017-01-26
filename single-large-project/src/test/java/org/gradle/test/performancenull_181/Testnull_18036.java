package org.gradle.test.performancenull_181;

import static org.junit.Assert.*;

public class Testnull_18036 {
    private final Productionnull_18036 production = new Productionnull_18036("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}