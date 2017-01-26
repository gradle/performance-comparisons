package org.gradle.test.performancenull_406;

import static org.junit.Assert.*;

public class Testnull_40582 {
    private final Productionnull_40582 production = new Productionnull_40582("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}