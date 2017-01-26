package org.gradle.test.performancenull_474;

import static org.junit.Assert.*;

public class Testnull_47400 {
    private final Productionnull_47400 production = new Productionnull_47400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}