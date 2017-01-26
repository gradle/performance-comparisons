package org.gradle.test.performancenull_256;

import static org.junit.Assert.*;

public class Testnull_25503 {
    private final Productionnull_25503 production = new Productionnull_25503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}