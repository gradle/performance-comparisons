package org.gradle.test.performancenull_354;

import static org.junit.Assert.*;

public class Testnull_35381 {
    private final Productionnull_35381 production = new Productionnull_35381("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}