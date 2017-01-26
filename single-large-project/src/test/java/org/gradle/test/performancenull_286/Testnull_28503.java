package org.gradle.test.performancenull_286;

import static org.junit.Assert.*;

public class Testnull_28503 {
    private final Productionnull_28503 production = new Productionnull_28503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}