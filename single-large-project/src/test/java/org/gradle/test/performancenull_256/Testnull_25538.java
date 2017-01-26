package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25538 {
    private final Productionnull_25538 production = new Productionnull_25538("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}