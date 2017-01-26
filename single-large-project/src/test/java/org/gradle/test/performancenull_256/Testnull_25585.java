package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25585 {
    private final Productionnull_25585 production = new Productionnull_25585("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}