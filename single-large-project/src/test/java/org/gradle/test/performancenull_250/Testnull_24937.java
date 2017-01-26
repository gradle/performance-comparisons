package org.gradle.test.performancenull_250;

import static org.junit.Assert.*;

public class Testnull_24937 {
    private final Productionnull_24937 production = new Productionnull_24937("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}