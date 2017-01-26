package org.gradle.test.performancenull_124;

import static org.junit.Assert.*;

public class Testnull_12387 {
    private final Productionnull_12387 production = new Productionnull_12387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}