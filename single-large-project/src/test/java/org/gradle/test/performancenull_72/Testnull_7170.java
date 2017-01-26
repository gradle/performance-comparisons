package org.gradle.test.performancenull_72;

import static org.junit.Assert.*;

public class Testnull_7170 {
    private final Productionnull_7170 production = new Productionnull_7170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}