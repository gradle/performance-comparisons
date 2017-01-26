package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25547 {
    private final Productionnull_25547 production = new Productionnull_25547("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}