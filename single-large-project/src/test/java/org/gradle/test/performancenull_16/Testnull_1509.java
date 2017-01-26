package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1509 {
    private final Productionnull_1509 production = new Productionnull_1509("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}