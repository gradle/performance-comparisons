package org.gradle.test.performancenull_75;

import static org.junit.Assert.*;

public class Testnull_7456 {
    private final Productionnull_7456 production = new Productionnull_7456("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}