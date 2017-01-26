package org.gradle.test.performancenull_16;

import static org.junit.Assert.*;

public class Testnull_1503 {
    private final Productionnull_1503 production = new Productionnull_1503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}