package org.gradle.test.performancenull_55;

import static org.junit.Assert.*;

public class Testnull_5496 {
    private final Productionnull_5496 production = new Productionnull_5496("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}