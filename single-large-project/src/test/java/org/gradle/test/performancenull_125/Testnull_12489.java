package org.gradle.test.performancenull_125;

import static org.junit.Assert.*;

public class Testnull_12489 {
    private final Productionnull_12489 production = new Productionnull_12489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}