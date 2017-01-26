package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37943 {
    private final Productionnull_37943 production = new Productionnull_37943("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}