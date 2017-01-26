package org.gradle.test.performancenull_409;

import static org.junit.Assert.*;

public class Testnull_40880 {
    private final Productionnull_40880 production = new Productionnull_40880("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}