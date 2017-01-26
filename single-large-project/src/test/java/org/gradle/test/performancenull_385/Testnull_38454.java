package org.gradle.test.performancenull_385;

import static org.junit.Assert.*;

public class Testnull_38454 {
    private final Productionnull_38454 production = new Productionnull_38454("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}