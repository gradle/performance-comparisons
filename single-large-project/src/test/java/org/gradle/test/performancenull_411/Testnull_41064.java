package org.gradle.test.performancenull_411;

import static org.junit.Assert.*;

public class Testnull_41064 {
    private final Productionnull_41064 production = new Productionnull_41064("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}