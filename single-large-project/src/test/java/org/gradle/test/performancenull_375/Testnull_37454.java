package org.gradle.test.performancenull_375;

import static org.junit.Assert.*;

public class Testnull_37454 {
    private final Productionnull_37454 production = new Productionnull_37454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}