package org.gradle.test.performancenull_315;

import static org.junit.Assert.*;

public class Testnull_31454 {
    private final Productionnull_31454 production = new Productionnull_31454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}