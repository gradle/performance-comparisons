package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41095 {
    private final Productionnull_41095 production = new Productionnull_41095("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}