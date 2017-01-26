package org.gradle.test.performancenull_25;

import static org.junit.Assert.*;

public class Testnull_2489 {
    private final Productionnull_2489 production = new Productionnull_2489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}