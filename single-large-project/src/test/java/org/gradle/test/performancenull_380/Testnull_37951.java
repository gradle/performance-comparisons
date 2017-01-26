package org.gradle.test.performancenull_380;

import static org.junit.Assert.*;

public class Testnull_37951 {
    private final Productionnull_37951 production = new Productionnull_37951("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}