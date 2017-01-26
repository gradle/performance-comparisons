package org.gradle.test.performancenull_128;

import static org.junit.Assert.*;

public class Testnull_12782 {
    private final Productionnull_12782 production = new Productionnull_12782("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}