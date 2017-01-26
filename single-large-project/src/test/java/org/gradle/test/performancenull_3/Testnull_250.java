package org.gradle.test.performancenull_3;

import static org.junit.Assert.*;

public class Testnull_250 {
    private final Productionnull_250 production = new Productionnull_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}