package org.gradle.test.performancenull_336;

import static org.junit.Assert.*;

public class Testnull_33503 {
    private final Productionnull_33503 production = new Productionnull_33503("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}