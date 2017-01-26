package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41068 {
    private final Productionnull_41068 production = new Productionnull_41068("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}